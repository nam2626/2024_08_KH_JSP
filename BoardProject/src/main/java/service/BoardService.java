package service;

import java.util.List;

import dto.BoardDTO;

public class BoardService {
	private static BoardService instance = new BoardService();

	private BoardService() {

	}

	public static BoardService getInstance() {
		if(instance == null)
			instance = new BoardService();
		return instance;
	}

	public List<BoardDTO> getBoardList() {
		
		return null;
	}

	
	
	
}





