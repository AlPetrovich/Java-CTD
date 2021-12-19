package observerIdol;

public class Main {
    public static void main(String[] args) {
        Idol korean= new Idol();
        Fan fan1= new Fan("Garcia","Pedro",0);
        Fan fan2= new Fan("Garcia","Juana",2);

        korean.agregar(fan1);
        korean.agregar(fan2);

        korean.transmitir();
        korean.finalizarTransmision();
    }
}
