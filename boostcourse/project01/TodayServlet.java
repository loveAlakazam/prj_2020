

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TodayServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=utf-8;");
		PrintWriter out= response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>몇시에요?</title>");
		out.print("<style>");
		out.print("h1.time{top:50%; left:50%; position:absolute;}");
		out.print("</style>");
		out.print("</head>");
		out.print("<body>");
		out.print("<a href=\"http://localhost:8080/aboutme/index\"> 메인화면</a>");
		
		//현재 날짜정보를 출력
		LocalDateTime currentDate= LocalDateTime.now();

		out.print("<h1 class=\"time\">현재시간: "+ currentDate+"</h1><br>");
		
		out.print("</body>");
		out.print("</html>");
	}

}
