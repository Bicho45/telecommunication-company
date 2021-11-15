package td4.ex1;

public class Consommation {
    private Ligne ligne;
    private int month,annee,nbUnites;
    private Service s;

    public Consommation(Ligne ligne,int month, int annee, int nbUnites, Service s) {
        this.ligne = ligne;
        this.month = month;
        this.annee = annee;
        this.nbUnites = nbUnites;
        this.s = s;
    }

    public Ligne getLigne() {
        return ligne;
    }

    public int getMois() {
        return month;
    }

    public int getAnnee() {
        return annee;
    }

    public int getNbUnites() {
        return nbUnites;
    }

    public Service getS() {
        return s;
    }
    
    private double facture(){
    return nbUnites*s.prixUnitaire;
    }

    @Override
    public String toString() {
        return "Consommation:{" + 
                 ligne + ", \n month=" + month + ", \n year=" + annee + ", \n nbUnites=" + nbUnites + ", \n service=" + s + '}';
    }
}