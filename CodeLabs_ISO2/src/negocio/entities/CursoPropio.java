package negocio.entities;

import java.util.*;
import persistencia.*;

public class CursoPropio {

	private Collection<Matricula> matriculas;
	private Collection<Materia> materias;
	private EstadoCurso estado;
	private TipoCurso tipo;
	private String centro;
	private String director;
	private String secretario;
	
	CursoPropioDAO cursoPropioDao;
	private int id;
	private String nombre;
	private int ECTS;
	private String fechaIni; //Date
	private String fechaFin; //Date
	private double tasaMatricula;
	private int edicion;

	public CursoPropio(int id, String nombre, int eCTS, String fechaIni, String fechaFin,
			double tasaMatricula, int edicion, String centro, String director, String secretario,
			EstadoCurso estado, TipoCurso tipo) {
		this.id = id;
		this.centro = centro;
		this.director = director;
		this.secretario = secretario;
		this.estado = estado;
		this.ECTS = eCTS;
		this.nombre = nombre;
		this.tipo = tipo;
		this.tasaMatricula = tasaMatricula;
		this.edicion = edicion;
		this.estado = estado;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
	}
	
	public CursoPropio() {
		
	}
	
	public CursoPropio(int idTit, EstadoCurso estado2) {
		this.id = idTit;
		this.estado = estado2;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int string) {
		this.id = string;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getECTS() {
		return ECTS;
	}
	
	public void setECTS(int eCTS) {
		this.ECTS = eCTS;
	}
	
	public String getFechaInicio() {
		return fechaIni;
	}
	
	public void setFechaInicio(String date) {
		this.fechaIni = date;
	}
	
	public String getFechaFin() {
		return fechaFin;
	}
	
	public void setFechaFin(String date) {
		this.fechaFin = date;
	}
	
	public double getTasaMatricula() {
		return tasaMatricula;
	}

	public void setTasaMatricula(double tasaMatricula) {
		this.tasaMatricula = tasaMatricula;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	
	public String getCentro() {
		return centro;
	}
	
	public void setCentro(String centro) {
		this.centro = centro;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getSecretario() {
		return secretario;
	}
	
	public void setSecretario(String secretario) {
		this.secretario = secretario;
	}
	
	public EstadoCurso getEstadoCurso() {
		return estado;
	}
	
	public void setEstadoCurso(EstadoCurso estado) {
		this.estado = estado;
	}
	
	public TipoCurso getTipoCurso() {
		return tipo;
	}
	
	public void setTipoCurso(TipoCurso tipo) {
		this.tipo = tipo;
	}
		
	@Override
	public String toString() {
		return "CursoPropio [centro=" + centro + ", director=" + director + ", estado=" + estado + ", tipo=" + tipo
				+ ", id=" + id + ", nombre=" + nombre + ", ECTS=" + ECTS + ", fechaInicio=" + fechaIni
				+ ", fechaFin=" + fechaFin + ", tasaMatricula=" + tasaMatricula + ", edicion=" + edicion + "]";
	}
}
	
