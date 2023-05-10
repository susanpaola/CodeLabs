package presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Login extends JFrame implements ActionListener{

	//private JPanel contentPane;
	private JButton loginButton = new JButton("Login");
	public static void main(String[] args) {
		Login frame = new Login ();
		frame.setVisible(true);
	}
	public Login() {
		inicializacion();
	}

	public void inicializacion() {
		setTitle("Interfaz de login");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 417);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField usuarioField = new JTextField();
		usuarioField.setBounds(153, 119, 379, 34);
		contentPane.add(usuarioField);
		usuarioField.setColumns(10);
		
		JTextField passField = new JTextField();
		passField.setColumns(10);
		passField.setBounds(153, 216, 379, 34);
		contentPane.add(passField);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(153, 78, 68, 30);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasenia = new JLabel("Contraseña:");
		lblContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContrasenia.setBounds(151, 181, 108, 24);
		contentPane.add(lblContrasenia);
		
		this.loginButton.addActionListener(this);
		this.loginButton.setBounds(268, 310, 170, 43);
		getContentPane().add(loginButton);
		
		JLabel lblNewLabel = new JLabel("Login ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(252, 11, 201, 34);
		contentPane.add(lblNewLabel);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== loginButton) {
			PantallaPrincipal frame = new PantallaPrincipal ();
			frame.setVisible(true);
		}
		
	}
}
