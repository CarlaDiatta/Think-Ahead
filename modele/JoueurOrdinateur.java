package modele;

import java.util.LinkedList;
import java.util.Random;

public class JoueurOrdinateur extends Joueur {

    private int strategie;
    private Random rand;

    public JoueurOrdinateur(String nom, int strategie) {
        super(nom);
        this.strategie = strategie;
        this.rand = new Random();
    }

    @Override
    public Coup choisirCoup(AlignmentCases alignement) {
       
        LinkedList<Case> libres = alignement.getCasesLibres();
        Case caseChoisie = null;

        switch (strategie) {
            case 1:
                
                caseChoisie = choisirAuHasard(libres);
                break;
            case 2:
                
                caseChoisie = choisirMax(libres);
                break;
            
            default:
                caseChoisie = choisirAuHasard(libres);
        }

        
        return new Coup(this, caseChoisie, alignement.getOrientation());
    }

   
    private Case choisirAuHasard(LinkedList<Case> libres) {
        int index = rand.nextInt(libres.size());
        return libres.get(index);
    }

   
    private Case choisirMax(LinkedList<Case> libres) {
        Case maxCase = libres.getFirst();
        for (Case c : libres) {
            if (c.getValeur() > maxCase.getValeur()) {
                maxCase = c;
            }
        }
        return maxCase;
    }
}

