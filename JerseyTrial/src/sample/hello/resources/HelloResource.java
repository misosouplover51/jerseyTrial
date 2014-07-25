package sample.hello.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import javax.xml.bind.annotation.XmlRootElement;


@Path("/hello")
public class HelloResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)	//JSON形式でのリソース出力
//	public String sayHello() {
//		return "";
//	}

    public HelloResultDto helloJson() {
        HelloResultDto dto = new HelloResultDto();
        dto.name1 ="AAA";
        dto.name2 ="BBB";
        dto.name3 ="CCC";
        dto.name4 ="DDD";
 //       dto.array1[1] = "ar1";
        return dto;
    }
}

//@XmlRootElement
//public class HelloResultDto {
//
//    public String name1;
//    public String name2;
//    public String name3;
//    public String name4;
//}