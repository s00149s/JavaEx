package com.javaex.api.date;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateEx {

	public static void main(String[] args) {
		dateEx();

	}
	
	private static void dateEx() {
		//	날짜 얻어오기
		Date now = new Date();
		System.out.println(now);
		
		//	형식화 출력 : DateFormat 객체
		//	FULL, LONG, MEDIUM, SHORT -> 바꿔가며 출력해보자
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL : " + df.format(now));
			//데이터 포멧 바꾸기
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG : " + df.format(now));
		
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM : " + df.format(now));
		
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("SHORT : " + df.format(now));
		
		//	SimpleDateFormat -> 포멧 문자열을 이용, 자유롭게 날짜 포멧
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("SDF : " + sdf.format(now));
		
		
		
	}

}
