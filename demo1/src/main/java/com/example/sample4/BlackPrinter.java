package com.example.sample4;

public class BlackPrinter implements Printer{
	@Override
	public void Print(String text) {
		System.out.println("[흑백출력]"+text);
		
	}
}
