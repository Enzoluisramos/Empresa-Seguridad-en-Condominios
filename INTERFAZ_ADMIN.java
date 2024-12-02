import java.util.ArrayList;
import java.util.Scanner;
public class INTERFAZ_ADMIN {
    ArrayList<usuario> todo_usuarios;
    Scanner scanner = new Scanner(System.in);

    public INTERFAZ_ADMIN(ArrayList<usuario> todo_usuarios){
        this.todo_usuarios = todo_usuarios;
    }

    public void MOSTRANDO_MENU(){
        boolean CONTINUAR_ADMIN = true;
        while (CONTINUAR_ADMIN) {
            System.out.println("--- MENÚ ADMINISTRADOR ---");
            System.out.println("1. Mostrar usuarios registrados.");
            System.out.println("2. Agregar nueva opción agregan aqui team. ");
            System.out.println("3. Salir. ");
            System.out.println(".SELECCIONE UNA OPCIÓN. ");
            int opciones_ADMIN = scanner.nextInt();

            switch (opciones_ADMIN) {
                case 1:
                    mostrarUSUARIOS();
                    break;
                case 2: 

                    System.out.println("FALTA.");
                    break;
                case 3:
                CONTINUAR_ADMIN = false; // rompe el bucle
                System.out.println("Saliendo del menu del admin");
                break;
                default:
                System.out.println("\"Opción no válida. Por favor, intente de nuevo.\"");
                    break;
            }

        }
    }

    public void mostrarUSUARIOS(){
        System.out.println("--Usuarios registrados--");
        if (todo_usuarios.isEmpty()) {
            System.out.println(". No hay usuarios registrados. ");
            
        }
        else{
            for (usuario mostrando_the_USER : todo_usuarios) {
                System.out.println("- USUARIO: " + mostrando_the_USER.OBTENERuser());
            }
        }
    }
    
}
