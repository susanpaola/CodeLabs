package negocio.entities;

public class ProfesorUCLM extends Profesor {

	public ProfesorUCLM(String dni, String nombre, String apellidos, boolean doctor,
			Centro centroAdscripcion, CategoriaProfesor categoria, String apellidos2, 
			String nombre2, String dni2) {
		super(dni, nombre, apellidos, doctor);
		this.centroAdscripcion = centroAdscripcion;
		this.categoria = categoria;
		nombre = nombre2;
		apellidos = apellidos2;
		dni = dni2;
	}
	
	
	Centro centroAdscripcion;
	CategoriaProfesor categoria;
	private String nombre;
	private String apellidos;
	private String dni;
	
	
	public Centro getCentroAdscripcion() {
		return centroAdscripcion;
	}
	public void setCentroAdscripcion(Centro centroAdscripcion) {
		this.centroAdscripcion = centroAdscripcion;
	}
	public CategoriaProfesor getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaProfesor categoria) {
		this.categoria = categoria;
	}	
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String getApellidos() {
		return apellidos;
	}
	@Override
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	@Override
	public String getDni() {
		return dni;
	}
	@Override
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

}