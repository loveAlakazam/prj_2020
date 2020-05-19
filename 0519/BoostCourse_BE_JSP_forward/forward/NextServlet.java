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

    // forward�� ���� �Ѱܹ��� ���� ����
    // ������ �޾Ƽ� ���
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title> the next- servlet </title></head>");
		out.println("<body>");
		
			//FrontServlet.java���� 
			//request: "dice"��� �̸����� diceValue���� �ð���.
			//getAttribute(): �ñ� ���� ã�ƿ�. �ñ� �̸�"dice"�� �������.
			//�ñ� ���� ������ Object���´ϱ�, �˸°� ����ȯ�� ��Ų��.
			int dice=(Integer)request.getAttribute("dice"); 
			out.println("dice: "+ dice+"<br>");
			
			for(int i=0; i<dice; i++) {
				out.println("�ȳ�<br>");
			}
			
		out.println("</body>");
		out.println("</html>");
	}

}
