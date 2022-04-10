package bimestreTres.serializacionContactos;

import bimestreTres.serializacionPerros.Perro;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Persona contacto1 = new Persona("Juan","mail1","31298367");
        Persona contacto2 = new Persona("Luis","mail2","399999967");
        Persona contacto3 = new Persona("Marcos","mail3","31898888");
        Persona contacto4 = new Persona("Pedro","mail4","3121333333");

        ArrayList<Persona> contactos = new ArrayList<>();
        contactos.add(contacto1);
        contactos.add(contacto2);
        contactos.add(contacto3);
        contactos.add(contacto4);

        //Serializar : Crear el objeto de salida
        try {
            FileOutputStream fil = new FileOutputStream("contacto.txt");
            ObjectOutputStream archivo = new ObjectOutputStream(fil);

            archivo.writeObject(contactos);
            archivo.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //DEserializar : crear el objeto de Entrada
        try{
            FileInputStream filin = new FileInputStream("contacto.txt");
            ObjectInputStream archi = new ObjectInputStream(filin);
            ArrayList<Persona> cont;
            cont = (ArrayList<Persona>) archi.readObject();



        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Crear un ForEach para imprimir los contactos
        for (Persona c : contactos){
            System.out.println(c);
        }

    }
}

