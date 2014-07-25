package sample.hello.resources;

//import javax.sound.midi.Track;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/data")
public class HelloPost {

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createDataInJSON(String data) {

        String result = "Data post: "+data;

        return Response.status(201).entity(result).build();
    }

}
