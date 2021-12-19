package stateAuto;

public class SinNafta implements StateAuto{
    private Auto v;

    public SinNafta(Auto v) {
        this.v = v;
    }

    @Override
    public void acelerar() {
        System.out.println("Error no tiene nafta");
    }

    @Override
    public void contacto() {
        System.out.println("Error no tiene nafta");
    }

    @Override
    public void frenar() {
        System.out.println("Error no tiene nafta");
    }
}
