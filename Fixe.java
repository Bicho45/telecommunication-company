package td4.ex1;

public class Fixe extends Ligne{
    private String locationGeo;

    public Fixe(String locationGeo, int numero, Abonne ab) {
        super(numero, ab);
        this.locationGeo = locationGeo;
    }

    public String getLocationGeo() {
        return locationGeo;
    }

    public void setLocationGeo(String locationGeo) {
        this.locationGeo = locationGeo;
    }

    @Override
    public String toString() {
        return "Fixe:" + super.toString()+" ,"+ locationGeo + '}';
    }
}