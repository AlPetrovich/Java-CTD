package stateTamagotchi;

public class Main {
    public static void main(String[] args) {
        Tamagotchi t1= new Tamagotchi();
        t1.setState(new Aburrido());
        t1.comoEstas();
        t1.jugar();
        t1.comoEstas();
        t1.dormir();
        t1.comoEstas();
    }
}
