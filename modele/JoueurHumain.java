package modele;

import java.util.Scanner;

public class JoueurHumain extends Joueur {

    private Scanner sc;

    public JoueurHumain(String nom) {
        super(nom);
        sc = new Scanner(System.in);
    }

    @Override
    public Coup choisirCoup(AlignmentCases alignement) {

        Case caseChoisie = demanderCaseUtilisateur(alignement);

        Orientation orientation = alignement.getOrientation();

        return new Coup(this, caseChoisie, orientation);
    }

    // Demande à l'utilisateur quelle case il veut jouer
    private Case demanderCaseUtilisateur(AlignmentCases alignement) {
        Case caseChoisie = null;

        while (caseChoisie == null) {
            System.out.println("Cases disponibles : ");
            for (Case c : alignement.getCasesLibres()) {
                System.out.print(c.getPosition() + "(" + c.getValeur() + ") ");
            }
            System.out.println("\nEntrez la ligne et la colonne de votre choix (ex: 2 3) : ");

            int ligne = sc.nextInt();
            int colonne = sc.nextInt();

            for (Case c : alignement.getCasesLibres()) {
                if (c.getPosition().getLigne() == ligne && c.getPosition().getColonne() == colonne) {
                    caseChoisie = c;
                    break;
                }
            }

            if (caseChoisie == null) {
                System.out.println("Case invalide. Réessayez.");
            }
        }

        return caseChoisie;
    }
}
