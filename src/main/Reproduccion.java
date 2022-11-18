package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Reproduccion {
    public String CancionElegida;
    ArrayList<String> Cancion1 = new ArrayList<String>();
    ArrayList<String> Cancion2 = new ArrayList<String>();
    ArrayList<String> Cancion3 = new ArrayList<String>();
    ArrayList<String> Cancion4 = new ArrayList<String>();
    ArrayList<String> Cancion5 = new ArrayList<String>();
    ArrayList<String> Canciones = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);

    public void ListaReproduccion() {
        Cancion1.add("Radioactive");
        Cancion1.add("3:05");
        Cancion1.add("Imagine Dragons");
        Cancion1.add("Pop");

        Cancion2.add("The Nights");
        Cancion2.add("2:55");
        Cancion2.add("Avicii");
        Cancion2.add("Electronica");

        Cancion3.add("La Dificil");
        Cancion3.add("2:42");
        Cancion3.add("Bad Bunny");
        Cancion3.add("Trap");

        Cancion4.add("A Sky Full of Stars");
        Cancion4.add("4:27");
        Cancion4.add("Coldplay");
        Cancion4.add("Pop");

        Cancion5.add("Waiting For Love");
        Cancion5.add("3:50");
        Cancion5.add("Avicii");
        Cancion5.add("Electronica");

        System.out.println(Cancion1);
        System.out.println(Cancion2);
        System.out.println(Cancion3);
        System.out.println(Cancion4);
        System.out.println(Cancion5);
    }

    public void escucharCancion() {
        System.out.println("\nQue cancion desea escuchar");
        System.out.println("1. Radioactive");
        System.out.println("2. The Nights");
        System.out.println("3. La Dificil");
        System.out.println("4. A Sky Full of Stars");
        System.out.println("5. Waiting For Love");
        int option = scan.nextInt();
        if (option == 1) {
            System.out.println("Esta escuchando: " + Cancion1);
        } else if (option == 2) {
            System.out.println("Esta escuchando: " + Cancion2);
        } else if (option == 3) {
            System.out.println("Esta escuchando: " + Cancion3);
        } else if (option == 4) {
            System.out.println("Esta escuchando: " + Cancion4);
        } else if (option == 5) {
            System.out.println("Esta escuchando: " + Cancion5);
        }
    }

    public void CambiarCancion() {
        System.out.println("\nQue cancion desea escuchar");
        System.out.println("1. Radioactive");
        System.out.println("2. The Nights");
        System.out.println("3. La Dificil");
        System.out.println("4. A Sky Full of Stars");
        System.out.println("5. Waiting For Love");
        int option = scan.nextInt();
        if (option == 1) {
            System.out.println("Esta escuchando: " + Cancion1);
        } else if (option == 2) {
            System.out.println("Esta escuchando: " + Cancion2);
        } else if (option == 3) {
            System.out.println("Esta escuchando: " + Cancion3);
        } else if (option == 4) {
            System.out.println("Esta escuchando: " + Cancion4);
        } else if (option == 5) {
            System.out.println("Esta escuchando: " + Cancion5);
        }
    }
}
