import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdminLoginInterface {
    
    static ArrayList<admin> ADMINREGISTRADOS = new ArrayList<>();

    public static void main(String[] args) {
        // Registro de administradores (se pueden agregar más aquí)
        ADMINREGISTRADOS.add(new admin("Antonio", "Hola"));
        ADMINREGISTRADOS.add(new admin("Enzo", "Que"));
        ADMINREGISTRADOS.add(new admin("Joaquin", "Si"));
        ADMINREGISTRADOS.add(new admin("Gabriel", "No"));

        // Crear ventana
        JFrame frame = new JFrame("Inicio de Sesión - Administrador");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelUser = new JLabel("Usuario:");
        labelUser.setBounds(50, 50, 100, 30);
        frame.add(labelUser);

        JTextField textUser = new JTextField();
        textUser.setBounds(150, 50, 200, 30);
        frame.add(textUser);

        // Etiqueta de contraseña
        JLabel labelPassword = new JLabel("Contraseña:");
        labelPassword.setBounds(50, 100, 100, 30);
        frame.add(labelPassword);

        JPasswordField textPassword = new JPasswordField();
        textPassword.setBounds(150, 100, 200, 30);
        frame.add(textPassword);

        // Botón para iniciar sesión
        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(150, 150, 150, 30);
        frame.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = textUser.getText();
                String passwordInput = new String(textPassword.getPassword());
                boolean found = false;

                for (admin ADMIN : ADMINREGISTRADOS) {
                    if (ADMIN.OBTENER_adminUSER().equals(userInput) &&
                        ADMIN.OBTENER_ADMINpassword().equals(passwordInput)) {
                        JOptionPane.showMessageDialog(frame, "Bienvenido, Administrador: " + userInput);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    JOptionPane.showMessageDialog(frame, "Usuario o contraseña incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
      
        frame.setVisible(true);
    }
}
