package kr.co.test.dao;

import java.util.List;

import kr.co.test.vo.Board;

public interface BoardDAO {

	List<Board> getAllBoardList();

	void addBoard(Board board);
	
}
