

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
				"    <title>자기소개 페이지</title>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"./css/common.css\">\r\n" + 
				"    <link rel=\"stylesheet\" href=\"./css/aboutme.css\">\r\n" + 
				"  </head>\r\n" + 
				"\r\n" + 
				"  <body>\r\n" + 
				"    <header>\r\n" + 
				"      <nav>\r\n" + 
				"        <ul class=\"upper_ul\">\r\n" + 
				"          <li class=\"upper_li\">\r\n" + 
				"            <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/today\">몇시에요?</a>\r\n" + 
				"          </li>\r\n" + 
				"\r\n" + 
				"          <li class=\"upper_li\">\r\n" + 
				"            <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/photo\">내 사진</a>\r\n" + 
				"          </li>\r\n" + 
				"\r\n" + 
				"          <li class=\"upper_li\">\r\n" + 
				"            <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/aboutme\">자기소개</a>\r\n" + 
				"          </li>\r\n" + 
				"\r\n" + 
				"          <li class=\"upper_li\">\r\n" + 
				"            <a class=\"menu_link\" href=\"http://localhost:8080/aboutme/index\">홈</a>                \r\n" + 
				"          </li> \r\n" + 
				"        </ul>\r\n" + 
				"      </nav>\r\n" + 
				"    </header>\r\n" + 
				"\r\n" + 
				"    <!-- 본론(자기소개 페이지) -->\r\n" + 
				"    <section>\r\n" + 
				"      <article>\r\n" + 
				"          <h1>이런 것을 잘해요!</h1>\r\n" + 
				"          <p> \r\n" + 
				"            저는 웹툰 보는 것과 게임방송을 보는 것을 좋아해요<br>\r\n" + 
				"            저는 한번 관심을 가지면 끝까지 집중을해요. <br>\r\n" + 
				"            노는 것은 박사급인데 공부하는 건 초보자에요 ㅠㅠ\r\n" + 
				"          </p>\r\n" + 
				"      </article>\r\n" + 
				"\r\n" + 
				"      <article>\r\n" + 
				"        <h1>나의 포트폴리오</h1>\r\n" + 
				"        <ul class=\"port_ul\">\r\n" + 
				"            <li class=\"port_li\">\r\n" + 
				"                <a href=\"https://blog.naver.com/rose1216_\"><b>https://blog.naver.com/rose1216_</b></a>\r\n" + 
				"                <p>제 대학생활 활동을 공유한 네이버 블로그에요.</p>\r\n" + 
				"            </li>\r\n" + 
				"\r\n" + 
				"            <li>\r\n" + 
				"                <a href=\"https://github.com/loveAlakazam\"> <b>https://github.com/loveAlakazam</b></a>\r\n" + 
				"                <p>제 깃허브에요. 개발코드를 여기서 볼 수 있죠!</p>\r\n" + 
				"            </li>\r\n" + 
				"            \r\n" + 
				"            <li>\r\n" + 
				"                <a href=\"https://ek12mv2.tistory.com\"> <b>https://ek12mv2.tistory.com</b></a>\r\n" + 
				"                <p>제 티스토리 블로그에요. 여기서 개발활동과 나의 생각을 기록합니다 ^^</p>\r\n" + 
				"            </li>\r\n" + 
				"        </ul>\r\n" + 
				"      </article>\r\n" + 
				"\r\n" + 
				"      <article>\r\n" + 
				"          <h1>나의 최근 프로젝트 설명</h1>\r\n" + 
				"          <p>\r\n" + 
				"            제가 최근에 만든 프로젝트는 자기소개 페이지입니다. <br>\r\n" + 
				"            웹프로그래밍 쉽다고 생각했는데, 이렇게 스스로 만들어보니 어렵네요ㅠㅠ. <br>\r\n" + 
				"            프론트엔드는 html, css를 사용했습니다. <br>\r\n" + 
				"            WAS는 아파치 톰캣을 사용했습니다. 그리고 서블릿을 이용해서 서버와 연결했습니다. \r\n" + 
				"          </p>\r\n" + 
				"      </article>\r\n" + 
				"    </section>\r\n" + 
				"    <!-- 본론 자기소개페이지 끝 -->\r\n" + 
				"\r\n" + 
				"    <footer>\r\n" + 
				"      <b>개발하는 후딘</b>\r\n" + 
				"      <p>[Github] <a class=\"github_url\" href=\"https://github.com/loveAlakazam\">https://github.com/loveAlakazam</a></p>\r\n" + 
				"      <p>[Blog] <a href=\"https://ek12mv2.tistory.com/\">https://ek12mv2.tistory.com/</a></p>\r\n" + 
				"    </footer>\r\n" + 
				"  </body>\r\n" + 
				"</html>");
	}
}
