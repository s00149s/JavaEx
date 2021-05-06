package com.javaex.oop.casting;

public class AnimallApp {

	public static void main(String[] args) {
		//	자식 타입의 객체를 부모 타입 클래스로 참조할 수 있다
		Dog dog1 = new Dog("Snoopy");
		
		dog1.eat();
		dog1.walk();
		dog1.bark();	//	부모로부터 물려받지 않고 추가로 생성한 것
		
		//	자식 객체를 부모 타입으로 참조하는 것 -> Upcasting
		Animal dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
//		dog2.bark();	->	Animal 설계도에 없음, 실행 불가

		//	원래대로 돌려놓기 -> 다운 캐스팅
		((Dog)dog2).bark();
		
		Animal pet = new Dog("Azi");
		pet.eat();
		pet.walk();
		
		pet = new Cat("Yaong");
		pet.eat();
		pet.walk();
		
		//	중요 : 다운캐스팅시, 실제 객체를 확인해야 할 필요
		//	instanceof 연산자 활용
		
		if (pet instanceof Dog) {	//	pet이 Dog클래스의 인스턴스인가?
			((Dog)pet).bark();		
	} else if (pet instanceof Cat) {	//	pet이 Cat클래스의 인스턴스인가?
			((Cat)pet).meow();
	}

}
}
	