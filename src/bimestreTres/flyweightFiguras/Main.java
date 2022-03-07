package bimestreTres.flyweightFiguras;

public class Main {

    //lista de colores permitidos
    private static final String colores[] = {"Rojo","Azul","Verde","Negro"};

    public static void main(String[] args) {

        for (int i = 0; i< 100 ; i++){
            //El objeto lo crea la fabrica
            Circulo circulo = FlyweightFactory.obtenerCirculo(getRandomColor());
            //setear atributos en tiempo de ejecucion, el color esta compartido el radio no
            //si tenemos muchos atributos se complica
            circulo.setRadio(i + 5);//valor solamente
            circulo.setTamaño("tamaño "+ i * 2); //seteamos tamaño

            circulo.dibujar();
        }
    }

    private static String getRandomColor(){
        return colores[(int)(Math.random()*colores.length)];
    }
}
