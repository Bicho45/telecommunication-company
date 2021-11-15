package td4.ex1;

public class Service {
    protected int numero;
    protected String desc;
    protected double prixUnitaire;

    public Service(int numero, String desc, double prixUnitaire) {
        this.numero = numero;
        this.desc = desc;
        this.prixUnitaire = prixUnitaire;
    }
    public Service(Service s){
    this(s.numero,s.desc,s.prixUnitaire);
    }

    public int getNumero() {
        return numero;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    @Override
    public String toString() {
        return "{"  + numero + ", " + desc + ", " + prixUnitaire + '}';
    }
}