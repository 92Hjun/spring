package com.example.sample5;

public class Reporting {
	
	// Char 인터페이스를 구현한 객체가 필요해
	private Chart chart;
	private int width;
	private int height;
	
	
	
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	// setter Injection을 사용하기 위해서 setter 메소드 추가
	public void setChart(Chart chart) {
		System.out.println("setChart is running");
		System.out.println(chart);
		this.chart = chart;
	}
	
	// 조회된 데이터를 적절하게 각종 차트 표시하기
	public void drawChart(){
		
		// 데이터베이스에서 데이터를 조회
		// 데이터를 적절한 형태로 가공하기
		
		// 차트 그리기
		System.out.println("너비 ["+width+"] 높이 ["+height+"] 크기의 차트를 표시");
		chart.draw();
		
	}
}
