package strategyVacuna;

public class Vacuna {
   private EstrategiaVacuna vacuna;

    public Vacuna(EstrategiaVacuna vacuna) {
        this.vacuna = vacuna;
    }

    public void vacunar(Persona p){
       vacuna.vacunar(p);
   }

}
