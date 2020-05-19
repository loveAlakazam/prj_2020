package example.BE.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/front")
public class FrontServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FrontServlet() {
        super();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int diceValue= (int)(Math.random()*6)+1; //1~6
		//diceValue�� request ��ü���� �ñ��.
		//��Ź�ҿ��� ���� �ñ涧 "������(�̸�)"�̸����� ���� �ñ�
		//request.setAttribute("ã�ƿö��� ���̸�", ����ü)
		request.setAttribute("dice", diceValue); //
		
		//forward �ڵ�
		//redirect: sendRedirect
		//forward: requestDispatcher
		//���� ���ø����̼� ������ �̵� ����
		RequestDispatcher requestDispatcher= request.getRequestDispatcher("/next"); // ����: ���� �̵������� ���� url (nextServlet(url: /next)) ���� �̵�
		requestDispatcher.forward(request, response);//�ݵ�� �ش� ��û�� ������ �Ѱܾ��Ѵ�.

	}

}
