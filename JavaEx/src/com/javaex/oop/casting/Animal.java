package com.javaex.oop.casting;

public class Animal {
	protected String name;	//	상속해줄 클래스
	
	public Animal(String name) {	//	생성자
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name + " is eating...");
	}
	
	public void walk() {
		System.out.println(name + " is walking...");
	}
}
