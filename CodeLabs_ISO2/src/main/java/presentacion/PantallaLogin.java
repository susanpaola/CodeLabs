package presentacion;

import javax.swing.JButton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Label;
import javax.swing.DropMode;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JEditorPane;
//import com.jgoodies.forms.factories.DefaultComponentFactory;

import persistencia.GestorBD;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import java.awt.Canvas;
import java.awt.Toolkit;

public class PantallaLogin  {

	protected static JTextField UsuarioText;
	protected static JTextField ContrasenaText;
	protected static JTextField user;
	
	protected void setVisible(boolean b) {

	}
	private static void placeComponents(JPanel panel) {
		panel.setLayout(null);
	}

		/**
		 * @wbp.parser.entryPoint
		 */
		public static void mostrar() {
			JFrame frmUclm = new JFrame("Demo application");
			frmUclm.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\34636\\git\\CodeLabs\\CodeLabs_ISO2\\imagenes\\logoUCLM.jpg"));
			frmUclm.setTitle("UCLM");
			frmUclm.setSize(625, 428);
			frmUclm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			JPanel panel = new JPanel();
			panel.setBackground(new Color(176, 224, 230));
			frmUclm.getContentPane().add(panel);
			placeComponents(panel);
			
			JButton loginButton = new JButton("Iniciar sesi\u00F3n");
			loginButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			loginButton.hide();
			loginButton.setForeground(new Color(0, 0, 0));
			loginButton.setBackground(new Color(255, 182, 193));
			loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			loginButton.setFont(new Font("Tahoma", Font.BOLD, 15));
			loginButton.setBounds(406, 316, 168, 48);
			panel.add(loginButton);
			
			JPasswordField ContrasenaText = new JPasswordField(20);
			ContrasenaText.setBackground(new Color(255, 255, 255));
			ContrasenaText.setToolTipText("Introduzca su contrase\u00F1a");
			ContrasenaText.setFont(new Font("Tahoma", Font.PLAIN, 15));
			ContrasenaText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) SystemColor.textHighlight));
			
			ContrasenaText.setActionCommand("");
			ContrasenaText.hide();
			ContrasenaText.setBounds(79, 205, 434, 42);
			panel.add(ContrasenaText);
			
			UsuarioText = new JTextField();
			UsuarioText.setFont(new Font("Tahoma", Font.PLAIN, 15));
			UsuarioText.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(180, 180, 180)));
			UsuarioText.setName("");
			UsuarioText.setToolTipText("Introduzca su correo electr\u00F3nico");
			UsuarioText.setBounds(79, 96, 434, 42);
			panel.add(UsuarioText);
			UsuarioText.setColumns(10);	
			JButton btnRecuperar = new JButton("He olvidado mi contrase\u00F1a");
			btnRecuperar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Hemos enviado su problema al personal de soporte de la UCLM. Pronto se pondrán en contacto con usted.", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
					ContrasenaText.setText("");
				}
			});
			btnRecuperar.hide();
			btnRecuperar.setHorizontalAlignment(SwingConstants.LEFT);
			btnRecuperar.setForeground(SystemColor.textHighlight);
			btnRecuperar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnRecuperar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnRecuperar.setBackground(Color.WHITE);
			btnRecuperar.setBorder(null);
			btnRecuperar.setBounds(79, 258, 168, 21);
			panel.add(btnRecuperar);

			frmUclm.setVisible(true);
			JButton btnSiguiente = new JButton("Siguiente");
			btnSiguiente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnSiguiente.setForeground(new Color(0, 0, 0));
			btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnSiguiente.setBackground(new Color(255, 182, 193));
			btnSiguiente.setBounds(406, 316, 168, 48);
			panel.add(btnSiguiente);
			
			JLabel userLabel = new JLabel("Iniciar sesi\u00F3n");
			userLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			userLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			userLabel.setBounds(233, 11, 148, 25);
			panel.add(userLabel);

			JLabel passwordLabel = new JLabel("Contraseña");
			passwordLabel.hide();
			passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
			passwordLabel.setBounds(80, 167, 215, 42);
			panel.add(passwordLabel);
			
			user = new JTextField();
			user.setFont(new Font("Tahoma", Font.BOLD, 10));
			user.setBackground(Color.WHITE);
			user.setBorder(null);
			user.setEditable(false);
			user.hide();
			user.setBounds(79, 108, 252, 19);
			panel.add(user);
			user.setColumns(10);
			
			JButton btnNoAcceder = new JButton("\u00BFNo puede acceder a su cuenta?");
			btnNoAcceder.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Hemos enviado su problema al personal de soporte de la UCLM. Pronto se pondrán en contacto con usted.", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
					UsuarioText.setText("");
				}
			});
			btnNoAcceder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnNoAcceder.setHorizontalAlignment(SwingConstants.LEFT);
			btnNoAcceder.setForeground(SystemColor.textHighlight);
			btnNoAcceder.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNoAcceder.setBorder(null);
			btnNoAcceder.setBackground(Color.WHITE);
			btnNoAcceder.setBounds(79, 149, 216, 21);
			panel.add(btnNoAcceder);
			
			JButton btnNewButton = new JButton("Volver");
			btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnNewButton.setForeground(new Color(0, 0, 0));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnNewButton.setBackground(new Color(255, 182, 193));
			btnNewButton.setBounds(44, 316, 114, 49);
			panel.add(btnNewButton);
			
			JLabel lblEscribirCorreoElectronico = new JLabel("Tipo de usuario");
			lblEscribirCorreoElectronico.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblEscribirCorreoElectronico.setBounds(79, 47, 302, 42);
			panel.add(lblEscribirCorreoElectronico);
			btnNewButton.hide();
			btnNewButton.addActionListener((ActionListener) new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
						presentacion.PantallaLogin p = new presentacion.PantallaLogin();
						p.mostrar();
						
						frmUclm.dispose();
						
					}
			});

			btnSiguiente.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usu=UsuarioText.getText();
			if (usu.length()==0) {
				JOptionPane.showMessageDialog(null, "Porfavor introduzca su usuario.", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			else {
				btnRecuperar.show();
				btnSiguiente.hide();
				UsuarioText.hide();
				ContrasenaText.show();
				loginButton.show();
				userLabel.hide();
				passwordLabel.show();
				btnNoAcceder.hide();
				btnNewButton.show();
				user.show();
				user.setText(" Usuario: "+ UsuarioText.getText());	
				
				loginButton.addActionListener((ActionListener) new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String pass =ContrasenaText.getText();
						if (pass.length()==0) {
							JOptionPane.showMessageDialog(null, "Porfavor introduzca su contraseña.", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
						else {
									 try {
										 GestorBD.connect();
										 //he modificado la siguiente linea "usuario"
										 String user= "SELECT tipoUsuario FROM Usuarios WHERE tipoUsuario = '"+usu+"'";
										 Vector<Object> usuario,contra;
										usuario = GestorBD.getAgente().select(user);
										
										 String passw= "SELECT contraseña FROM Usuarios WHERE contraseña = '"+pass+"'";
										 contra = GestorBD.getAgente().select(passw);
										 
										 if (usuario.isEmpty()==false && contra.isEmpty()==false) {
											 JOptionPane.showMessageDialog(null, "Bienvenido.", "UCLM", JOptionPane.INFORMATION_MESSAGE);
											 tipoPerfil(devolverTipo(UsuarioText.getText()),devolverNombre(UsuarioText.getText()));
											 frmUclm.dispose();
											 presentacion.PantallaRealizarPropuesta pa = new presentacion.PantallaRealizarPropuesta();
											 pa.NombreProf.setText(devolverNombre(UsuarioText.getText()));
											 pa.CategoriaProf.setText(devolverTipo(UsuarioText.getText()));
										 }
										 else {
											 JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectos. Por favor, introduzca correctamente los datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
											 frmUclm.dispose();
											 PantallaLogin.mostrar();
											
											
										 }
										 
									} catch (Exception e1) {
										e1.printStackTrace();
									}
									
						}
					}
					});
		
				}
				}
			});
		
		}
		public static String devolverNombre(String usu) {
			String nombre;
			String name= "SELECT nombre FROM Usuarios WHERE tipoUsuario = '"+usu+"'";
			String ape= "SELECT apellidos FROM Usuarios WHERE tipoUsuario = '"+usu+"'";
			 Vector<Object> nom,apellidos;
			try {
				nom = GestorBD.getAgente().select(name);
				apellidos=GestorBD.getAgente().select(ape);
				nombre=(nom.get(0).toString().replace("[", "").replace("]", "")+" "+apellidos.get(0).toString().replace("[", "").replace("]", ""));
				return nombre;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			return "";
}
		public static String devolverTipo(String usu) {
			String tipo;
			String sql= "SELECT tipoUsuario FROM Usuarios WHERE tipoUsuario = '"+usu+"'";
			 Vector<Object> nom;
			try {
				nom = GestorBD.getAgente().select(sql);
				tipo=(nom.get(0).toString().replace("[", "").replace("]", ""));
				
				return tipo;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			return "";
}
		public static void tipoPerfil(String a, String nom) throws Exception {	
			switch (a) { 
		    case "Profesor":
		    	presentacion.PantallaDireccionCursos p = new presentacion.PantallaDireccionCursos();
		    	p.NombreUsu.setText(nom);
				p.TipoUsuario.setText(a);
		    	p.setVisible(true);
		    	
		     break;
		    case "Estudiante":
		    	presentacion.PantallaEstudiante e = new presentacion.PantallaEstudiante();
		    	e.NombreUsu.setText(nom);
				e.TipoUsuario.setText(a);
		    	e.setVisible(true);
		     break;
		    case "Vicerrector" :
		    	presentacion.PantallaEmpleadosVicerrectorado v = new presentacion.PantallaEmpleadosVicerrectorado();
		    	v.NombreUsu.setText(nom);
				v.TipoUsuario.setText(a);
		    	v.setVisible(true);
		     break;
		}
		}
}