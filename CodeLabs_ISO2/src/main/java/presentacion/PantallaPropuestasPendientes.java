package presentacion;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import negocio.controllers.GestorConsultas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

//import com.jgoodies.forms.factories.DefaultComponentFactory;

import persistencia.CursoPropioDAO;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;

public class PantallaPropuestasPendientes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPropuestasPendientes frame = new PantallaPropuestasPendientes();
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
	public PantallaPropuestasPendientes() throws Exception {
		setTitle("UCLM");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\34636\\git\\CodeLabs\\CodeLabs_ISO2\\imagenes\\logoUCLM.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.setForeground(new Color(0, 0, 0));
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVolver.setBackground(new Color(255, 182, 193));
		btnVolver.setBounds(347, 391, 114, 49);
       	btnVolver.addActionListener((ActionListener) new ActionListener() {
    			public void actionPerformed(ActionEvent e) {			
     
        	presentacion.PantallaDireccionCursos p = new presentacion.PantallaDireccionCursos();
        	
        	p.setVisible(true);
        	setVisible(false);
        	}
        	});
		contentPane.add(btnVolver);
		GestorConsultas gestor = new GestorConsultas();
		
		DefaultListModel listModel;
		listModel = new DefaultListModel();
		JList list = new JList(listModel);
		list.setBackground(new Color(255, 228, 225));
		
		for (int b=0; b<gestor.estadoPendiente().size();b++) {
			listModel.addElement(gestor.estadoPendiente().get(b).toString().replace("[", "").replace("]", ""));		
		}

		list.setBounds(98, 32, 574, 324);
		contentPane.add(list);

      
 
	}

}