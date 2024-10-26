package prueba.msf4j;

public class Provincia {

	private String codigo;
	private String nombre_es;
	private String nombre_eu;
	
	public Provincia(String codigo, String es, String eu) {
		this.codigo=codigo;
		this.nombre_es=es;
		this.nombre_eu=eu;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre_es() {
		return nombre_es;
	}
	public void setNombre_es(String nombre_es) {
		this.nombre_es = nombre_es;
	}
	public String getNombre_eu() {
		return nombre_eu;
	}
	public void setNombre_eu(String nombre_eu) {
		this.nombre_eu = nombre_eu;
	}
	
	
}
