package stateTamagotchi;

public interface State {
    void jugar();
    void alimentar();
    void dormir();
    void comoEstas();
    void setTamagotchi(Tamagotchi tamagotchi); //Metodo para cambiar el estado del tamagotchi
}
