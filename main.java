
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.undo.UndoableEditSupport;


public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MenuSectores USERSECTOR = new MenuSectores();

        ArrayList<usuario> USUARIOSREGISTRAR = new ArrayList<>();
        //------------------------------------------------------
        ArrayList<admin> ADMINREGISTRADOS = new ArrayList<>();
        //Registro de administradores
        ADMINREGISTRADOS.add(new admin("Antonio", "Hola"));
        ADMINREGISTRADOS.add(new admin("Enzo", "Que"));
        ADMINREGISTRADOS.add(new admin("Joaquin", "Si"));
        ADMINREGISTRADOS.add(new admin("Gabriel", "No"));
        //-------------------------------------------------------

        String principio; // Variable para controlar el bucle del menú principal
        do{
        System.out.println("------ BIENVENIDO AL CONDOMINIO ONLINE ---------");
        System.out.println("-1.REGISTRESE SI ES NUEVO USUARIO.");
        System.out.println("-2.INICIO DE SESION PARA USUARIOS");
        System.out.println("-3.CUENTA DE ADMINISTRADOR.");
        System.out.println("-.Seleccione la opción ideal(1)(2)(3).");
        int elegir = scanner.nextInt();
        scanner.nextLine(); // Limpia el búfer de entrada

        switch (elegir) {
            case 1:
                System.out.println("REGISTRANDO A NUEVO USUARIO");
                System.out.println("Ingrese el nuevo usuario");
                String newuser1 = scanner.nextLine();
                System.out.println("Ingrese su contraseña");
                String newuser2 = scanner.nextLine();

                boolean usuarioEXISTENTE = false;
                for (usuario buscar : USUARIOSREGISTRAR) {
                    if (buscar.OBTENERuser().equals(newuser1)){
                        usuarioEXISTENTE = true;
                        break;
                    }
                }
                if(usuarioEXISTENTE){
                    System.out.println(".Este nombre ya fue registrado. INGRESE OTRO POR FAVOR.");
                }
                else{
                    USUARIOSREGISTRAR.add(new usuario(newuser1, newuser2));
                    System.out.println(".USUARIO REGISTRADO ADECUADAMENTE");
 
                }
                
            break;
            
            case 2:
                System.out.println("--INICIO DE SESIÓN--");
                System.out.println("INGRESE SU USUARIO");
                String USERREGISTRADO = scanner.nextLine();
                System.out.println("INGRESE SU CONTRASEÑA");
                String CONTRAREGISTRADO = scanner.nextLine();
                
                boolean ENCONTRADO = false;

                for (usuario usuarioCompleto : USUARIOSREGISTRAR) {
                 if (usuarioCompleto.OBTENERuser().equals(USERREGISTRADO) && usuarioCompleto.OBTENERpassword().equals(CONTRAREGISTRADO)) {
                    System.out.println("BIENVENIDO:" + USERREGISTRADO);
                    ENCONTRADO = true;
                    System.out.println("-------------------------------");
                    USERSECTOR.SECTORESDELUSER(); 
                    break;
                    
                 }   
                }
                if(!ENCONTRADO){
                    System.out.println("USUARIO O CONTRASEÑA INCORRECTO");
                }
                
                
                break;
                
            case 3:
            System.out.println("-- INICIO DE SESIÓN COMO ADMINISTRADOR --");
            System.out.print(".Ingrese su usuario: ");
            String adminUser = scanner.nextLine();
            System.out.print(".Ingrese su contraseña: ");
            String adminPassword = scanner.nextLine();
            
            boolean admin_encontrado = false;
            for (admin ADMINIS : ADMINREGISTRADOS) {
                if(ADMINIS.OBTENER_adminUSER().equals(adminUser) && ADMINIS.OBTENER_ADMINpassword().equals(adminPassword)) {
                    System.out.println("BIENVENIDO ADMINISTRADOR: " + adminUser);
                    admin_encontrado = true;
                    break;
                }
            }
            if(!admin_encontrado){
                System.out.println("USUARIO O CONTRASEÑA DEL ADMINISTRADOR INCORRECTO.");
            }

            

            break;
            default:
            System.out.println("Opción no válida. Por favor, intente de nuevo.");
                break;
        }
         
        System.out.println("DESEAS CONTINUAR . ESCRIBA SI o si ");
        principio = scanner.nextLine().toUpperCase(); // Guardamos y lo volvemos a mayuscula para colocar "si" a "SI"

        
    }while (principio.equals("SI"));
        
        scanner.close();
        
    }
}
