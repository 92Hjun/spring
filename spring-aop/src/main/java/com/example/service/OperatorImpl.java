package com.example.service;

public class OperatorImpl implements Operator{
	
	public int divide(int x, int y) {
		System.out.println("### 나누기 핵심기능 실행중...");
		return x/y;
	}
	
	public int minus(int x, int y) {
		System.out.println("### 빼기 핵심기능 실행중...");
		return x - y;
	}
	
	public int multiple(int x, int y) {
		System.out.println("### 곱하기 핵심기능 실행중...");
		return x*y;
	}

	public int plus(int x, int y) {
		System.out.println("### 더하기 핵심기능 실행중...");
		return x + y;
	}
}
