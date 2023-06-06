package negocio.entities;

//import java.util.Date;

public class Materia {

	String responsable2;
	private String nombre;
	private double horas;
	private String fechaInicio;
	private String fechaFin;
	private int curso;
	Profesor responsable;
	
	public String getResponsable2() {
		return responsable2;
	}
	public void setResponsable2(String responsable2) {
		this.responsable2 = responsable2;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	public Profesor getResponsable() {
		return responsable;
	}
	public void setResponsable(Profesor responsable) {
		this.responsable = responsable;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public Materia(Profesor responsable, String nombre, double horas, 
			String fechaInicio, String fechaFin, int curso) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.curso = curso;
		this.responsable = responsable;
		this.nombre = nombre;
		this.horas = horas;
		
	}
	
	public Materia(String responsable, String nombre, int horas, String of1, 
			String of2, int curso) {
		
		super();
		this.responsable2 = responsable;
		this.nombre = nombre;
		this.horas = horas;
		this.fechaInicio = of1;
		this.fechaFin = of2;
		this.curso = curso;
	}
	

}
