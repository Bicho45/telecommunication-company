package td4.ex1;

public class CommunicationVocal extends Service{

    public CommunicationVocal(int numero, String desc, double prixUnitaire) {
        super(numero, desc, prixUnitaire);
    }

    @Override
    public String toString() {
        return "CommunicationVocal{" +super.toString()+ '}';
    }
}