/**
 * @class Programación Orientada a Objetos 
 * Integrantes: 
    * Cristian Guevara - 22742
    * Angel Herrarte - 22873 
    * Madeline Castro - 22473 
 * Entrega: 20/11/2022 
 * Laboratorio #4
 * Propósito de la clase: Realizar llamadas y mostrar contacto de 
 */

package main;
import java.util.ArrayList;
import java.util.Scanner;

public class modoCelular implements iCarroA {

    //Atributos de la clase 
    modoProductividad productividad = new modoProductividad();

    String isOff = "Desconectado";
    public String noCall = "sinLlamadas";

    public String salidadeSonido;

    Scanner sc = new Scanner(System.in);

    //Lista de contactos
    ArrayList<String> C1 = new ArrayList<String>();
    ArrayList<String> C2 = new ArrayList<String>();
    ArrayList<String> C3 = new ArrayList<String>();
    ArrayList<String> C4 = new ArrayList<String>();
    ArrayList<String> C5 = new ArrayList<String>();

    //Constructor
    public modoCelular(modoProductividad Productividad){
        this.productividad = Productividad;
    }
    //Funciones//
    public void ConectarDispositivo()
    {
        if(isOff == "Desconectado"){

            System.out.println("¿Deseas conectar tu celular?\n 1. Si\n2. No");
            int opcion = sc.nextInt();

            if(opcion == 1){
                System.out.println("¡Se ha conectado el dispositivo!");
                isOff = "Conectado";

            }else if (opcion == 2){
                System.out.println("Dispositivo desconectado... ¡Lindo día!");
                isOff = "Conectado";

            }else{
                System.out.println("¡Parece que hubo un error! Intntalo de nuevo...");
            }
            
        }else if(isOff == "Conectado"){

            System.out.println("¿Deseas desconectar tu celular?\n1. Si\n2. No");
            int opcion2 = sc.nextInt();

            if(opcion2 == 1){
                System.out.println("Se ha desconectado el dispositivo");
                isOff = "Desconectado";

            }else if(opcion2 ==2){
                System.out.println("Tu dispositivo sigue conectado");
            }
    }
    }
    public void contactosCelular(){
        C1.add("Felipe Santos");
        C1.add("11223344");

        C2.add("Marcos Barrios");
        C2.add("44556677");

        C3.add("Maria Mercedes");
        C3.add("99887766");

        C4.add("Andrea Rosales");
        C4.add("55667788");
        
        C5.add("Odilia Gonzales");
        C5.add("66775544");
        
    }
    public void verContactos(){    

        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
        System.out.println(C4);
        System.out.println(C5);

    }

    class C1{

        private String nombre;
        void setName(String nombre){
            this.nombre = nombre;
        }

    }

    public void realizarLlamada()
    {
        System.out.println("\n¿A quién desea llamar?");

        C1.get(0); 
        C2.get(0);
        C3.get(0);
        C4.get(0);
        C5.get(0);

        int op = sc.nextInt();
        if(op == 1)
        {
            System.out.println("Llamando a: " + C1.get(0));
            System.out.println("\n*Realizando llamada*");
            noCall = "EnLlamada";
        }
        else if(op == 2)
        {
            System.out.println("Llamando a: " + C2.get(0));
            System.out.println("\n*Realizando llamada*");
        }
        else if(op == 3)
        {
            System.out.println("Llamando a: " + C3.get(0));
            System.out.println("\n*Realizando llamada*");
        }
        else if(op == 4)
        {
            System.out.println("Llamando a: " + C4.get(0));
            System.out.println("\n*Realizando llamada*");
        }
        else if(op == 5)
        {
            System.out.println("Llamando a: " + C5.get(0));
            System.out.println("\n*Realizando llamada*");
        }
    }

    public void terminarLlamada(){

            if(noCall == "SinLlamada"){

                System.out.println("¡No estás dentro de una llamada!");

            }else if(noCall == "EnLlamada"){

            System.out.println("¿Deseas terminar la llamada?\n 1. Si\n2. No");
            int opcion = sc.nextInt();

            if(opcion ==1){
                System.out.println("Se ha colgado la llamada realizada");
                noCall = "no";
            }else if (opcion == 2){
                System.out.println("Sigues conectado a una llamada");
                noCall = "si";
            }else{
                System.out.println("¡Ha ocurrido un error! Intentalo de nuevo");
            }
        }
        }
    
    @Override
    public void ClaseA(){
        System.out.println("¿Que salida de audio deseas?\n1. Speaker\n2. Audífonos");
        int audioSalida = sc.nextInt();
            if(audioSalida == 1){
                System.out.println("Speaker conectado");
                salidadeSonido = "Speaker";
            }else if (audioSalida == 2){
                System.out.println("Audífonos conectados");
                salidadeSonido = "Audífonos";
            }
            else{
                System.out.println("¡Parece que ha ocurrido un error!");
            }
        }
    
    public String getEnLlamada(){
        return noCall;
    }
    public void setEnLlamada(String EnLlamada){
        this.noCall = EnLlamada;
    }   
}
