package com.javaex.oop.goods.v4;


public class GoodsApp {

	public static void main(String[] args) {
		//	생성자를 이용한 객체의 초기화
		Goods notebook = new Goods("LG Gram", 1500000);
		
		Goods smartphone = new Goods("iPhone", 1000000);
		
		//	setter를 이용한 우회 설정
	
//		notebook.name = "LG Gram";	//	Goods 필드가 private으로 바뀌어서 접근 불가가 됨
//		notebook.price = 1500000;
		
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);		
		
		smartphone.setName("iPhone");
		smartphone.setPrice(1000000);
		
		System.out.printf("%s, %d원%n", 
				notebook.getName(),
				notebook.getPrice());
		System.out.printf("%s, %d원%n",
				smartphone.getName(),
				smartphone.getPrice());
		
		
		// price, name 필드는 읽기 전용 필드 데ㅣ터를 변경할 수 없다.
//		notebook.setPrice(15000);
//		smartphone.setPrice(10000);
		
		
		//	내장 메서드 호출
		notebook.showInfo();
		smartphone.showInfo();
	}

}
