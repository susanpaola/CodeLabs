package negocio.entities;

import java.util.*;

public class Centro {

	Collection<CursoPropio> cursoPropios;
	Collection<ProfesorUCLM> plantilla;
	private String nombre;
	private String localizacion;
	private int attribute;
	
	public Centro(Collection<CursoPropio> cursoPropios, Collection<ProfesorUCLM> plantilla, String nombre,
			String localizacion, int attribute) {
		
	}
	
	public Centro(String nombre, String localizacion, int attribute) {
		
	}
	

	public Collection<CursoPropio> getCursoPropios(){
		return cursoPropios;
	}
	
	public void setCursoPropios(Collection<CursoPropio> cursoPropios) {
		
	}
	
	public Collection<ProfesorUCLM> getPlantilla(){
		return plantilla;
	}
	
	public void setPlantilla(Collection<ProfesorUCLM> plantilla) {
		
	}
	
}