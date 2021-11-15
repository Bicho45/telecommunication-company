package td4.ex1;

public class Mobile extends Ligne{
    private String reseau;

    public Mobile(String reseau, int numero, Abonne ab) {
        super(numero, ab);
        this.reseau = reseau;
    }

    public String getReseau() {
        return reseau;
    }

    @Override
    public String toString() {
        return "Mobile:" + super.toString()+" ,"+ reseau + '}';
    }
}