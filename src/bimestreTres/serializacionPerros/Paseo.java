package bimestreTres.serializacionPerros;

import java.io.*;
import java.util.ArrayList;

public class Paseo {
    public static void main(String[] args) {

        Perro p1 = new Perro("Firu","Doberman",7,"dir 1");
        Perro p2 = new Perro("Fido","Ovejero",3,"dir 2");
        Perro p3 = new Perro("Toby","Coker",5,"dir 3");
        Perro p4 = new Perro("Max","Pitbull",9,"dir 4");

        ArrayList<Perro> lunes = new ArrayList<Perro>();
        ArrayList<Perro> martes = new ArrayList<Perro>();
        ArrayList<Perro> miercoles = new ArrayList<Perro>();
        ArrayList<Perro> jueves = new ArrayList<Perro>();
        ArrayList<Perro> viernes = new ArrayList<Perro>();

        //perro 1
        lunes.add(p1);
        miercoles.add(p1);
        viernes.add(p1);
        //perro 2
        lunes.add(p2);
        martes.add(p2);
        miercoles.add(p2);
        jueves.add(p2);
        //perro 3
        miercoles.add(p3);
        jueves.add(p3);
        viernes.add(p3);
        //perro 4
        lunes.add(p4);
        martes.add(p4);
        miercoles.add(p4);
        jueves.add(p4);
        viernes.add(p4);

        try {
            FileOutputStream fil = new FileOutputStream("perros.dat");
            //objeto de salida
            ObjectOutputStream archi = new ObjectOutputStream(fil);

            //1 array
            archi.writeObject(lunes);
            archi.writeObject(martes);
            archi.writeObject(miercoles);
            archi.writeObject(jueves);
            archi.writeObject(viernes);

            archi.close();
            //abrirlo leerlo y listarlo
            FileInputStream filInput = new FileInputStream("perros.dat");
            ObjectInputStream archiInput = new ObjectInputStream(filInput);
            //lectura del archivo
            ArrayList<Perro> dia;

            for(int i = 0; i < 5; i++){
                System.out.println("Dia: "+ i);
                System.out.println("-----------------");
                //casteo ya que dia no es un objeto, es array
                dia =(ArrayList<Perro>) archiInput.readObject();
                for( Perro p : dia){
                    System.out.println(p);
                }
            }

            archiInput.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
