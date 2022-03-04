package stateTamagotchi;

public class Cansado implements State{
    private Tamagotchi tamagotchi;

    @Override
    public void jugar() {
        System.out.println("Estoy cansado no quiero jugar");
    }

    @Override
    public void alimentar() {
        System.out.println("Estoy cansado quiero dormir");
    }

    @Override
    public void dormir() {
        System.out.println("Durmiendo buenas noches");
        tamagotchi.setState(new Durmiendo());
    }

    @Override
    public void comoEstas() {
        System.out.println("Tengo sueño");
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi=tamagotchi;
    }
}
