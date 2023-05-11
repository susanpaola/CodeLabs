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

public class PantallaDireccionCursos extends JFrame {
	
	private JPanel contentPane;
	protected final JTextField NombreUsu;
	protected final JTextField TipoUsuario;
	presentacion.PantallaLogin p = new presentacion.PantallaLogin();

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
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public PantallaDireccionCursos() {
		setTitle("UCLM");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\34636\\Documents\\3º 22-23\\1º CUATRI\\ISO 2\\ProyectoISO\\logoUCLM.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMostrarPendientes = new JButton("Propuestas pendientes");
		btnMostrarPendientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMostrarPendientes.setForeground(new Color(192, 192, 192));
		btnMostrarPendientes.setBackground(SystemColor.textHighlight);
		btnMostrarPendientes.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMostrarPendientes.setBounds(103, 330, 228, 99);
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
						e1.printStackTrace();
					}

				}
		});
		
		
		//JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("");
		//lblNewJgoodiesLabel.setIcon(new ImageIcon("C:\\Users\\Usuario\\git\\PROYECTOS_GIT\\TecnoSoftware\\Proyecto-ISO-2-TecnoSoftware\\Proyecto_TecnoSoftware\\Imagenes\\ImagenUCLM.png"));
		//lblNewJgoodiesLabel.setBounds(20, 10, 310, 99);
		//contentPane.add(lblNewJgoodiesLabel);
		
		JButton btnRealizarPropuesta = new JButton("Realizar propuesta");
		btnRealizarPropuesta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRealizarPropuesta.setForeground(new Color(192, 192, 192));
		btnRealizarPropuesta.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRealizarPropuesta.setBackground(SystemColor.textHighlight);
		btnRealizarPropuesta.setBounds(461, 330, 228, 99);
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
		NombreUsu.setHorizontalAlignment(SwingConstants.RIGHT);
		NombreUsu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		NombreUsu.setColumns(10);
		NombreUsu.setBorder(null);
		NombreUsu.setBackground(new Color(192, 192, 192));
		NombreUsu.setBounds(461, 132, 252, 19);
		contentPane.add(NombreUsu);
		
		
		TipoUsuario = new JTextField();
		TipoUsuario.setForeground(new Color(0, 0, 0));
		TipoUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		TipoUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		TipoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TipoUsuario.setEditable(false);
		TipoUsuario.setColumns(10);
		TipoUsuario.setBorder(null);
		TipoUsuario.setBackground(new Color(192, 192, 192));
		TipoUsuario.setBounds(461, 196, 252, 19);
		contentPane.add(TipoUsuario);
		 
		
		
		//JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("");
		//lblNewJgoodiesLabel_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\git\\PROYECTOS_GIT\\TecnoSoftware\\Proyecto-ISO-2-TecnoSoftware\\Proyecto_TecnoSoftware\\Imagenes\\images2.jpg"));
		//lblNewJgoodiesLabel_1.setBounds(609, 39, 125, 125);
		//contentPane.add(lblNewJgoodiesLabel_1);
		
		JButton btnMostrarResueltos = new JButton("Propuestas resueltas");
		btnMostrarResueltos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMostrarResueltos.setForeground(new Color(192, 192, 192));
		btnMostrarResueltos.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMostrarResueltos.setBackground(SystemColor.textHighlight);
		btnMostrarResueltos.setBounds(103, 146, 228, 99);
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
					e1.printStackTrace();
				}

			}
	});
		contentPane.add(btnMostrarResueltos);
		
		JLabel lblNewLabel = new JLabel("Nombre usuario");
		lblNewLabel.setBounds(457, 95, 146, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de usuario");
		lblNewLabel_1.setBounds(461, 171, 100, 14);
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
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return "";
}
}
