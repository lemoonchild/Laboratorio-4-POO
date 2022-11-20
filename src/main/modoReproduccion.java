/**
 * @class Programación Orientada a Objetos 
 * Integrantes: 
    * Cristian Guevara - 22742
    * Angel Herrarte - 22873 
    * Madeline Castro - 22473 
 * Entrega: 20/11/2022 
 * Laboratorio #4
 * Propósito de la clase: Modo reproducción del programa
 */

package main;

import java.util.ArrayList;
import java.util.Scanner;

public class modoReproduccion {

    public String cancionElegida;

    ArrayList<String> Cancion1 = new ArrayList<String>();
    ArrayList<String> Cancion2 = new ArrayList<String>();
    ArrayList<String> Cancion3 = new ArrayList<String>();
    ArrayList<String> Cancion4 = new ArrayList<String>();
    ArrayList<String> Cancion5 = new ArrayList<String>();
    ArrayList<String> Canciones = new ArrayList<String>();

    Scanner scan = new Scanner(System.in);

    public void ListaReproduccion() {
        Cancion1.add("Just Pretend");
        Cancion1.add("3:25");
        Cancion1.add("Bad Omens");
        Cancion1.add("Metalcore");

        Cancion2.add("Glimpse of Us");
        Cancion2.add("3:53");
        Cancion2.add("Joji");
        Cancion2.add("R&B/Soul");

        Cancion3.add("Me porto bonito");
        Cancion3.add("2:58");
        Cancion3.add("Bad Bunny");
        Cancion3.add("Urbano Latino");

        Cancion4.add("Swim");
        Cancion4.add("3:49");
        Cancion4.add("Chase Atlantic");
        Cancion4.add("Alternativo");

        Cancion5.add("Sway");
        Cancion5.add("3:08");
        Cancion5.add("Michael Bublé");
        Cancion5.add("Pop Latino");

        System.out.println(Cancion1);
        System.out.println(Cancion2);
        System.out.println(Cancion3);
        System.out.println(Cancion4);
        System.out.println(Cancion5);
    }

    public void escucharCancion() {

        System.out.println("\n¿Qué canción desea escuchar");
        System.out.println("1. Just Pretend");
        System.out.println("2. Glimpse of Us");
        System.out.println("3. Me porto bonito");
        System.out.println("4. Swim");
        System.out.println("5. Sway");

        int op = scan.nextInt();

        if (op == 1) {
            System.out.println("Esta escuchando: " + Cancion1);
        } else if (op == 2) {
            System.out.println("Esta escuchando: " + Cancion2);
        } else if (op == 3) {
            System.out.println("Esta escuchando: " + Cancion3);
        } else if (op == 4) {
            System.out.println("Esta escuchando: " + Cancion4);
        } else if (op == 5) {
            System.out.println("Esta escuchando: " + Cancion5);
        }
    }

    public void CambiarCancion() {

        System.out.println("\n¿Qué canción deseas escuchar");
        System.out.println("1. Just Pretend");
        System.out.println("2. Glimpse of Us");
        System.out.println("3. Me porto bonito");
        System.out.println("4. Swim");
        System.out.println("5. Sway");

        int op = scan.nextInt();

        if (op == 1) {
            System.out.println("Esta escuchando: " + Cancion1);
        } else if (op == 2) {
            System.out.println("Esta escuchando: " + Cancion2);
        } else if (op == 3) {
            System.out.println("Esta escuchando: " + Cancion3);
        } else if (op == 4) {
            System.out.println("Esta escuchando: " + Cancion4);
        } else if (op == 5) {
            System.out.println("Esta escuchando: " + Cancion5);
        }
    }
}
