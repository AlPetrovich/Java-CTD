package singleton;

public class Main {
    public static void main(String[] args) {
        Logger lg1= Logger.getInstance();
        Logger lg2= Logger.getInstance();

        lg1.setMsj("hola");
        System.out.println(lg2.getMsj());
    }
}
