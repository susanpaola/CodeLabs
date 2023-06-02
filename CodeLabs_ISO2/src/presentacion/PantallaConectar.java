package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import persistencia.CursoPropioDAO;
import persistencia.GestorBD;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import java.awt.SystemColor;
import java.awt.Cursor;

public class PantallaConectar extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaConectar frame = new PantallaConectar();
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
	public PantallaConectar() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(176, 224, 230));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton conectBtn = new JButton("CREAR CONEXION");
		conectBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		conectBtn.setForeground(new Color(139, 0, 0));
		conectBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		conectBtn.setBackground(new Color(255, 255, 255));
		conectBtn.setBounds(83, 85, 274, 113);


		contentPane.add(conectBtn);

		JLabel lblNewLabel = new JLabel("Conexion a la Base de Datos de la UCLM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 401, 28);
		contentPane.add(lblNewLabel);

		conectBtn.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GestorBD.connect();
					presentacion.PantallaLogin p = new presentacion.PantallaLogin();
					p.mostrar();
					setVisible(false);
				}catch (Exception ea) {
				JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos. Revise sus datos de conexión", "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
				}
			}
		});
	}
}