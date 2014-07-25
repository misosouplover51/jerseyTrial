package junit.helloworldtest;

import static org.junit.Assert.*;
import helloworld.HelloWorld;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class HelloWorldTest {


	@Test
	public void testDoGetHttpServletRequestHttpServletResponse() {
//		fail("まだ実装されていません");
		HelloWorld target = new HelloWorld();



		MockHttpServletRequest req = new MockHttpServletRequest();
		MockHttpServletResponse resp = new MockHttpServletResponse();
		try {
			target.init();
			target.doGet(req, resp);
			target.destroy();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Oops!!");
		}

	}

}
