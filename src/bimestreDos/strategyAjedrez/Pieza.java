package strategyAjedrez;

public class Pieza {
    private String nombre;
    private EstrategiaMovimiento estrategia;

    public Pieza(String nombre){
        this.nombre=nombre;
        if (nombre.equals("Peon")){
            estrategia=new MoverPeon();
        }
        if (nombre.equals("Caballo")){
            estrategia= new MoverCaballo();
        }
    }

    public void mover(){
        estrategia.mover();
    }
}
