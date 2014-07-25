package helloworld;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.servlet.*;
import javax.servlet.http.*;

//import java.net.InetSocketAddress;
//import java.net.Proxy;

public class HelloWorld extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException{
		//RESTでの別アプリケーションへのアクセス
		//URL:localhost:8080/JerseyTrial/rest/hello
		URL url = new URL("http://localhost:8080/JerseyTrial/rest/hello");

//      Proxy proxy = new Proxy(Proxy.Type.HTTP,
//                new InetSocketAddress("demovm64", 3128));//プロキシサーバ　ドメイン名やIPアドレス、ポート番号

//		Proxy proxy = new Proxy(Proxy.Type.HTTP,
//                new InetSocketAddress("proxy.tky.lightwell.co.jp", 8080));//プロキシサーバ　ドメイン名やIPアドレス、ポート番号
//

		HttpURLConnection connection = (HttpURLConnection)url.openConnection();

//		HttpURLConnection connection = (HttpURLConnection)url.openConnection(proxy);

		connection.setDoOutput(true);
//		connection.setUseCashes(false);
		connection.setRequestMethod("GET");

		connection.connect();


		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
		String httpSource = new String();
		String str;
		while ( null != ( str = bufferReader.readLine() ) ) {
		    httpSource = httpSource + str;
		}
		bufferReader.close();
		connection.disconnect();


		response.setContentType("text/html");

		//

		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Hello World!</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>Hello World!</h1>");
//		out.println("</body>");
//		out.println("</html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello World!</title>");
		out.println("</head>");
		out.println("<body>");
		//表示内容のセット
//		String st = returnJSON;
		out.println("<h1>" + httpSource +"</h1>");
		out.println("</body>");
		out.println("</html>");

	}
}