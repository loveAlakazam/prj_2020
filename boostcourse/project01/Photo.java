

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
				"  <title>사진 페이지</title>\r\n" + 
				"  <link rel=\"stylesheet\" href=\"./css/common.css\">\r\n" + 
				"  <link rel=\"stylesheet\" href=\"./css/photo.css\">\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"  <header>\r\n" + 
				"    <nav>\r\n" + 
				"      <ul class=\"upper_ul\">\r\n" + 
				"        <li class=\"upper_li\">\r\n" + 
				"          <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/today\">몇시에요?</a>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"        <li class=\"upper_li\">\r\n" + 
				"          <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/photo\">내 사진</a>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"        <li class=\"upper_li\">\r\n" + 
				"          <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/aboutme\">자기소개</a>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"        <li class=\"upper_li\">\r\n" + 
				"          <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/index\">홈</a>\r\n" + 
				"        </li>\r\n" + 
				"      </ul>\r\n" + 
				"    </nav>\r\n" + 
				"  </header>\r\n" + 
				"\r\n" + 
				"  <!-- 본론(사진 페이지) -->\r\n" + 
				"  <section>\r\n" + 
				"    <article>\r\n" + 
				"      <img src=\"./imgs/alakazam.jpg\" alt=\"포켓몬-후딘\">\r\n" + 
				"      <span class=\"photo_info\">\r\n" + 
				"        포켓몬스터에서 나오는 후딘은 초능력 포켓몬이에요.<br>\r\n" + 
				"        제가 제일 좋아하는 캐릭터이기도 하지요.<br>\r\n" + 
				"        개성있고 날카로우면서 강해보이는 이미지가 너무 좋아요ㅎㅎ<br>\r\n" + 
				"      </span>\r\n" + 
				"    </article>\r\n" + 
				"    <hr>\r\n" + 
				"    <article>\r\n" + 
				"      <img src=\"./imgs/dev_kazam.jpg\" alt=\"개발자-후딘\">\r\n" + 
				"      <span class=\"photo_info\">\r\n" + 
				"        제 주 메인 언어는 파이썬이에요~ <br>\r\n" + 
				"        그런데 저는 파이썬보다도 요즘은 자바를 잘하고 싶어요! <br>\r\n" + 
				"        요즘은 개발에 대한 흥미를 조금씩 되찾으려고 노력하고 있어요 :) <br>\r\n" + 
				"      </span>\r\n" + 
				"    </article>\r\n" + 
				"  </section>\r\n" + 
				"  <!-- 본론 사진 페이지 끝 -->\r\n" + 
				"\r\n" + 
				"  <footer>\r\n" + 
				"    <b>개발하는 후딘</b>\r\n" + 
				"    <p>[Github] <a class=\"github_url\" href=\"https://github.com/loveAlakazam\">https://github.com/loveAlakazam</a></p>\r\n" + 
				"    <p>[Blog] <a href=\"https://ek12mv2.tistory.com/\">https://ek12mv2.tistory.com/</a></p>\r\n" + 
				"  </footer>\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>");
	}

}
