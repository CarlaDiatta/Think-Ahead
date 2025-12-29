 package modele;

import java.util.LinkedList;
import java.util.Random;

class Partie {

    private Grille  grille;
    private Joueur joueur1;
    private Joueur joueur2;
    private Joueur joueurCourant;
    private LinkedList<Coup> coupsJoues;
    private AlignmentCases alignementActif;
    private int scoreJoueur1;
    private int scoreJoueur2;

        public Partie(Joueur j1, Joueur j2, int tailleGrille) {
        this.joueur1 = j1;
        this.joueur2 = j2;
        this.joueurCourant = j1; 
        this.grille = new Grille(tailleGrille);
        this.coupsJoues = new LinkedList<>();
        this.scoreJoueur1 = 0;
        this.scoreJoueur2 = 0;
        this.alignementActif = null; 
    }
    public Grille getGrille() {
        return grille;
    }
    public Joueur getJoueur1() {
        return joueur1;
    }
    public Joueur getJoueur2() {
        return joueur2;
    }
    public Joueur getJoueurCourant() {
        return joueurCourant;
    }
    public LinkedList<Coup> getCoupsJoues() {
        return coupsJoues;
    }
    public AlignmentCases getAlignementActif() {
        return alignementActif;
    }
    public int getScoreJoueur1() {
        return scoreJoueur1;
    }
    public int getScoreJoueur2() {
        return scoreJoueur2;
    }

    public void  demarrerPartie() {
        Object tailleGrille = null;
        this.grille= new Grille(tailleGrille);
        Random rand = new Random();
        if (rand.nextBoolean()) {
            this.joueurCourant = joueur1;
        } else {
            this.joueurCourant = joueur2;
        }
        this.coupsJoues.clear();
        this.alignementActif = null;
        this.scoreJoueur1 = 0;
        this.scoreJoueur2 = 0;
    }

    public void changerJoueur() {
        if (joueurCourant == joueur1) {
            joueurCourant = joueur2;
        } else {
            joueurCourant = joueur1;
        }
    }

    public void jouerCoup(Coup coup) {
        coupsJoues.add(coup);
    }
    public void annuerDernierCoup() {
        if (!coupsJoues.isEmpty()) {
            coupsJoues.removeLast();
            changerJoueur();
        }
    }
    public void coupValide(Coup coup) {
        if(!getCoupsJoues().contains(coup)) {
            jouerCoup(coup);
            changerJoueur();
        }
    }
    public void partieTerminee() {
        if(grille.estJouer()) {
            System.out.println("La partie est terminée.");
        }
        else {
            System.out.println("La partie n'est pas encore terminée.");
        }
    }
    public void getScore(Joueur joueur) {
        if(joueur == joueur1) {
            System.out.println("Score de " + joueur1 + ": " + scoreJoueur1);
        }
        else if(joueur == joueur2) {
            System.out.println("Score de " + joueur2+ ": " + scoreJoueur2);
        }
        else {
            System.out.println("Joueur non reconnu.");
        }
    }
    public void setAlignementActif(AlignmentCases alignementActif) {
        this.alignementActif = alignementActif;
    }
    public Orientation getOrientationActive() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrientationActive'");
    }
}