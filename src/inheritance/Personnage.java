package inheritance;

// Une classe abstraite est une classe qui ne peut avoir d'instance
public abstract class Personnage {
    private String nom;
    private int dureeDeVie;

    public Personnage(String nom, int dureeDeVie) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    public abstract void rencontrer();

    public final void chanter(){
        System.out.println("J'aime chanter");
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", dureeDeVie=" + dureeDeVie +
                '}';
    }
}
