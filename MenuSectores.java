import java.util.ArrayList;
import java.util.Scanner;


public class MenuSectores {
    Scanner scanner = new Scanner(System.in);

    ArrayList<SECTORES_WORKING> TRABAJADORES_SEGURIDAD;
    ArrayList<SECTORES_WORKING> TRABAJADORES_SANIDAD;
    ArrayList<SECTORES_WORKING> TRABAJADORES_BIENESTAR;
    
        

    public MenuSectores(){
        TRABAJADORES_SEGURIDAD = new ArrayList<>();
        TRABAJADORES_SANIDAD = new ArrayList<>();
        TRABAJADORES_BIENESTAR = new ArrayList<>();

        //TRABAJADORES LISTA SEGURIDAD
        TRABAJADORES_SEGURIDAD.add(new SECTORES_WORKING("JORGE", "SEGURIDAD", "22"));
        TRABAJADORES_SEGURIDAD.add(new SECTORES_WORKING("ALEX", "SEGURIDAD", "20"));
        TRABAJADORES_SEGURIDAD.add(new SECTORES_WORKING("JIMI", "SEGURIDAD", "25"));
        TRABAJADORES_SEGURIDAD.add(new SECTORES_WORKING("ANDRE", "SEGURIDAD", "20"));

        //TRABAJADORES LISTA SANIDAD 
        TRABAJADORES_SANIDAD.add(new SECTORES_WORKING("MARIA", "SANIDAD", "28"));
        TRABAJADORES_SANIDAD.add(new SECTORES_WORKING("SERGIO", "SANIDAD", "30"));
        TRABAJADORES_SANIDAD.add(new SECTORES_WORKING("CORTEX", "SANIDAD", "21"));
        TRABAJADORES_SANIDAD.add(new SECTORES_WORKING("MARICIELO", "SANIDAD", "19"));

        //TRABAJADORES LISTA BIENESTAR

        TRABAJADORES_BIENESTAR.add(new SECTORES_WORKING("CARLOS", "BIENESTAR", "23"));
        TRABAJADORES_BIENESTAR.add(new SECTORES_WORKING("MARILYN", "BIENESTAR", "29"));
        TRABAJADORES_BIENESTAR.add(new SECTORES_WORKING("TATIANA", "BIENESTAR", "20"));
        TRABAJADORES_BIENESTAR.add(new SECTORES_WORKING("FIORELLA", "BIENESTAR", "18"));

    }
    int opcion;
        
        public void SECTORESDELUSER(){
        do {
            System.out.println("=== MENÚ DE OPCIONES ===");
            System.out.println("1. Sector Seguridad");
            System.out.println("2. Sector Sanidad");
            System.out.println("3. Sector Bienestar");
            System.out.println("0. Salir");
            System.out.print("Por favor, elige una opción: ");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("---------------------------------------");
                    System.out.println("Has seleccionado el Sector Seguridad.");
                    System.out.println("---------------------------------------");
                    MostrarTrabajadores(TRABAJADORES_SEGURIDAD);
                    System.out.println("---------------------------------------");
                    PAUSA();
                    break;
                case 2:
                    System.out.println("Has seleccionado el Sector Sanidad.");
                    System.out.println("---------------------------------------");
                    MostrarTrabajadores(TRABAJADORES_SANIDAD);
                    System.out.println("---------------------------------------");
                    System.out.println("---------------------------------------");
                    PAUSA();
                    System.out.println("---------------------------------------");
                    break;
                case 3:
                    System.out.println("Has seleccionado el Sector Bienestar.");
                    System.out.println("---------------------------------------");
                    MostrarTrabajadores(TRABAJADORES_BIENESTAR);
                    System.out.println("---------------------------------------");
                    System.out.println("---------------------------------------");
                    PAUSA();
                    System.out.println("---------------------------------------");
                    break;
                case 0:
                    System.out.println("---------------------------------------");
                    System.out.println("Saliendo del menú. ¡Nos vemos!");
                    System.out.println("---------------------------------------");
                    System.out.println("---------------------------------------");
                    PAUSA();
                    System.out.println("---------------------------------------");
                    break;
                default:
                    System.out.println("---------------------------------------");
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    System.out.println("---------------------------------------");
                    System.out.println("---------------------------------------");
                    PAUSA();
                    System.out.println("---------------------------------------");
            }
            System.out.println();
            System.out.println("---------------------------------------");
            PAUSA();
            System.out.println("---------------------------------------");
        } while (opcion != 0);
}

public void MostrarTrabajadores(ArrayList<SECTORES_WORKING> TRABAJADORES){
    System.out.println("---------------------------------------");
    System.out.println("Trabajadores del sector :");
    System.out.println("---------------------------------------");
    for (SECTORES_WORKING MOSTRANDO_WORK : TRABAJADORES) {
        System.out.println("Nombre :" + MOSTRANDO_WORK.OBTENER_NAME_WORK() + ", Profesión: " + MOSTRANDO_WORK.OBTENER_PROFESION_WORK() +
         ", Edad: " + MOSTRANDO_WORK.OBTENER_EDAD_WORK() );
    }
}

public void PAUSA(){
    System.out.println("PRESIONE ENTER PARA CONTINUAR....");
    scanner.nextLine(); //ESPERARA A QUE EL USUARIO PRESIONE ENTER
}
}
  










