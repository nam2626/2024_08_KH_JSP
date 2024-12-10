package controller;

import java.io.IOException;

import dto.BoardDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.BoardService;
import view.ModelAndView;

public class BoardUpdateController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// title, content 파라미터 읽어옴
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		int bno = Integer.parseInt(request.getParameter("bno"));

		BoardDTO dto = new BoardDTO();
		dto.setTitle(title);dto.setContent(content);dto.setBno(bno);
		//게시글 수정
		BoardService.getInstance().updateBoard(dto);
		
		// 페이지 이동 해당 게시글
		ModelAndView view = new ModelAndView();
		view.setPath("./boardView.do?bno=" + bno);
		view.setRedirect(true);
		return view;
	}

}
