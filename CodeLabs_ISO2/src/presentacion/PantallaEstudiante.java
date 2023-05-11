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

public class PantallaEstudiante extends JFrame {
	
	private JPanel contentPane;
	protected final JTextField NombreUsu;
	protected final JTextField TipoUsuario;
	presentacion.PantallaLogin p = new presentacion.PantallaLogin();
	private JLabel lblNewLabel;
	private JLabel lblTipoUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaEstudiante frame = new PantallaEstudiante();
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
	public PantallaEstudiante() {
		setTitle("UCLM");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\34636\\Documents\\3º 22-23\\1º CUATRI\\ISO 2\\ProyectoISO\\logoUCLM.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMostrarPendientes = new JButton("Realizar matriculaci\u00F3n");
		btnMostrarPendientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMostrarPendientes.setForeground(new Color(192, 192, 192));
		btnMostrarPendientes.setBackground(SystemColor.textHighlight);
		btnMostrarPendientes.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMostrarPendientes.setBounds(201, 281, 310, 99);
		contentPane.add(btnMostrarPendientes);
		btnMostrarPendientes.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					presentacion.PantallaMatricula p;
					try {
						 GestorConsultas gestor = new GestorConsultas();
						 
						 if (gestor.cursosDisponibles().size()==0) {
					    	 JOptionPane.showMessageDialog(null, "No existen propuestas pendientes en este momento.", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);}
						 else {
							p = new presentacion.PantallaMatricula();
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
		
		
		NombreUsu = new JTextField();
		NombreUsu.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		NombreUsu.setEditable(false);
		NombreUsu.setHorizontalAlignment(SwingConstants.RIGHT);
		NombreUsu.setFont(new Font("Tahoma", Font.BOLD, 15));
		NombreUsu.setColumns(10);
		NombreUsu.setBorder(null);
		NombreUsu.setBackground(Color.WHITE);
		NombreUsu.setBounds(292, 103, 287, 19);
		contentPane.add(NombreUsu);
		
		
		TipoUsuario = new JTextField();
		TipoUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		TipoUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		TipoUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		TipoUsuario.setEditable(false);
		TipoUsuario.setColumns(10);
		TipoUsuario.setBorder(null);
		TipoUsuario.setBackground(Color.WHITE);
		TipoUsuario.setBounds(292, 145, 287, 19);
		contentPane.add(TipoUsuario);
		
		lblNewLabel = new JLabel("Nombre Usuario:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(167, 107, 130, 13);
		contentPane.add(lblNewLabel);
		
		lblTipoUsuario = new JLabel("Tipo Usuario:");
		lblTipoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoUsuario.setBounds(167, 149, 130, 13);
		contentPane.add(lblTipoUsuario);
		 
		
		
		//JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("");
		//lblNewJgoodiesLabel_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\git\\PROYECTOS_GIT\\TecnoSoftware\\Proyecto-ISO-2-TecnoSoftware\\Proyecto_TecnoSoftware\\Imagenes\\images2.jpg"));
	//	lblNewJgoodiesLabel_1.setBounds(609, 39, 125, 125);
	//	contentPane.add(lblNewJgoodiesLabel_1);
	}

}