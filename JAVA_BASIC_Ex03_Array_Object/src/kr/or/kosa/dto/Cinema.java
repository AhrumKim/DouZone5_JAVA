package kr.or.kosa.dto;

import java.util.Scanner;

class Cinema{ //로또 처럼 클래스 설계 } 

	private Scanner scanner;
	public Cinema() {
		scanner= new Scanner(System.in);
		String[][] seat= new String[3][5];
		
	}
	
	private String showCinema() {
		System.out.println("***************************");
		System.out.println("*********영화 예매 시스템********");
		System.out.println("***************************");
		System.out.printf("1.예매하기\n\n");
		System.out.printf("2.예매조회\\n\\n");
		System.out.println("3.예매취소");
		String selectnum = scanner.nextLine();
		return selectnum;		

	}
	private String showCinema_seat() {
	System.out.println("***********좌석 현황***********");
	for (int i = 0; i < 4; i++) {
	    for (int j = 0; j < 5; j++) {
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	        int[][] array;
			array[i][j] = (i + 1) * 10 + (j + 1);
	    }
	}
	// 배열 출력
	for (int i = 0; i < 4; i++) {
	    for (int j = 0; j < 5; j++) {
	        System.out.print("[" + (i+1) + "-" + (j+1) + "]" );
	    }
	    System.out.println(); // 다음 행으로 이동
	}
	System.out.println("---------------------------");
	System.out.println("좌석을 선택해주세요. 예)1-1");
	System.out.println("이미 예매된 좌석은 [예매] 라고 표시됩니다.");
	String selectseat = scanner.nextLine();
	return selectseat;		
	
		
	
	}
	private String showCinema_reservation() {
		String ran = Integer.toString(r.nextInt(8) + 1); for (int i = 0; i < 7; i++) { ran += Integer.toString(r.nextInt(9)); }
		 
		System.out.println("예매 가능합니다. 예매하시겠습니다?");
		System.out.println("네(1), 아니로(2), 초기화면(0) 중 하나를 입력해주세요.");
		String select_reservation = scanner.nextLine();
		return select_reservation;		
		System.out.println("예매가 완료되었습니다.");
		System.out.println("예매한 좌석번호:[%s] / 에매번호: [%s]", array[i][j],ran);
		}
}
