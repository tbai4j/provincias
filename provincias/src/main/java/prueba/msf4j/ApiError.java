package prueba.msf4j;


public class ApiError {
	private int codigo;
	private String desc_es;
	private String desc_eu;
	
	
	public ApiError(int codigo, String es, String eu) {
		this.codigo=codigo;
		this.desc_es=es;
		this.desc_eu=eu;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDesc_es() {
		return desc_es;
	}
	public void setDesc_es(String desc_es) {
		this.desc_es = desc_es;
	}
	public String getDesc_eu() {
		return desc_eu;
	}
	public void setDesc_eu(String desc_eu) {
		this.desc_eu = desc_eu;
	}
}
