package strategyVacuna;

public class Pfizer implements EstrategiaVacuna{
    private final String ORIGEN="EEUU";
    private final int CANTDOSIS=2;


    @Override
    public void vacunar(Persona p) {
        if (p.cantidadDosisDadas()<2){
            p.incrementarDosis();
            if (p.cantidadDosisDadas()==2){
                System.out.println("El paciente "+p.getNombre()+" ya esta totalmente vacunado con "+ this.getClass().getSimpleName());
            }else{
                System.out.println("Al paciente "+p.getNombre()+" le falta una dosis de "+ this.getClass().getSimpleName());
            }
        }else{
            System.out.println("El paciente "+ p.getNombre()+ "ya esta totalmente vacunado con "+ this.getClass().getSimpleName());
        }
    }
}
