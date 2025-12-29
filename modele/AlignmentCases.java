package modele;

import java.util.LinkedList;

public class AlignmentCases {
 private LinkedList<Case> cases;

public AlignmentCases(LinkedList<Case> cases) {
    this.cases = cases;
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


}
