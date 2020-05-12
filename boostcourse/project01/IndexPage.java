
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/index")
public class IndexPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public IndexPage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8;");
		PrintWriter out= response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\" dir=\"ltr\">\r\n" + 
				"  <head>\r\n" + 
				"    <meta charset=\"utf-8\">\r\n" + 
				"    <title>����ȭ�� ������</title>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"./css/common.css\">\r\n" + 
				"    <link rel=\"stylesheet\" href=\"./css/index.css\">\r\n" + 
				"  </head>\r\n" + 
				"\r\n" + 
				"  <body>\r\n" + 
				"    <header>\r\n" + 
				"      <nav>\r\n" + 
				"        <ul class=\"upper_ul\">\r\n" + 
				"          <li class=\"upper_li\">\r\n" + 
				"            <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/today\">��ÿ���?</a>\r\n" + 
				"          </li>\r\n" + 
				"\r\n" + 
				"          <li class=\"upper_li\">\r\n" + 
				"            <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/photo\">�� ����</a>\r\n" + 
				"          </li>\r\n" + 
				"\r\n" + 
				"          <li class=\"upper_li\">\r\n" + 
				"            <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/aboutme\">�ڱ�Ұ�</a>\r\n" + 
				"          </li>\r\n" + 
				"\r\n" + 
				"          <li class=\"upper_li\">\r\n" + 
				"            <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/index\">Ȩ</a>                \r\n" + 
				"          </li> \r\n" + 
				"        </ul>\r\n" + 
				"      </nav>\r\n" + 
				"    </header>\r\n" + 
				"\r\n" + 
				"    <!-- ����(���������� �ڵ尡 �ٸ�.) -->\r\n" + 
				"    <section>\r\n" + 
				"      <h1>Welcome!</h1>\r\n" + 
				"      <article class=\"header_info\">\r\n" + 
				"          �ȳ�? ���� Back End �����ڰ� �ʹ� �ǰ� ���� <b>�ĵ�</b>�̾�!<br>\r\n" + 
				"          ������ �ݰ��� ó������ ������ ���������� �����þ�~\r\n" + 
				"      </article>\r\n" + 
				"\r\n" + 
				"      <ul class=\"inner_ul\">\r\n" + 
				"        <li class=\"inner_li\">\r\n" + 
				"          <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/photo\">������</a>\r\n" + 
				"        </li>\r\n" + 
				"        \r\n" + 
				"        <li class=\"inner_li\">\r\n" + 
				"          <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/aboutme\">�ڱ� �Ұ�</a>\r\n" + 
				"        </li>\r\n" + 
				"      </ul>\r\n" + 
				"\r\n" + 
				"      <img src=\"./imgs/maps.JPG\" width=\"50%\" height=\"50%\" alt=\"myhouse\">\r\n" + 
				"    </section>\r\n" + 
				"    <!-- ���� �� -->\r\n" + 
				"\r\n" + 
				"    <footer>\r\n" + 
				"      <b>�����ϴ� �ĵ�</b>\r\n" + 
				"      <p>[Github] <a class=\"github_url\" href=\"https://github.com/loveAlakazam\">https://github.com/loveAlakazam</a></p>\r\n" + 
				"      <p>[Blog] <a href=\"https://ek12mv2.tistory.com/\">https://ek12mv2.tistory.com/</a></p>\r\n" + 
				"    </footer>\r\n" + 
				"  </body>\r\n" + 
				"</html>\r\n" + 
				"");
		
	}
}
