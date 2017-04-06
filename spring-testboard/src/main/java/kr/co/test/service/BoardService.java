package kr.co.test.service;

import java.util.List;

import kr.co.test.vo.Board;

public interface BoardService {
	
	List<Board> getAllBoardList();

	void addBoard(Board board);

}
