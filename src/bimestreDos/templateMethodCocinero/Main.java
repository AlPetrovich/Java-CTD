package templateMethodCocinero;

public class Main {
    public static void main(String[] args) {
        Cocinero coV= new CoineroVeggie();
        Cocinero voNV= new CocineroNoVeggie();
        coV.hacerPizza();
        voNV.hacerPizza();
    }
}
