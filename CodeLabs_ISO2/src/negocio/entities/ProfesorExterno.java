package negocio.entities;

public class ProfesorExterno extends Profesor {
	
	private String titulacion;

	public ProfesorExterno(String dni, String nombre, String apellidos, boolean doctor, String titulacion) {
		super(dni, nombre, apellidos, doctor);
		this.titulacion = titulacion;
		// TODO Auto-generated constructor stub
	}

	

}