package td4.ex1;

public class Internet extends Service{
    private String ISP;

    public Internet(String ISP, int numero, String desc, double prixUnitaire) {
        super(numero, desc, prixUnitaire);
        this.ISP = ISP;
    }
    public Internet(Internet i){
    this(i.ISP,i.numero,i.desc,i.prixUnitaire);
    }

    public String getISP() {
        return ISP;
    }

    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    @Override
    public String toString() {
        return "Internet:{" +super.toString()+", " + ISP +'}';
    }
}