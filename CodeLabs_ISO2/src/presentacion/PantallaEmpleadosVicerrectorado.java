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

public class PantallaEmpleadosVicerrectorado extends JFrame {



	private JPanel contentPane;
	protected JTextField NombreUsu;
	protected JTextField TipoUsuario;
	presentacion.PantallaLogin p = new presentacion.PantallaLogin();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaEmpleadosVicerrectorado frame = new PantallaEmpleadosVicerrectorado();
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
	public PantallaEmpleadosVicerrectorado() {
		setTitle("UCLM");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\34636\\git\\CodeLabs\\CodeLabs_ISO2\\imagenes\\logoUCLM.jpg"));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRealizarPropuesta = new JButton("Evaluar Propuestas Disponibles");
		btnRealizarPropuesta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRealizarPropuesta.setForeground(new Color(0, 0, 0));
		btnRealizarPropuesta.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnRealizarPropuesta.setBackground(new Color(255, 182, 193));
		btnRealizarPropuesta.setBounds(86, 266, 604, 99);
		contentPane.add(btnRealizarPropuesta);
		btnRealizarPropuesta.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					presentacion.PantallaAceptarCursos p;
					try {
						GestorConsultas gestor = new GestorConsultas();
						Vector<Object> a = gestor.consultarCusos("SELECT * FROM CursoPropio WHERE `estado`= 'PROPUESTO'");
						if (a.size()==0) {
							JOptionPane.showMessageDialog(null, "No existen propuestas de curso en espera en este momento.", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
						p = new presentacion.PantallaAceptarCursos();
						p.setVisible(true);
						setVisible(false);
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
		});
		
		
		NombreUsu = new JTextField();
		NombreUsu.setHorizontalAlignment(SwingConstants.RIGHT);
		NombreUsu.setFont(new Font("Tahoma", Font.BOLD, 15));
		NombreUsu.setText("NOMBRE");
		NombreUsu.setEditable(false);
		NombreUsu.setColumns(10);
		NombreUsu.setBorder(null);
		NombreUsu.setBackground(Color.WHITE);
		NombreUsu.setBounds(216, 129, 336, 19);
		contentPane.add(NombreUsu);
		
		
		TipoUsuario = new JTextField();
		TipoUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		TipoUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		TipoUsuario.setText("TIPO USUARIO\r\n");
		TipoUsuario.setEditable(false);
		TipoUsuario.setColumns(10);
		TipoUsuario.setBorder(null);
		TipoUsuario.setBackground(Color.WHITE);
		TipoUsuario.setBounds(216, 175, 336, 19);
		contentPane.add(TipoUsuario);

	}

}