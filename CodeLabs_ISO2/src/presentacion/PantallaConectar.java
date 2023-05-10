package presentacion;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaConectar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton conectBtn = new JButton("ENTRAR");
		conectBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		conectBtn.setForeground(Color.WHITE);
		conectBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		conectBtn.setBackground(SystemColor.textHighlight);
		conectBtn.setBounds(141, 172, 274, 113);
		contentPane.add(conectBtn);
	}

}
