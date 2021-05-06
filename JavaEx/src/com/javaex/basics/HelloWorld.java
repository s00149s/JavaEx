package com.javaex.basics;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		// consoleInput();
		//ifElseEx();
		//ifElseEx2();
		whileEx();
	}


	private static void consoleInput() {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("이름을 입력해주세요: ");
	String name = scanner.next();
	
	System.out.println("나이를 입력해주세요: ");
	
	int age = scanner.nextInt();
	
	System.out.println("당신의 이름은 " + name + "이고, 당신의 나이는 " + age + "입니다.");
	
	}

	private static void ifElseEx() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력해 주세요 : ");
		int score = scanner.nextInt();
		if (score > 90) {
			System.out.println("A등급");
		}
		else if (score >= 80 & score <= 89) {
			System.out.println("B등급");
		}
		else if (score >= 70 & score <= 79) {
			System.out.println("C등급");
		}
		else if (score >= 60 & score <= 69) {
			System.out.println("D등급");
		}
		else{
			System.out.println("F등급");
		}
		scanner.close();
	}
	
	private static void ifElseEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		
		int score = scanner.nextInt();
		if (score % 3 ==0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다");
		}
		
		scanner.close();
	}
	
	private static void whileEx() {
		int x = 1;
		while ( x <= 10) {
			System.out.println("I like java" + x);
			x = x + 1;
		}
		
	}
}



