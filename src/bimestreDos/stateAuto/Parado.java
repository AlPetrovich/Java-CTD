package stateAuto;

public class Parado implements StateAuto {
    private Auto v;

    public Parado(Auto v) {
        this.v = v;
    }

    @Override
    public void acelerar() {
    //Comprobamos que el auto tenga combustible
        if (v.getCombustibleActual()>0){
            //El auto se pone EN MARCHA
            v.setEstado(new EnMarcha(v));
        }
    }

    @Override
    public void contacto() {
        //El auto pasa a estado APAGADO
        v.setEstado(new Apagado(v));
        System.out.println("El auto esta ahora apagado");
    }

    @Override
    public void frenar() {
        System.out.println("Error el auto esta detenido");
    }
}
