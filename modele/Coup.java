package modele;

import java.util.LinkedList;

public class Coup {
    private Joueur joueur;
    private Case caseChoisie;
    private Orientation orientation;
    private LinkedList<Coup> coupsJoues;
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
    public LinkedList<Coup> getCoupsJoues() {
        return coupsJoues;
    }


}
