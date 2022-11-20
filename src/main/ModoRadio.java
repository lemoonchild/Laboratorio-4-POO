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
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ModoRadio {
    public Double ERadio;
    public String NEmisora;
    public String TRadio;
    public String ruta;
    ArrayList<String> EmisorasGuardadas = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);

    public ModoRadio()
    {
        ERadio = 82.5;
        NEmisora = null;
        ruta = null;
    }


    public Double getEmisoraRadio()
    {
        return ERadio;
    }

    public String getNumEmisora()
    {
        return NEmisora;
    }

 
    public void setEmisoraRadio(Double EmisoraRadio)
    {
        this.ERadio = EmisoraRadio;
    }

    public void setNumEmisora(String NumeroEmisora)
    {
        this.NEmisora = NumeroEmisora;
    }


    public void TipoRadio()
    {
        System.out.println("1. FM\n2. AM");
        int option = scan.nextInt();
        if(option == 1)
        {
            TRadio = "FM";
        }
        else if(option ==2)
        {
            TRadio = "AM";
        }
        if(TRadio =="FM")
        {
            System.out.println("Radio FM, La frecuencia es de: 300 Khz a 30 Khz");
        }
        else if(TRadio =="AM")
        {
            System.out.println("Radio AM, La frecuencia es de: 3.000 Khz a 300 Khz");
        }
    }

    public void CambiarEmisora()
    {
        while(ERadio >= 82.5 && ERadio <= 107.5)
        {
            System.out.println("\n1. Siguiente emisora");
            System.out.println("2. Bajar emisora");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    ERadio = ERadio + 0.5;
                    setEmisoraRadio(ERadio);
                    System.out.println("La emisora que esta escuchadno es: " + ERadio);
                    break;
                case 2:
                    ERadio = ERadio - 0.5;
                    setEmisoraRadio(ERadio);
                    System.out.println("La emisora que esta escuchadno es: " + ERadio);
                    break;
                default:
                    System.out.println("ERROR: Opcion invalida\nVuelva a intentar");
            }
            break;
        }
    }

    public void GuardarEmisora()
    {
        System.out.println("Ingrese el numero de la emisora: (entre 82.5 y 107.5)");
        NEmisora = scan.nextLine();

        setNumEmisora(NEmisora);

        EmisorasGuardadas.add(NEmisora);

    }

    public void CargarEmisora()
    {
        System.out.println("Emisoras: "+ EmisorasGuardadas);
    }
}
