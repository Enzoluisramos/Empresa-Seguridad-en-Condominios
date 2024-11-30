import java.util.Scanner;


public class MenuSectores {
   
        Scanner scanner = new Scanner(System.in);
        int opcion;

        public void SECTORESDELADMIN(){
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
                    System.out.println("Has seleccionado el Sector Seguridad.");
                    break;
                case 2:
                    System.out.println("Has seleccionado el Sector Sanidad.");
                    break;
                case 3:
                    System.out.println("Has seleccionado el Sector Bienestar.");
                    break;
                case 0:
                    System.out.println("Saliendo del menú. ¡Nos vemos!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
            System.out.println();
        } while (opcion != 0);
}

}
  










