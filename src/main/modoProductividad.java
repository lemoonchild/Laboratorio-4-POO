/**
 * @class Programación Orientada a Objetos 
 * Integrantes: 
    * Cristian Guevara - 22742
    * Angel Herrarte - 22873 
    * Madeline Castro - 22473 
 * Entrega: 20/11/2022 
 * Laboratorio #4
 * Propósito de la clase: Su propósito es hacer uso del modo celular del automóvil "A" 
 */

package main;
import java.util.ArrayList;
import java.util.Scanner;

public class modoProductividad implements iCarroA{
    
    //Atributos de la clase 
    public String ubicacion;
    public String fecha;

    Scanner sc = new Scanner(System.in);

    ArrayList<String> ViajesCreados = new ArrayList<String>();

    //Métodos Creados

    //Constructor de la clase Productividad
    public modoProductividad() {
        ubicacion = null;
        fecha = null;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public void ClaseA(){
        System.out.println("Introduzca la ubicación del viaje:\n");
        ubicacion = sc.nextLine();
        System.out.println("Introduzca la fecha en la que desea viajar(DD/MM/YY):\n");
        fecha = sc.nextLine();
        System.out.println("Viaje planificado para: "+ ubicacion +", en el día: " + fecha);

        ViajesCreados.add(ubicacion);
        ViajesCreados.add(fecha);
        
    }

    
}
