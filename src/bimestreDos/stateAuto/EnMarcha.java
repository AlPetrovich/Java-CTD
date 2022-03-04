package stateAuto;

public class EnMarcha implements StateAuto{
    private Auto v;
    private final int VELOCIDAD_MAXIMA=200;

    public EnMarcha(Auto v) {
        this.v = v;
    }

    @Override
    public void acelerar() {
        if (v.getCombustibleActual()>0){
            if (v.getVelocidadActual()>=VELOCIDAD_MAXIMA){
                System.out.println("Error: el auto alcanzo su velocidad maxima");
                v.modificarCombustible(-10);
            }else{
                v.modificarVelocidad(10);
                v.modificarCombustible(-10);
            }
        }else{
            //SIN COMBUSTIBLE
            v.setEstado(new SinNafta(v));
            System.out.println("El auto no tiene combustible");
        }
    }

    @Override
    public void contacto() {
        System.out.println("Error, no se puede cortar el contacto en marcha");
    }

    @Override
    public void frenar() {
        v.modificarVelocidad(-10);
        if (v.getVelocidadActual()<=0){
            //ESTADO PARADO
            v.setEstado(new Parado(v));
            System.out.println("El auto ahora esta parado");
        }
    }
}
