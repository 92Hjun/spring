package kr.co.jhta;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.jhta.dao.BoardDAO;
import kr.co.jhta.vo.Board;

public class App {
	public static void main(String[] args) {
		
		String resources = "classpath:/META-INF/spring/app-context.xml";
		GenericXmlApplicationContext container = new GenericXmlApplicationContext(resources);
		
		BoardDAO dao = container.getBean("boardDAO",BoardDAO.class);
		
		List<Board> boardList = dao.getAllBoards();
		
		
		Board board = new Board("테스트", "테스트", "테스트입니다.");
		//dao.addBoard(board);
		System.out.println(boardList.size());
		
		
	}
}