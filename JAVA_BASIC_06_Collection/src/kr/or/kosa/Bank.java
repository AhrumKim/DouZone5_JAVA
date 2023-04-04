package kr.or.kosa;

import java.util.Scanner;

public class Bank {
	String[] Account; //계좌
	int count; //총게좌수
	int MenuChoice; // 은행 메뉴
	
	Scanner sc= new Scanner(System.in);
	
	//계좌 생성
	public void run() {
		while(true){
			start(); //은행 시작
			menue(); // 은행 메뉴
			SelectMenu();// 선택한 메뉴 시작
		}		
		
	}
	//은행 시작
	public void start() {
		System.out.println("*********우리 은행*********");
	}
	
	public void menue() {
		System.out.println("1.계좌 생성");
		System.out.println("2.계좌 찾기"); //계좌를 찾는다(계좌번호/소유자명)
		System.out.println("번호를 선택해주세요");
		try {
			this.MenuChoice =Integer.parseInt(sc.nextLine());
			if(MenuChoice <1 || MenuChoice>2) {
				throw new Exception();
			} 
		}catch(Exception e) {
				System.out.println("다시 선택해 주세요");
				return;				
			}
			return;
				
			}
		
		public void SelectMenu() {
			switch(MenuChoice) {
			//1. 계좌 생성하기
			case 1:
			//2. 계좌 찾기
			case 2:
					
				}
			
		}
}
}
