package strategyVacuna;

public class Cansino implements EstrategiaVacuna{
    private final String ORIGEN="China";
    private final int CANTDOSIS=1;

    @Override
    public void vacunar(Persona p) {
        if(p.cantidadDosisDadas()<1){
            p.incrementarDosis();
            System.out.println("El paciente: "+ p.getNombre()+" ya esta vacunado con la monodosis de "+ this.getClass().getSimpleName());
        }else{
            System.out.println("El paciente: "+ p.getNombre()+ "ya se vacuno con "+ this.getClass().getSimpleName());
        }
    }
}
