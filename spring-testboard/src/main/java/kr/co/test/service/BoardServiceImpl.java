package kr.co.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.test.dao.BoardDAO;
import kr.co.test.vo.Board;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDAO boardDAO;
	@Override
	public void addBoard(Board board){
		boardDAO.addBoard(board);
	}
	@Override
	public List<Board> getAllBoardList() {
		
		return boardDAO.getAllBoardList();
	}
}
