package modele;

abstract class Joueur {
    private String nom;
    private String score;
    public Joueur(String nom) {
        this.nom = nom;
        this.score = "0";
    }
    public String getNom() {
        return nom;
    }
    public String getScore() {
        return score;
    }
    public abstract Coup choisirCoup(Partie partie);


}
