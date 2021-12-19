package stateTamagotchi;

public class Aburrido implements State {
    private Tamagotchi tamagotchi; //un tamagotchi que va a estar asociado a este estado

    @Override
    public void jugar() {
        System.out.println("Estoy aburrido juguemooosss uwu");
        tamagotchi.setState(new Cansado());
    }

    @Override
    public void alimentar() {
        System.out.println("Estoy aburrido no tengo hambre");
    }

    @Override
    public void dormir() {
        System.out.println("Estoy aburrido no quiero dormir");
    }

    @Override
    public void comoEstas() {
        System.out.println("Estoy aburrido quiero jugar");
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi=tamagotchi;       //la variable de arriba guarda la referencia que le estamos pasando
    }
}
