

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/photo")
public class Photo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Photo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8;");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\" dir=\"ltr\">\r\n" + 
				"\r\n" + 
				"<head>\r\n" + 
				"  <meta charset=\"utf-8\">\r\n" + 
				"  <title>���� ������</title>\r\n" + 
				"  <link rel=\"stylesheet\" href=\"./css/common.css\">\r\n" + 
				"  <link rel=\"stylesheet\" href=\"./css/photo.css\">\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"  <header>\r\n" + 
				"    <nav>\r\n" + 
				"      <ul class=\"upper_ul\">\r\n" + 
				"        <li class=\"upper_li\">\r\n" + 
				"          <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/today\">��ÿ���?</a>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"        <li class=\"upper_li\">\r\n" + 
				"          <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/photo\">�� ����</a>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"        <li class=\"upper_li\">\r\n" + 
				"          <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/aboutme\">�ڱ�Ұ�</a>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"        <li class=\"upper_li\">\r\n" + 
				"          <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/index\">Ȩ</a>\r\n" + 
				"        </li>\r\n" + 
				"      </ul>\r\n" + 
				"    </nav>\r\n" + 
				"  </header>\r\n" + 
				"\r\n" + 
				"  <!-- ����(���� ������) -->\r\n" + 
				"  <section>\r\n" + 
				"    <article>\r\n" + 
				"      <img src=\"./imgs/alakazam.jpg\" alt=\"���ϸ�-�ĵ�\">\r\n" + 
				"      <span class=\"photo_info\">\r\n" + 
				"        ���ϸ��Ϳ��� ������ �ĵ��� �ʴɷ� ���ϸ��̿���.<br>\r\n" + 
				"        ���� ���� �����ϴ� ĳ�����̱⵵ ������.<br>\r\n" + 
				"        �����ְ� ��ī�ο�鼭 ���غ��̴� �̹����� �ʹ� ���ƿ䤾��<br>\r\n" + 
				"      </span>\r\n" + 
				"    </article>\r\n" + 
				"    <hr>\r\n" + 
				"    <article>\r\n" + 
				"      <img src=\"./imgs/dev_kazam.jpg\" alt=\"������-�ĵ�\">\r\n" + 
				"      <span class=\"photo_info\">\r\n" + 
				"        �� �� ���� ���� ���̽��̿���~ <br>\r\n" + 
				"        �׷��� ���� ���̽㺸�ٵ� ������ �ڹٸ� ���ϰ� �;��! <br>\r\n" + 
				"        ������ ���߿� ���� ��̸� ���ݾ� ��ã������ ����ϰ� �־�� :) <br>\r\n" + 
				"      </span>\r\n" + 
				"    </article>\r\n" + 
				"  </section>\r\n" + 
				"  <!-- ���� ���� ������ �� -->\r\n" + 
				"\r\n" + 
				"  <footer>\r\n" + 
				"    <b>�����ϴ� �ĵ�</b>\r\n" + 
				"    <p>[Github] <a class=\"github_url\" href=\"https://github.com/loveAlakazam\">https://github.com/loveAlakazam</a></p>\r\n" + 
				"    <p>[Blog] <a href=\"https://ek12mv2.tistory.com/\">https://ek12mv2.tistory.com/</a></p>\r\n" + 
				"  </footer>\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>");
	}

}
