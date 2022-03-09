package bimestreTres.flyweightComputadoras;

public class Main {

    static int CANVAS_SIZE = 500;
    public static void main(String[] args) {
        ComputadoraFactory computerFactory = new ComputadoraFactory();
        Computadora mac1 = computerFactory.getComputadora(16,500);
        Computadora win = computerFactory.getComputadora(2,256);
        Computadora mac2 = computerFactory.getComputadora(16,500);

        System.out.println(mac1.toString());
        System.out.println(win.toString());
        System.out.println(mac2.toString());
    }
}
