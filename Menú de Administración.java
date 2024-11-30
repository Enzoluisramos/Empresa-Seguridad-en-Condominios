import java.util.ArrayList;
import java.util.Scanner;

public class MenuAdmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lista de Administradores y Usuarios
        ArrayList<admin> ADMINREGISTRADOS = new ArrayList<>();
        ArrayList<usuario> USUARIOSREGISTRADOS = new ArrayList<>();

        // Agregar administradores por defecto
        ADMINREGISTRADOS.add(new admin("admin1", "adminpass"));
        ADMINREGISTRADOS.add(new admin("admin2", "adminpass"));
      
        USUARIOSREGISTRADOS.add(new usuario("user1", "pass1", "user1@mail.com"));
        USUARIOSREGISTRADOS.add(new usuario("user2", "pass2", "user2@mail.com"));

        // Menú de Administración
        String principio;
        do {
            System.out.println("----- MENÚ DE ADMINISTRADOR -----");
            System.out.println("1. Ver usuarios registrados");
            System.out.println("2. Eliminar usuario");
            System.out.println("3. Agregar nuevo usuario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Usuarios registrados
                    System.out.println("Usuarios registrados:");
                    for (usuario u : USUARIOSREGISTRADOS) {
                        System.out.println("Usuario: " + u.OBTENERuser() + ", Correo: " + u.OBTENERemail());
                    }
                    break;

                case 2:
                    // Eliminar usuario
                    System.out.print("Ingrese el nombre de usuario a eliminar: ");
                    String userToDelete = scanner.nextLine();
                    boolean usuarioEliminado = false;
                    for (usuario u : USUARIOSREGISTRADOS) {
                        if (u.OBTENERuser().equals(userToDelete)) {
                            USUARIOSREGISTRADOS.remove(u);
                            System.out.println("Usuario " + userToDelete + " ha sido eliminado.");
                            usuarioEliminado = true;
                            break;
                        }
                    }
                    if (!usuarioEliminado) {
                        System.out.println("El usuario no existe.");
                    }
                    break;

                case 3:
                    // Agregar nuevo usuario
                    System.out.print("Ingrese el nombre de usuario: ");
                    String newUser = scanner.nextLine();
                    System.out.print("Ingrese la contraseña: ");
                    String newPassword = scanner.nextLine();
                    System.out.print("Ingrese el correo electrónico: ");
                    String newEmail = scanner.nextLine();

                    USUARIOSREGISTRADOS.add(new usuario(newUser, newPassword, newEmail));
                    System.out.println("Usuario " + newUser + " agregado correctamente.");
                    break;

                case 0:
                    System.out.println("Saliendo del menú de administrador.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println("¿Desea continuar? (SI/NO)");
            principio = scanner.nextLine().toUpperCase();
        } while (principio.equals("SI"));

        scanner.close();
    }
}
