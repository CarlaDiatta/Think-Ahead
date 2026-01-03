package modele;

public abstract class Joueur {

    private String nom;
    private int score;

    public Joueur(String nom) {
        this.nom = nom;
        this.score = 0;
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public void ajouterScore(int points) {
        this.score += points; 
    }

   
    public abstract Coup choisirCoup(AlignmentCases alignement);

}
