package com.barbaro.apidisfraces.resources;
import com.barbaro.apidisfraces.models.Articulo;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

//@Path("partes")
//  recurso para acceder aquí.//mapeo

@Path("partes")
public class ArticuloResource {
    
    @GET
    @Path("prueba")
    public String getPartes(){
        Articulo articulo = new Articulo();
        articulo.setId("1");
        articulo.setNombre("Batman");
        articulo.setDescripcion("Personaje de DC");
        articulo.setPrecio(150.0f);
        articulo.setMaterial("Seda");
        articulo.setTipo(Articulo.TipoArticulo.TORSO);
        articulo.setTalla("Mediano");
        articulo.setFotoUrl("https://i.blogs.es/24bcec/the-batman-affleck/1366_2000.jpg");
        articulo.setMaterial("Tela gruesa que pica");
        
        // return articulo.toString();
        return "{\"message\": \"ya funcionó\"}";
           //return  articulo.toString();
    }   

    @POST
    public String CrearPartes(){//regresa respuesta y es string
     return "";
    }
    
    
}
