package stateTamagotchi;

import java.util.Timer;
import java.util.TimerTask;

public class Durmiendo implements State {
    private Tamagotchi tamagotchi;
    @Override
    public void jugar() {
        System.out.println("Durmiendo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Durmiendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Durmiendo...");
    }

    @Override
    public void comoEstas() {
        System.out.println("Durmiendo...");
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi=tamagotchi;

        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Durmiendo.this.tamagotchi.setState(new Hambriento());
            }
        },3000);
    }
}
