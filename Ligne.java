package td4.ex1;

abstract public class Ligne {
    protected int numero;
    protected Abonne ab;

    public Ligne(int numero, Abonne ab) {
        this.numero = numero;
        this.ab = new Abonne(ab);
    }

    public int getNumero() {
        return numero;
    }

    public Abonne getAb() {
        return ab;
    }

    @Override
    public String toString() {
        return "{" +  numero + ", " + ab + '}';
    }
}