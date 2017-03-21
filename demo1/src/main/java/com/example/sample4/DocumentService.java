package com.example.sample4;

import org.springframework.beans.factory.annotation.Autowired;

public class DocumentService {
	
	// Printer 인터페이스를 구현한 객체를 주입해 주세요.
	@Autowired
	Printer printer;
	
	public void printContent(String content){
		
		// printer인터페이스를 구현한 객체에 재정의된 print()를 실행하는 코드
		printer.Print(content);
		
	}
}
