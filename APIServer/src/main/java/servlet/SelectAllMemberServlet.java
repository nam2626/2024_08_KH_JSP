package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import dto.BoardMemberDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.BoardMemberService;

/**
 * Servlet implementation class SelectAllMemberServlet
 */
@WebServlet("/allMember.do")
public class SelectAllMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectAllMemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//전체 회원정보 리스트로 받음
		List<BoardMemberDTO> list = BoardMemberService.getInstance().selectAllMember();
		//받은 회원정보 개수
		int count = list.size();
		//조회한 현재 날짜 시간도 문자열 저장 YYYY-MM-DD HH:mm:ss
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
		Date date = Calendar.getInstance().getTime();
		String dateString = sdf.format(date);
		
		System.out.println(list);
		System.out.println(count);
		System.out.println(dateString);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
