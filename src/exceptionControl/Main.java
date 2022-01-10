package exceptionControl;

public class Main {
    public static void main(String[] args) {
        Cliente alex = new Cliente("Alexis","Petro","432432",100,1200);

        try {
            alex.comprar(500);
        }catch (ClienteException e){
            System.err.println(e.getMessage());
        }
        System.out.println("deuda "+ alex.getDeuda());
        try {
            alex.comprar(701);
        }catch (ClienteException e){
            System.err.println(e.getMessage()+"se");
        }
        System.out.println("deuda "+ alex.getDeuda());

        try {
            alex.saldarDeuda(500);
        }catch (ClienteException e){
            System.err.println(e.getMessage());
        }
    }
}
