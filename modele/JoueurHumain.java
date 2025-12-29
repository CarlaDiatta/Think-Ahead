package modele;

public class JoueurHumain extends Joueur {
    public JoueurHumain(String nom) {
        super(nom);
    }

 @Override
  public Coup choisirCoup(Partie partie) {
  Case caseChoisie = demanderCaseUtilisateur(partie);

    Orientation orientation = partie.getOrientationActive();

    return new Coup(this, caseChoisie, orientation);

    }

 private Case demanderCaseUtilisateur(Partie partie) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'demanderCaseUtilisateur'");
 }

    
}
