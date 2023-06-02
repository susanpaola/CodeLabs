package presentacion;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import negocio.controllers.GestorConsultas;

//import com.jgoodies.forms.factories.DefaultComponentFactory;

import persistencia.CursoPropioDAO;
import persistencia.GestorBD;

import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class PantallaDireccionCursos extends JFrame {
	
	private static final String FONT_TAHOMA = "Tahoma";
	
	private JPanel contentPane;
	protected final JTextField NombreUsu;
	protected final JTextField TipoUsuario;
	private transient presentacion.PantallaLogin p = new presentacion.PantallaLogin();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaDireccionCursos frame = new PantallaDireccionCursos();
					frame.setVisible(true);
				} catch (Exception e) {
					//e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public PantallaDireccionCursos() {
		setTitle("UCLM");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\34636\\git\\CodeLabs\\CodeLabs_ISO2\\imagenes\\logoUCLM.jpg"));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMostrarPendientes = new JButton("Propuestas pendientes");
		btnMostrarPendientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMostrarPendientes.setForeground(new Color(0, 0, 0));
		btnMostrarPendientes.setBackground(new Color(255, 182, 193));
		btnMostrarPendientes.setFont(new Font(FONT_TAHOMA, Font.BOLD, 18));
		btnMostrarPendientes.setBounds(515, 240, 244, 122);
		contentPane.add(btnMostrarPendientes);
		btnMostrarPendientes.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					presentacion.PantallaPropuestasPendientes p;
					try {
						 GestorConsultas gestor = new GestorConsultas();
						 if (gestor.estadoPendiente().size()==0) {
					    	 JOptionPane.showMessageDialog(null, "No existen propuestas pendientes en este momento.", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);}
						 else {
						p = new presentacion.PantallaPropuestasPendientes();
						p.setVisible(true);
						setVisible(false);
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}

				}
		});
		
		JButton btnRealizarPropuesta = new JButton("Realizar propuesta");
		btnRealizarPropuesta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRealizarPropuesta.setForeground(new Color(0, 0, 0));
		btnRealizarPropuesta.setFont(new Font(FONT_TAHOMA, Font.BOLD, 18));
		btnRealizarPropuesta.setBackground(new Color(255, 182, 193));
		btnRealizarPropuesta.setBounds(261, 240, 244, 122);
		contentPane.add(btnRealizarPropuesta);
		btnRealizarPropuesta.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					presentacion.PantallaRealizarPropuesta p = new presentacion.PantallaRealizarPropuesta();
					p.setVisible(true);
					p.CategoriaProf.setText(TipoUsuario.getText());
					p.NombreProf.setText(devolverDNI(NombreUsu.getText().split(" ")[0].toString(), 0));
					setVisible(false);
				}
		});
		
		
		NombreUsu = new JTextField();
		NombreUsu.setForeground(new Color(0, 0, 0));
		NombreUsu.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		NombreUsu.setEditable(false);
		NombreUsu.setHorizontalAlignment(SwingConstants.CENTER);
		NombreUsu.setFont(new Font(FONT_TAHOMA, Font.PLAIN, 15));
		NombreUsu.setColumns(10);
		NombreUsu.setBorder(null);
		NombreUsu.setBackground(new Color(248, 248, 255));
		NombreUsu.setBounds(130, 100, 252, 19);
		contentPane.add(NombreUsu);
		
		
		TipoUsuario = new JTextField();
		TipoUsuario.setForeground(new Color(0, 0, 0));
		TipoUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		TipoUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		TipoUsuario.setFont(new Font(FONT_TAHOMA, Font.PLAIN, 15));
		TipoUsuario.setEditable(false);
		TipoUsuario.setColumns(10);
		TipoUsuario.setBorder(null);
		TipoUsuario.setBackground(new Color(248, 248, 255));
		TipoUsuario.setBounds(507, 100, 252, 19);
		contentPane.add(TipoUsuario);
		 
		
		JButton btnMostrarResueltos = new JButton("Propuestas resueltas");
		btnMostrarResueltos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMostrarResueltos.setForeground(new Color(0, 0, 0));
		btnMostrarResueltos.setFont(new Font(FONT_TAHOMA, Font.BOLD, 19));
		btnMostrarResueltos.setBackground(new Color(255, 182, 193));
		btnMostrarResueltos.setBounds(7, 240, 244, 122);
		btnMostrarResueltos.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				presentacion.PantallaPropuestasResueltas p;
				try {
					 GestorConsultas gestor = new GestorConsultas();
					 if (gestor.estadoResuelto().size()==0) {
				    	 JOptionPane.showMessageDialog(null, "No existen propuestas resueltas en este momento.", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);}
					 else {
					p = new presentacion.PantallaPropuestasResueltas();
					p.setVisible(true);
					setVisible(false);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
				}

			}
	});
		contentPane.add(btnMostrarResueltos);
		
		JLabel lblNewLabel = new JLabel("Nombre usuario:");
		lblNewLabel.setFont(new Font(FONT_TAHOMA, Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 96, 113, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de usuario:");
		lblNewLabel_1.setFont(new Font(FONT_TAHOMA, Font.PLAIN, 15));
		lblNewLabel_1.setBounds(392, 96, 113, 26);
		contentPane.add(lblNewLabel_1);
	}
	public String devolverDNI(String usu, int tipoUsu) {
		String tipo;
		String sql= null;
		if (tipoUsu == 0) {
			sql= "SELECT dni FROM Profesor WHERE nombre='"+usu+"'";
		} else {
			sql= "SELECT dni FROM Estudiante WHERE nombre='"+usu+"'";
		}
		 Vector<Object> nom;
		try {
			nom = GestorBD.getAgente().select(sql);
			tipo=(nom.get(0).toString().replace("[", "").replace("]", ""));
			
			return tipo;
		} catch (Exception e1) {
			//e1.printStackTrace();
		}
		return "";
}
}
