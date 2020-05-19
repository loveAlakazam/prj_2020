package example.BE.forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/next")
public class NextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public NextServlet() {
        super();
    }

    // forward를 통해 넘겨받을 서블릿 생성
    // 응답을 받아서 출력
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title> the next- servlet </title></head>");
		out.println("<body>");
		
			//FrontServlet.java에서 
			//request: "dice"라는 이름으로 diceValue값을 맡겼음.
			//getAttribute(): 맡긴 값을 찾아옴. 맡긴 이름"dice"만 맞으면됨.
			//맡긴 값을 꺼내면 Object형태니까, 알맞게 형변환을 시킨다.
			int dice=(Integer)request.getAttribute("dice"); 
			out.println("dice: "+ dice+"<br>");
			
			for(int i=0; i<dice; i++) {
				out.println("안녕<br>");
			}
			
		out.println("</body>");
		out.println("</html>");
	}

}
