package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mapper.MajorMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import config.DBManager;
import dto.MajorDTO;

/**
 * Servlet implementation class MajorSearchServlet
 */
@WebServlet("/searchMajor.do")
public class MajorSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MajorSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//검색 종류, 검색어 받아옴
		String type = request.getParameter("type");
		String search= request.getParameter("search");
		
		//Mapper로 보낼 데이터는 Map으로 묶어서 보냄
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("type", type);
		map.put("search", search);
		
		System.out.println(map);
		
		MajorMapper mapper = 
				DBManager.getInstance().getSession().getMapper(MajorMapper.class);
			
		List<MajorDTO> list = mapper.searchMajor(map);
		request.setAttribute("majorList", list);
		
		request.getRequestDispatcher("major_search_view.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
