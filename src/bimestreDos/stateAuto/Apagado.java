package stateAuto;

public class Apagado implements StateAuto{
    //Referencia a la clase de contexto
    private Auto v;

    //Constructor que inyecta la dependencia en la clase actual
    public Apagado(Auto v) {
        this.v = v;
    }

    @Override
    public void acelerar() {
        System.out.println("Error: el auto esta apagado, efectue contacto");
    }

    @Override
    public void contacto() {
        if (v.getCombustibleActual()>0){
            //El auto pasa a estado PARADO
            v.setEstado(new Parado(v));
            System.out.println("El auto esta ahora PARADO");
            v.setVelocidadActual(0);
        }else{
            //estado SIN NAFTA
            v.setEstado(new SinNafta(v));
            System.out.println("El auto esta sin combustible");
        }
    }

    @Override
    public void frenar() {
        System.out.println("Error: el auto esta apagado efectue contacto");
    }
}
