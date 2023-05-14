package presentacion;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

//import com.jgoodies.forms.factories.DefaultComponentFactory;

import persistencia.GestorBD;
import negocio.controllers.GestorConsultas;
import negocio.controllers.GestorPropuestasCursos;
import negocio.entities.CursoPropio;
import negocio.entities.EstadoCurso;
import persistencia.CursoPropioDAO;

import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Cursor;

public class PantallaAceptarCursos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaAceptarCursos frame = new PantallaAceptarCursos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public PantallaAceptarCursos() throws Exception {
		setTitle("UCLM");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\34636\\git\\CodeLabs\\CodeLabs_ISO2\\imagenes\\logoUCLM.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAceptar.setForeground(new Color(0, 0, 0));
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAceptar.setBackground(new Color(152, 251, 152));
		btnAceptar.setBounds(345, 346, 114, 49);
		btnAceptar.hide();
		btnAceptar.addActionListener((ActionListener) new ActionListener() {
    		

			public void actionPerformed(ActionEvent e) {
				
				}});
		contentPane.add(btnAceptar);
		
		JButton btnDenegar = new JButton("Denegar");
		btnDenegar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDenegar.hide();
		btnDenegar.setForeground(new Color(0, 0, 0));
		btnDenegar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDenegar.setBackground(new Color(255, 69, 0));
		btnDenegar.setBounds(345, 412, 114, 49);

		contentPane.add(btnDenegar);
		GestorConsultas gestor = new GestorConsultas();
		Vector<Object> a = gestor.consultarCusos("SELECT id,nombre,ECTS,centro,director,tipo FROM CursoPropio WHERE `estado`= 'PROPUESTO'");
		DefaultListModel listModel;
		listModel = new DefaultListModel();
		JList list = new JList(listModel);
		list.setBackground(new Color(255, 182, 193));
	
		list.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                	btnDenegar.addActionListener((ActionListener) new ActionListener() {
                		

            			public void actionPerformed(ActionEvent e) {
            				try {
            					GestorPropuestasCursos gestorCursos= new GestorPropuestasCursos();
            					
            					String charsToRemove = "[] ";
            					
            					String b=a.get(list.getSelectedIndex()).toString().split(",")[0];
            					
            					for (char c : charsToRemove.toCharArray()) {
                		       		b = b.replace(String.valueOf(c), "");
                		       	}
                		       
                		        int idTit = Integer.parseInt(b);
                		        EstadoCurso estado = EstadoCurso.PROPUESTA_RECHAZADA;
                		        CursoPropio curso = new CursoPropio(idTit, estado);
            					
            					gestorCursos.editarPropuestaCurso(curso, 1);
            					JOptionPane.showInputDialog("Envie los motivos de la denegación del curso.");
            					listModel.remove(list.getSelectedIndex());
            					
            				} catch (Exception e1) {
            					e1.printStackTrace();
            				}
            			
            				
            				}});
                	btnAceptar.addActionListener((ActionListener) new ActionListener() {
            			public void actionPerformed(ActionEvent e) {
            				try {
            					GestorPropuestasCursos gestorCursos= new GestorPropuestasCursos();
            					
            					String charsToRemove = "[] ";
            					
            					String b=a.get(list.getSelectedIndex()).toString().split(",")[0];
            					
            					for (char c : charsToRemove.toCharArray()) {
                		       		b = b.replace(String.valueOf(c), "");
                		       	}
                		       
                		        int idTit = Integer.parseInt(b);
                		        EstadoCurso estado = EstadoCurso.VALIDADO;
                		        CursoPropio curso = new CursoPropio(idTit, estado);
            					
            					gestorCursos.editarPropuestaCurso(curso, 1);
            					
            					listModel.remove(list.getSelectedIndex());
            				} catch (Exception e1) {
            					e1.printStackTrace();
            				}
            				
            				}});
                	
                	btnAceptar.show();
                	btnDenegar.show();
                if (listModel.size()==0) {
                	presentacion.PantallaEmpleadosVicerrectorado p = new presentacion.PantallaEmpleadosVicerrectorado();
                	p.setVisible(true);
                	setVisible(false);
                }
                	}
            }
        });

		
		for (int b=0; b<a.size();b++) {
			listModel.addElement(a.get(b).toString().replace("[", "").replace("]", ""));		
		}
		

		list.setBounds(115, 11, 574, 324);
		contentPane.add(list);
		


	}

}
