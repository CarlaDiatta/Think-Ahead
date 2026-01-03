package modele;

public class Case {

    private int valeur;          
    private Position position;   
    private boolean jouee;   

    public Case(int valeur, Position position) {
        this.valeur = valeur;
        this.position = position;
        this.jouee = false;
    }

    public int getValeur() {
        return valeur;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isJouee() {
        return jouee;
    }

    public void setJouee(boolean jouee) {
        this.jouee = jouee;
    }

    public boolean estLibre() {
        return !jouee;
    }
}
