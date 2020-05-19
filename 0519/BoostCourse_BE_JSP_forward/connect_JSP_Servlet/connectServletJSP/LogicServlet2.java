package example.BE.connectServletJSP;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logic2")
public class LogicServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LogicServlet2() {
        super();
    }

    // Get, Post ��� ����
    // 1~100���� ������ �� �ΰ��� ���Ͽ� �� ���� ���� ���� ����� ���Ѵ�.
    // �ΰ��� �������� JSP���� ����Ϸ���?
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int v1= (int)(Math.random()*100+1);
		int v2= (int)(Math.random()*100+1);
		int result= v1+v2;
		
		// jsp���� v1,v2, result�� ����Ϸ���, request ��ü����  �ðܾ��Ѵ�.
		request.setAttribute("v1", v1);
		request.setAttribute("v2", v2);
		request.setAttribute("result", result);
		
		// ��û�ּ�: "/jsp/sampleEL.jsp" = WebContent�ȿ� jsp �ȿ� �ִ� sampleEL.jsp�� �θ���
		RequestDispatcher rd= request.getRequestDispatcher("/jsp/result.jsp");
		rd.forward(request, response);
	}

}
