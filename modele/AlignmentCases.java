package modele;

import java.util.LinkedList;

public class AlignmentCases {

    private LinkedList<Case> cases;
    private Orientation orientation;

    public AlignmentCases(LinkedList<Case> cases, Orientation orientation) {
        this.cases = cases;
        this.orientation = orientation;
    }

    public LinkedList<Case> getCases() {
        return cases;
    }

    public boolean contient(Case c) {
        return cases.contains(c);
    }

    public LinkedList<Case> getCasesLibres() {
        LinkedList<Case> libres = new LinkedList<>();

        for (Case c : cases) {
            if (c.estLibre()) {
                libres.add(c);
            }
        }
        return libres;
    }

    public boolean estJouable() {
        return !getCasesLibres().isEmpty();
    }

    public Orientation getOrientation() {
        return orientation;
    }
}
