/**
 * @class Programación Orientada a Objetos 
 * Integrantes: 
    * Cristian Guevara - 22742
    * Angel Herrarte - 22873 
    * Madeline Castro - 22473 
 * Entrega: 20/11/2022 
 * Laboratorio #4
 * Propósito de la clase: Menus del sistema
 */
package main;

import java.util.Scanner;

public class Vista{
    Scanner scan = new Scanner(System.in);

    modoProductividad productividad = new modoProductividad();
    ModoRadio radio = new ModoRadio();
    modoCelular celular = new modoCelular(productividad);
    modoReproduccion modoReproduccion = new modoReproduccion();
    
    public void Bienvenida()
    {
        System.out.println("¡Bienvenid@ a su Mercedes-Benz! Su carro es de tipo A ¿Qué desea realizar?");
    }

    public int Menu()
    {
        int op;
        String menu = "1. Modo radio\n2. Modo reproducción\n3. Modo celular\n4. Modo productividad\n5. Salir";

		System.out.println(menu);
		op = scan.nextInt();
		
		return op;
    }

    public void menuRadio()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nAutomóvil A en Modo Radio");
            System.out.println("1. AM / FM");
            System.out.println("2. Cambiar de emisora");
            System.out.println("3. Guardar emisora");
            System.out.println("4. Cargar emisora");
            System.out.println("5. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    radio.TipoRadio();
                    break;
                case 2:
                    radio.CambiarEmisora();
                    break;
                case 3:
                    radio.GuardarEmisora();
                    break;
                case 4:
                    radio.CargarEmisora();
                    break;
		        case 5:
                    System.out.println("Menu principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("Ha ocurrido un error: Opción inválida\n¡Intente de nuevo!");
                    continuar = true;          
            } 
        }
    }
    
    public void menuReproducción()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nAutomóvil A en Modo Reproduccion");
            System.out.println("1. Seleccionar lista de canciones");
            System.out.println("2. Cambiar de cancion");
            System.out.println("3. Escuchar cancion");
			System.out.println("4. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Por favor, seleccione una canción\n");
                    modoReproduccion.ListaReproduccion();
                    break;
                case 2:	
                    System.out.println("Cambiar de cancion\n");
                    modoReproduccion.CambiarCancion();
                    break;
                case 3:
                    System.out.println("¿Qué canción desea escuchar?\n");
                    modoReproduccion.escucharCancion();
                    break;
                case 4:
                System.out.println("Regresando al menu principal...");
                    continuar = false;
                    break;   
                default:
                    System.out.println("Ha ocurrido un error: Opción inválida\n¡Intente de nuevo!");
                    continuar = true;          
            } 
        }
    }

    public void menuCelular()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nAutomóvil A en Modo Celular");
            System.out.println("1. Conectar/Desconectar telefono");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Llamar a contacto");
            System.out.println("4. Finalizar llamada");
            System.out.println("5. Cambiar a bocinas o auriculares ");
			System.out.println("8. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Ingrese que estado del celular prefiere:\n");
                    celular.ConectarDispositivo();
                    break;
                case 2:
                    System.out.println("Lista de contactos\n");
                    celular.contactosCelular();
                    celular.verContactos();
                    break;
                case 3:
                    System.out.println("¿A quén desea llamar?\n");
                    celular.contactosCelular();
                    celular.realizarLlamada();
                    break;
		        case 4:
                    System.out.println("Finalizar llamada\n");
                    celular.terminarLlamada();
                    break;
                case 5:
                    System.out.println("Cambiar a bocinas o auriculares\n");
                    celular.ClaseA();
                    break;    
                case 8:
                    System.out.println("Regresara al menu principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;          
            } 
        }
    }

    public void menuProductividad()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nAutomóvil A en Modo Productividad");
            System.out.println("1. Planificar viajes");
            System.out.println("2. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Planificación de viajes\n");
                    productividad.ClaseA();
                    break;
                case 2:
                    System.out.println("Regresara al menu principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;         
            } 
        }
    }

    public void mensajeError(){
		System.out.println("\nHa elegido una opción invalida.\n");
	}
    
    public void salida(){
		System.out.println("\n¡Gracias por usar nuestro programa!\n");
	}
}
