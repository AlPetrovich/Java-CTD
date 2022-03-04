package stateTamagotchi;

public class Hambriento implements State {
    private Tamagotchi tamagotchi;
    @Override
    public void jugar() {
        System.out.println("Tengo hambre no quiero jugar");
    }

    @Override
    public void alimentar() {
        System.out.println("Tengo una lija comamos");
    }

    @Override
    public void dormir() {
        System.out.println("No quiero dormir tengo hambre");
    }

    @Override
    public void comoEstas() {
        System.out.println("Hambriento");
        tamagotchi.setState(new Aburrido());
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi=tamagotchi;
    }
}
