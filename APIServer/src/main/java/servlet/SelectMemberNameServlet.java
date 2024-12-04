package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Servlet implementation class SelectMemberNameServlet
 */
@WebServlet("/searchNameMember.do")
public class SelectMemberNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectMemberNameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//null 나오는 이유, 데이터를 쿼리 스트링으로 보내지 않아서(데이터가 url에 없음)
		System.out.println(request.getParameter("search"));
		//Post로 body영역에 데이터를 보내면 inputStream으로 문자열을 읽어서 사용
		BufferedReader br = request.getReader();
		String str = "";
		StringBuilder builder = new StringBuilder();
		//실제 클라이언트가 보낸 데이터를 문자열로 읽어오는 부분
		while((str = br.readLine()) != null)
			builder.append(str);
		
		System.out.println(builder.toString());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
