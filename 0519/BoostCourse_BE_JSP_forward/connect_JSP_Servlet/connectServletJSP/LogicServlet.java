package example.BE.connectServletJSP;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logic")
public class LogicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LogicServlet() {
        super();
    }

    // Get, Post 상관 없이
    // 1~100까지 랜덤한 값 두개를 구하여 두 랜덤 값을 더한 결과를 구한다.
    // 두개의 랜덤값을 JSP에서 사용하려면?
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int v1= (int)(Math.random()*100+1);
		int v2= (int)(Math.random()*100+1);
		int result= v1+v2;
		
		// jsp에서 v1,v2, result를 사용하려면, request 객체한테  맡겨야한다.
		request.setAttribute("v1", v1);
		request.setAttribute("v2", v2);
		request.setAttribute("result", result);
		
		// 요청주소: jsp/result.jsp (WebContent/jsp 안에 result.jsp를 부른다)
		// jsp 저장장소 url: ("/result.jsp") => WebContent안에 result.jsp 저장
		// jsp 저장장소 url: ("/jsp/result.jsp") => WebContent 안에 jsp안에 result.jsp 저장
		RequestDispatcher rd= request.getRequestDispatcher("/jsp/result.jsp");
		rd.forward(request, response);
	}

}
