package modele;

public class Grille {
    private int taille;
    private int[][] cases;

    public Grille(Object tailleGrille) {
        this.taille = (int) tailleGrille; // taille définie par l'utilisateur
        this.cases = new int[taille][taille];
    }
    public int[][] getCases(){
        return cases;
    }
    public  int getTaille(){
        return taille;
    }
    public void donnerPosition(int x, int y, int valeur){
        cases[x][y] = valeur;
    }
    public void extraireLigne(int ligne){
        for (int j = 0; j < taille; j++) {
            System.out.print(cases[ligne][j] + " ");
        }
        System.out.println();
    }
    public void extraireColonne(int colonne){
        for (int i = 0; i < taille; i++) {
            System.out.print(cases[i][colonne] + " ");
        }
        System.out.println();
    }
    public void  verfierCase(int x, int y){
        if(cases[x][y] != 0){
            System.out.println("La case est déjà occupée.");
        } else {
            System.out.println("La case est libre.");
        }
    }
    public void fournirLigne(int ligne){
        for (int j = 0; j < taille; j++) {
            System.out.print(cases[ligne][j] + " ");
        }
        System.out.println();
    }
    public void fournirColonne(int colonne){
        for (int i = 0; i < taille; i++) {
            System.out.print(cases[i][colonne] + " ");
        }
        System.out.println();
    }

    public boolean estJouer() { 
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (cases[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
