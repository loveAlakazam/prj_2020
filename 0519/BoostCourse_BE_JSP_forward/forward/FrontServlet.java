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
		//diceValue를 request 객체에게 맡긴다.
		//세탁소에서 옷을 맡길때 "ㅇㅇㅇ(이름)"이름으로 옷을 맡김
		//request.setAttribute("찾아올때의 값이름", 값자체)
		request.setAttribute("dice", diceValue); //
		
		//forward 코드
		//redirect: sendRedirect
		//forward: requestDispatcher
		//같은 어플리케이션 내에서 이동 가능
		RequestDispatcher requestDispatcher= request.getRequestDispatcher("/next"); // 인자: 어디로 이동할지에 대한 url (nextServlet(url: /next)) 으로 이동
		requestDispatcher.forward(request, response);//반드시 해당 요청과 응답을 넘겨야한다.

	}

}
