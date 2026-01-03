package modele;

public class Coup {

    private Joueur joueur;
    private Case caseChoisie;
    private Orientation orientation;

    
    public Coup(Joueur joueur, Case caseChoisie, Orientation orientation) {
        this.joueur = joueur;
        this.caseChoisie = caseChoisie;
        this.orientation = orientation;
    }

    
    public Joueur getJoueur() {
        return joueur;
    }

    public Case getCaseChoisie() {
        return caseChoisie;
    }

    public Orientation getOrientation() {
        return orientation;
    }
}
