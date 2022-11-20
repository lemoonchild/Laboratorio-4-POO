/**
 * @class Programación Orientada a Objetos 
 * Integrantes: 
    * Cristian Guevara - 22742
    * Angel Herrarte - 22873 
    * Madeline Castro - 22473 
 * Entrega: 20/11/2022 
 * Laboratorio #4
 * Propósito de la clase: Iniciar el programa 
 */
package main;

public class Main 
{

    public static void main(String[] args) 
    {
        
        Vista vista = new Vista();
        vista.Bienvenida();
        int opcion = 0;

        while (opcion != 5)
        {
            opcion = vista.Menu();

            if (opcion == 1)
            {
                //Menu de modo radio
                vista.menuRadio();
            }

            else if (opcion == 2)
            {
                //Menu de modo reproducción 
                vista.menuReproducción();
            }

            else if (opcion == 3)
            {
                //Menu de modo celular
                vista.menuCelular();
            }

            else if (opcion == 4)
            {
                //Menu de modo productividad
                vista.menuProductividad();
            }

            else if (opcion == 5)
            {
                //Salir
                vista.salida();
            }

            else
            {
                vista.mensajeError();
            }
        }
    }

}
