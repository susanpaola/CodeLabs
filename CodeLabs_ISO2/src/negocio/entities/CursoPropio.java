package negocio.entities;

import java.util.*;
import persistencia.*;

public class CursoPropio {

	Collection<Matricula> matriculas;
	Centro centro;
	ProfesorUCLM director;
	ProfesorUCLM secretario;
	Collection<Materia> materias;
	EstadoCurso estado;
	TipoCurso tipo;
	CursoPropioDAO cursoPropioDao;
	private int id;
	private String nombre;
	private int ECTS;
	private Date fechaInicio;
	private Date fechaFin;
	private double tasaMatricula;
	private int edicion;

	public CursoPropio(int id, String nombre, int eCTS, String fechaIni, String fechaFin,
			double tasaMatricula, int edicion, String centro, String director, String secretario,
			EstadoCurso estado, TipoCurso tipo) {
		
	}
	
	public CursoPropio() {
		
	}
	
	public CursoPropio(int idTit, EstadoCurso estado2) {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int string) {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
	}
	
	public int getECTS() {
		return ECTS;
	}
	
	
}