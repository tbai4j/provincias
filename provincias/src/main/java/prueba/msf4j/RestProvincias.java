package prueba.msf4j;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/provincias")
public class RestProvincias {
	
    
    @GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProvincias() {

    	Provincias provincias=new Provincias();
    	return Response.ok(provincias).build();
	}
    
    @GET
    @Path("/{codigo}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProvincia(@PathParam("codigo") String codigo) {
    	
    	
    	Provincias provincias=new Provincias();
    	Provincia prov=provincias.getProvincia(codigo);
    	if(null!=prov) {
    		System.out.println("prov ok");
    		return Response.ok(prov).build();
    	}else {
    		ApiError apierror=new ApiError(2,"No se encuentra provincia con código "+codigo,"Ez dago "+codigo+" kodea duen probintziarik");
    		return Response.ok(apierror).build();
    	}
    }

}
