package strategyRecorrido;

public class Main {
    public static void main(String[] args) {
        Punto origen= new Punto(10,7);
        Punto destino= new Punto(8,4);
        Transporte t1= new Transporte(new Caminar());
        System.out.println(t1.calcularMinutos(origen,destino));
    }
}
