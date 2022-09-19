import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class AuthGUI extends JFrame {
    private JPanel Panel;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton Login;
    private JLabel PasswordLabel;
    private JLabel LoginLabel;
    private JButton Register;
    private JLabel StatusLabel;

    Font font;

    Auth auth;

    public AuthGUI(String pathArg) {
        init(pathArg);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addActionListeners();
        setVisible(true);
    }

    public void init(String pathArg){
        auth = new Auth(pathArg);
        font = new Font(Font.SERIF, Font.BOLD, 25);

        setSize(500, 500);

        Panel.setBackground(new Color(22, 0, 43));
        Panel.setForeground(Color.WHITE);
        Panel.setFont(font);

        Login.setBackground(Color.DARK_GRAY);
        Login.setForeground(Color.WHITE);

        Register.setBackground(Color.DARK_GRAY);
        Register.setForeground(Color.WHITE);

        PasswordLabel.setForeground(Color.WHITE);
        LoginLabel.setForeground(Color.WHITE);

        textField.setForeground(Color.WHITE);
        textField.setBackground(Color.DARK_GRAY);
        passwordField.setForeground(Color.WHITE);
        passwordField.setBackground(Color.DARK_GRAY);
        setContentPane(Panel);
    }

    public void addActionListeners(){
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (auth.login(textField.getText(),
                            String.valueOf(passwordField.getPassword()),
                            PasswordHasher.create())) {
                        StatusLabel.setForeground(Color.GREEN);
                        StatusLabel.setText("LOGIN SUCCESSFUL!");
                    } else {
                        StatusLabel.setForeground(Color.RED);
                        StatusLabel.setText("LOGIN FAILED!");
                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        Register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (auth.register(textField.getText(),
                            String.valueOf(passwordField.getPassword()),
                            PasswordHasher.create())) {
                        StatusLabel.setForeground(Color.GREEN);
                        StatusLabel.setText("REGISTRATION SUCCESSFUL!");
                    } else {
                        StatusLabel.setForeground(Color.RED);
                        StatusLabel.setText("REGISTRATION FAILED!");
                    }

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
