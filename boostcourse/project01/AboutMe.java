

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/aboutme")
public class AboutMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AboutMe() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8;");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\" dir=\"ltr\">\r\n" + 
				"  <head>\r\n" + 
				"    <meta charset=\"utf-8\">\r\n" + 
				"    <title>�ڱ�Ұ� ������</title>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"./css/common.css\">\r\n" + 
				"    <link rel=\"stylesheet\" href=\"./css/aboutme.css\">\r\n" + 
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
				"    <!-- ����(�ڱ�Ұ� ������) -->\r\n" + 
				"    <section>\r\n" + 
				"      <article>\r\n" + 
				"          <h1>�̷� ���� ���ؿ�!</h1>\r\n" + 
				"          <p> \r\n" + 
				"            ���� ���� ���� �Ͱ� ���ӹ���� ���� ���� �����ؿ�<br>\r\n" + 
				"            ���� �ѹ� ������ ������ ������ �������ؿ�. <br>\r\n" + 
				"            ��� ���� �ڻ���ε� �����ϴ� �� �ʺ��ڿ��� �Ф�\r\n" + 
				"          </p>\r\n" + 
				"      </article>\r\n" + 
				"\r\n" + 
				"      <article>\r\n" + 
				"        <h1>���� ��Ʈ������</h1>\r\n" + 
				"        <ul class=\"port_ul\">\r\n" + 
				"            <li class=\"port_li\">\r\n" + 
				"                <a href=\"https://blog.naver.com/rose1216_\"><b>https://blog.naver.com/rose1216_</b></a>\r\n" + 
				"                <p>�� ���л�Ȱ Ȱ���� ������ ���̹� ��α׿���.</p>\r\n" + 
				"            </li>\r\n" + 
				"\r\n" + 
				"            <li>\r\n" + 
				"                <a href=\"https://github.com/loveAlakazam\"> <b>https://github.com/loveAlakazam</b></a>\r\n" + 
				"                <p>�� ����꿡��. �����ڵ带 ���⼭ �� �� ����!</p>\r\n" + 
				"            </li>\r\n" + 
				"            \r\n" + 
				"            <li>\r\n" + 
				"                <a href=\"https://ek12mv2.tistory.com\"> <b>https://ek12mv2.tistory.com</b></a>\r\n" + 
				"                <p>�� Ƽ���丮 ��α׿���. ���⼭ ����Ȱ���� ���� ������ ����մϴ� ^^</p>\r\n" + 
				"            </li>\r\n" + 
				"        </ul>\r\n" + 
				"      </article>\r\n" + 
				"\r\n" + 
				"      <article>\r\n" + 
				"          <h1>���� �ֱ� ������Ʈ ����</h1>\r\n" + 
				"          <p>\r\n" + 
				"            ���� �ֱٿ� ���� ������Ʈ�� �ڱ�Ұ� �������Դϴ�. <br>\r\n" + 
				"            �����α׷��� ���ٰ� �����ߴµ�, �̷��� ������ ������ ��Ƴ׿�Ф�. <br>\r\n" + 
				"            ����Ʈ����� html, css�� ����߽��ϴ�. <br>\r\n" + 
				"            WAS�� ����ġ ��Ĺ�� ����߽��ϴ�. �׸��� ������ �̿��ؼ� ������ �����߽��ϴ�. \r\n" + 
				"          </p>\r\n" + 
				"      </article>\r\n" + 
				"    </section>\r\n" + 
				"    <!-- ���� �ڱ�Ұ������� �� -->\r\n" + 
				"\r\n" + 
				"    <footer>\r\n" + 
				"      <b>�����ϴ� �ĵ�</b>\r\n" + 
				"      <p>[Github] <a class=\"github_url\" href=\"https://github.com/loveAlakazam\">https://github.com/loveAlakazam</a></p>\r\n" + 
				"      <p>[Blog] <a href=\"https://ek12mv2.tistory.com/\">https://ek12mv2.tistory.com/</a></p>\r\n" + 
				"    </footer>\r\n" + 
				"  </body>\r\n" + 
				"</html>");
	}
}
