package negocio.entities;

//import java.util.Date;

public class Matricula {

	private int idMatricula;
	private int idTitulo;
	private String idEstudiante;
	private static ModoPago tipoPago;
	private String fecha;
	private boolean pagado;
	private int attributo;
	
	
	public int getIdMatricula() {
		return idMatricula;
	}
	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}
	public int getIdTitulo() {
		return idTitulo;
	}
	public void setIdTitulo(int idTitulo) {
		this.idTitulo = idTitulo;
	}
	public String getIdEstudiante() {
		return idEstudiante;
	}
	public void setIdEstudiante(String idEstudiante) {
		this.idEstudiante = idEstudiante;
	}
	public static ModoPago getTipoPago() {
		return tipoPago;
	}
	public static void setTipoPago(ModoPago tipoPago) {
		Matricula.tipoPago = tipoPago;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	public int getAttributo() {
		return attributo;
	}
	public void setAttributo(int attributo) {
		this.attributo = attributo;
	}

	

}