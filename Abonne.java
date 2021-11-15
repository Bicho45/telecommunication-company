package td4.ex1;

public class Abonne {
    private int numero;
    private String adresse,nom;
    private static int nbab=0;

    public Abonne(String adresse, String nom) {
        this.adresse = adresse;
        this.nom = nom;
        numero=++nbab;
    }
    public Abonne(Abonne a){
    this(a.adresse,a.nom);
    }

    public int getNumero() {
        return numero;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "{"+ nom  + numero + ", " + adresse + ", " +  '}';
    }
}