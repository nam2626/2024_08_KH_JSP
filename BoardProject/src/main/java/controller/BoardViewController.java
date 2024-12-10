package controller;

import java.io.IOException;

import dto.BoardDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.BoardService;
import view.ModelAndView;

public class BoardViewController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//글번호 받아오기
		int bno = Integer.parseInt(request.getParameter("bno"));
		//글번호에 해당하는 게시글의 조회수 증가
		BoardService.getInstance().updateBoardCount(bno);
		//글번호에 게시글 조회
		BoardDTO dto = BoardService.getInstance().selectBoard(bno);
		//해당 게시글의 댓글 목록 조회
		//해당 게시글의 첨부파일 목록 조회
		
		//페이지 이동
		ModelAndView view = new ModelAndView();
		view.setPath("board_view.jsp");
		view.addObject("board", dto);
		return view;
	}

}






