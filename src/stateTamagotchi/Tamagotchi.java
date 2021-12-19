package stateTamagotchi;

public class Tamagotchi {
    private State estado;

    public Tamagotchi(){
        setState(new Aburrido());
    }

    public void setState(State estado){   //recibe un stado
        this.estado=estado;               //este estado se almacena en la var privada estado
        this.estado.setTamagotchi(this);  //hay que decir el estado que esta aputando este tamagotchi
    }
    public void alimentar(){
        this.estado.alimentar();
    }
    public void dormir(){
        this.estado.dormir();
    }
    public void jugar(){
        this.estado.jugar();
    }
    public void comoEstas(){
        this.estado.comoEstas();
    }
}
