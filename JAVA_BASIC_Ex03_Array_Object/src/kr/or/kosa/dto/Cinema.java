package kr.or.kosa.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Cinema {
	
	private int row; // 행
	private int col; // 열
	private int ticketNum; // 티켓 번호
	
	
	private String[][] seat = new String[4][5]; // 좌석 배열
	private int countSeat;
	
	private TicketInfo ticketInfo; // 티켓 정보 
	
	private Color color = new Color(); // 콘솔 색깔놀이
	
	private HashMap<Integer, TicketInfo> ticketInfoList = new HashMap<>(); // 티켓 리스트 저장
	
	
	Scanner scanner = new Scanner(System.in);
	
	// 초기 좌석 세팅 기능
	public void setSeat() {
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				// 좌석을 초기화
				seat[i][j] = "[예매가능]"; // 빈의자를 배치
			}
		}
	} // setSeat()
	
	// 현재 잔여 좌석을 확인 하는 기능

	
	
	
	// 행과 열을 검증하는 기능
	private void rowColChk() {
		boolean power = true;
		while(power) {
			while(true) {
				System.out.print(color.FONT_BLUE+"행을 입력 >> " + color.RESET);
				row = intChk(); // 행
				if(row > seat.length || row < 0) {
					System.out.println(color.FONT_RED+"행을 제대로 입력해주세요" + color.RESET);
				}else {
					break;
				}
				
			} // while
			while(true) {
				System.out.print(color.FONT_BLUE + "열을 입력 >> " + color.RESET);
				col = intChk(); // 열
				if(col > seat[0].length  || col < 0) {
					System.out.println(color.FONT_RED+"열을 제대로 입력해주세요" + color.RESET);
				}else {
					ticketInfo = new TicketInfo();
					ticketInfo.setCol(col);
					ticketInfo.setRow(row);
					return;
				}
			}// while
		} // while
	} // rowColChk()
	
	// 예매 하는 기능 
	private void ticketing() {
		boolean power = true;
		
		while(power) {
			System.out.println("영화를 예매 합니다.");
			seatNow(); // 현재 좌석 보여주기 
			System.out.println("예매를 희망하는 행과 열을 입력해주세요.");
			
			// 행과 열을 검증 후 ticektInfo 에 row col 세팅
			rowColChk();
			// ticektInfo
			System.out.println(color.FONT_GREEN+"입력한 좌석 : " + ticketInfo.getRow() + " - " + ticketInfo.getCol() + "     " + "행 : " + ticketInfo.getRow() + " 열 : " + ticketInfo.getCol() + color.RESET);
			if(seat[ticketInfo.getRow()-1][ticketInfo.getCol()-1].equals("[예매가능]")) {
				// 예매번호 생성 및 저장
				ticketNum = (int)(Math.random()*1000)+(int)(Math.random()*10);
				System.out.println(color.BACKGROUND_GREEN+"********************************************************" + color.RESET);
				System.out.println(color.FONT_GREEN+"예매번호는 : " + ticketNum +color.RESET);
				System.out.println(color.BACKGROUND_GREEN+"********************************************************" + color.RESET);
				ticketInfo.setTicekNum(ticketNum);
				// 티켓번호 저장
				ticketInfoList.put(ticketNum, ticketInfo);
				// 예매불가로 변경
				seat[ticketInfo.getRow()-1][ticketInfo.getCol()-1] ="[예매불가]";
				return;
			}else {
				System.out.println("\n해당좌석은 예매불가 입니다.");
				return;
			} //else
		} //while
	} // void
	
	// 예매 조회 기능
	private void ticketingCheck() {
		System.out.println(color.BACKGROUND_BLUE+"***********************************" +color.RESET);
		System.out.print(color.FONT_BLUE +" 조회를 희망하는 티켓 번호를 입력하세요 >> " + color.RESET);
		int ticketNum = intChk();
		if(ticketInfoList.get(ticketNum) != null) {
			System.out.println("티켓번호 : " + ticketInfoList.get(ticketNum).getTicekNum() + " 좌석 : "
					+ ticketInfoList.get(ticketNum).getRow() + " - " + ticketInfoList.get(ticketNum).getCol());
		}else {
			System.out.println(color.BACKGROUND_RED + "***********************************" + color.RESET);
			System.out.println(color.FONT_RED + "예매번호가 확인되지 않습니다." + color.RESET);
			System.out.println(color.BACKGROUND_RED + "***********************************\n" + color.RESET);
		}
	}
	
	// 예매 취소 기능
	private void ticketingCancel() {
		System.out.print(color.FONT_RED + "취소를 희망하는 예매번호를 입력해주세요 >> " + color.RESET);
		int cancleNum= intChk();
		if(ticketInfoList.get(cancleNum) != null) { // 티켓 정보가 있을경우

            int cancelRow = ticketInfoList.get(cancleNum).getRow();
			int cancelCol = ticketInfoList.get(cancleNum).getCol();
			
			ticketInfoList.remove(cancleNum);
			seat[cancelRow-1][cancelCol-1] = "[예매가능]";
			System.out.println(color.BACKGROUND_RED + "예매번호 : " + cancleNum + "\n예매취소 완료!" + color.RESET);
		}else { // 티켓 정보가 없을경우
			System.out.println(color.FONT_RED + "해당 예매번호가 존재하지 않습니다." + color.RESET);
		}
		
		
	} // void
	
	// 현재 좌석 현황 보는 기능
	private void seatNow() {
		System.out.println("현재 좌석 현황");
		System.out.println();
		System.out.println(color.BACKGROUND_YELLOW+"                                  스크린                           " + color.RESET);
		System.out.println(color.FONT_BLUE+"        ㅡㅡ1열ㅡㅡ ㅡㅡ2열ㅡㅡ ㅡㅡ3열ㅡㅡ ㅡㅡ4열ㅡㅡ ㅡㅡ5열ㅡㅡ" + color.RESET);
		for(int i = 0; i < seat.length; i++) {
			System.out.println();
			System.out.print(color.FONT_BLUE+(i+1)+"행 >> " + color.RESET);
			for(int j = 0; j < seat[i].length; j++) {
				if(seat[i][j].equals("[예매불가]")) {
					System.out.print(color.FONT_RED + " "+seat[i][j]+ " " + color.RESET);
				}else {
					System.out.print(color.FONT_GREEN+" "+seat[i][j]+ " "+color.RESET);
				} 
			}// for
		}// for
		System.out.println();
	}	
	private void showMenu() {
		System.out.println("\n********* Team 3 cinema 입니다. **********************");
		System.out.println("1. 예매하기*******************************************");
		System.out.println("2. 예매번호로 조회************************************");
		System.out.println("3. 예매취소*******************************************");
		System.out.println("4. 좌석 현황 보기*************************************");
		System.out.println("6. 프로그램 종료" + "*********************************");
		System.out.println(color.FONT_BLUE+ "원하시는 메뉴의 숫자를 입력해주세요 >> " + color.RESET );
	} // showMenu()
	
	// 프로그램 실행 기능
	public void run() {
		boolean power = true;
		setSeat(); // 초기좌석 세팅
		
		while(power) {
			showMenu();
			int menuNum = intChk();
			switch (menuNum) {
				case 1: {
					ticketing(); // 예매하기
					break;
				}case 2: {
					ticketingCheck(); // 예매번호로 조회
					
					break;
				}case 3: {
					ticketingCancel(); // 예매취소
					
					break;
				}case 4: {
					seatNow(); // 현재 좌석 현황 확인
					
					break;
				}case 5: {
					// 여러장 예매 
					
				}case 6: {
					System.out.println("프로그램 종료");
					return;
				}
			} // switch	
		}// while
	} // run
	
	// int 입력 체크 후 int 값 반환 기능
	public int intChk() {
		int num = 0;
		boolean power = true;
		while (power) {
			try {
				num = Integer.parseInt(scanner.nextLine());
				power = false;
			} catch (Exception e) {
				System.out.println(color.FONT_RED+"숫자를 제대로 입력해주세요"+color.RESET);
			}
		}
		return num;
	} // intChk()
	
	
}