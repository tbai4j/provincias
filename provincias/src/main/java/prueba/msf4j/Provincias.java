package prueba.msf4j;

import java.util.ArrayList;
import java.util.List;


public class Provincias {
	
	private List<Provincia> provincias=null;
	
	private static List<Provincia> _listaProvincias = new ArrayList<Provincia>() {
        
		private static final long serialVersionUID = 1L;

		{
            add(new Provincia("01","Alava", "Araba"));
            add(new Provincia("20","Guipuzcoa", "Gipuzkoa"));
            add(new Provincia("48","Bizcaya", "Bizkaia"));
            
        }
    };
    
    public  Provincias() {
    	this.provincias=_listaProvincias;
    }

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}
	
	public Provincia getProvincia(String codigo) {
		for (int i=0;i<this.provincias.size();i++) {
			Provincia prov=this.provincias.get(i);
			if(null!=prov && prov.getCodigo().equals(codigo)){
				return prov;
			}
			
		}
		return null;
	}

}
