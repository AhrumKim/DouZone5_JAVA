package kr.or.kosa.dto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 로또 시스템 class 설계 하세요 ^^
 목적 : 클래스의 구성 요소를 이해하고 활용 할 수 있다
 member field , constructor (초기화) , method 활용
 접근자 한정자의 사용 , ....
 기능을 함수 단위로 분리 할 수 있다 ^^
 함수의 return type 과 parameter 를 활용할 수 있다
 
 결국 Ex07_Array_Lotto_Quiz main함수 있는 내용을 별도의 기능으로 구현하세요
 
 그러면
 Ex08_Lotto 의 main 함수안에서
 
 Lotto lotto = new Lotto();
 lotto.start(); 
 이런식으로 실행하면
 메뉴가 나오고  .... 선택시 번호 추출하고 ..... 선택시 종료 되는 기능을 구현하시면 됩니다
 
 그리고 조별만의 특수한 기능을 하나 추가하세요  
예를 들면 Lotto 배열의 평균이 특정 범위에 있으면 재추출
예를 들면  특정 값을 입력하면 Lotto 번호에서 배재하기
예를 들면  짝수값 배재하기 , 홀수값 배재하기 
지난차수  번호와 동일하면 재추출 등 1개 추가적인 선택 
*/
public class Lotto {
	// 아래와 같이 ....
	private String RESET = "\u001B[0m";    
	private String FONT_BLACK = "\u001B[30m";    
	private String FONT_RED = "\u001B[31m";     
	private String FONT_GREEN = "\u001B[32m";    
	private String FONT_YELLOW = "\u001B[33m";     
	private String FONT_BLUE = "\u001B[34m";   
	private String FONT_PURPLE = "\u001B[35m";     
	private String FONT_CYAN = "\u001B[36m";    
	private String FONT_WHITE = "\u001B[37m";     
	private String BACKGROUND_BLACK = "\u001B[40m";     
	private String BACKGROUND_RED = "\u001B[41m";     
	private String BACKGROUND_GREEN = "\u001B[42m";    
	private String BACKGROUND_YELLOW = "\u001B[43m";     
	private String BACKGROUND_BLUE = "\u001B[44m";    
	private String BACKGROUND_PURPLE = "\u001B[45m";     
	private String BACKGROUND_CYAN = "\u001B[46m";     
	private String BACKGROUND_WHITE = "\u001B[47m";
	
	int[] lotto = new int[6];
	ArrayList<int[]> list = new ArrayList<>();

	private Scanner scanner;

	public Lotto() {
		scanner = new Scanner(System.in);
	}

	private String showMenu() {
		System.out.println(BACKGROUND_WHITE +"***************************");
		System.out.println("** 1.자동으로 한장 만들어주세요 **");
		System.out.println("** 2.자동으로 여러장 만들어주세요 **");
		System.out.println("** 3.저장된 로또번호를 봅니다. **");
		System.out.println("** 4.저장된 로또번호를 변경합니다. **");
		System.out.println("** 6. 프로그램 종료 ^^! ^^! ^^**");
		System.out.println("***************************");
		System.out.println(BACKGROUND_WHITE +"원하는 메뉴 번호를 입력하세요 :" + RESET);
		String selectnum = scanner.nextLine();
		return selectnum;
	}

	// 여러가지 기능을 가지는 함수를 생성 활용하세요
	// 기능 >> method >> 함수 하나당 기능 하나
	// public >> 참조변수
	// private >> 내부 사용 (공통)

	// 저장된 로또 번호 바꾸기
	public void fixLotto() {
		getAllLottoData();
		if(list.size() == 0) return;
		System.out.println(FONT_RED +"몇번째 로또를 수정 할까요?" +RESET);
		int lottoNo = 0;
		while (true) {
			lottoNo = intChk();
			if (lottoNo <= list.size() && lottoNo > 0)
				break;
			else
				System.out.println("번호를 다시 확인해주세요");
		}

		int[] arr = getOneLottoDate(lottoNo);

		System.out.print("가져온 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(i + 1 + "번째 : " + "[" + arr[i] + "] ");
		}
		System.out.println();
		int fixNo = 0;
		while (true) {
			System.out.println("몇번째 자리를 수정할까요?");
			fixNo = intChk();
			if (fixNo < 7 && fixNo > 0)
				break;
			else
				System.out.println("1~6 번째 자리만 수정 가능합니다.......");
		}

		int fixNum = 0;
		System.out.println(fixNo + "번째 자리를 수정합니다. 변경 번호를 입력해주세요.");
		while (true) {
			fixNum = intChk();
			int result = 1;
			for (int i = 0; i < arr.length; i++) {
				if (fixNum == arr[i]) {
					System.out.println("기존 번호와 중복 됩니다.....");
					System.out.println("변경 번호를 입력해주세요");
					result = 0;
				}
			}
			if (result == 0)
				continue; // 중복일 경우 다시 숫자입력받음
			if (fixNum < 46 && fixNum > 0)
				break;
			else
				System.out.println("1~45 숫자만 입력 가능합니다.......");
		}// while
		// int[] arr = getOneLottoDate(lottoNo);
		System.out.println("변경전 번호 >>");
		for (int i = 0; i < 6; i++) {
			if(i == fixNo -1) {
				System.out.print(BACKGROUND_RED  +""+(i + 1) + " : " + "[" + arr[i] + "] " + RESET);
			}else {
				System.out.print(i + 1 + " : " + "[" + arr[i] + "] ");
			}
		}
		arr[fixNo - 1] = fixNum;
		// 변경사항 list에 set
		list.set(lottoNo-1, arr);
		System.out.println();
		System.out.println("변경후 번호 >>");
		for (int i = 0; i < 6; i++) {
			if(i == fixNo -1) {
				System.out.print(BACKGROUND_RED  +""+ (i + 1) + " : " + "[" + arr[i] + "] " + RESET);
			}else {
				System.out.print(i + 1 + " : " + "[" + arr[i] + "] ");
			}
		}
		System.out.println("\n");

	}

	// 저장된 로또 한개만 가져오기
	public int[] getOneLottoDate(int num) {
		int[] arr = list.get(num - 1);

		return arr;
	}

	// 저장된 로또 전부 보기
	public void getAllLottoData() {
		if (list.size() == 0) {
			System.out.println("저장된 로또가 없습니다....");
			System.out.println("\n\n\n");
		} else {
			for (int i = 0; i < list.size(); i++) {
				int[] arr = list.get(i);
				System.out.print(i + 1 + "번 : ");
				for (int j = 0; j < 6; j++) {
					System.out.print("[" + arr[j] + "]");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	// 자동으로 한장 만드는 기능
		public void autoLottoOne() {

			lotto = new int[6];
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j])
						i--;
					break;
				} // for
			} // for
			for (int i = 0; i < lotto.length; i++) {
				for (int j = i + 1; j < lotto.length; j++) {
					if (lotto[i] > lotto[j]) {
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}
			list.add(lotto);
			System.out.print("자동 결과 : ");
			for (int m : lotto) {
				System.out.print("[" + m + "]");
			}
			System.out.println();
		}

		// 자동으로 여러장 뽑는 기능
		public void autoLottoMany() {
			while (true) {
				System.out.println("몇장이나 뽑을래? (최대 5장)");
				int num = intChk();
				if (num <= 5 && num >= 1) {
					System.out.println("************************************");
					System.out.println(num + "장 생성중");
					System.out.println("************************************");
					for (int i = 0; i < num; i++) {
						System.out.print(i + 1 + "번째장 >> ");
						autoLottoOne();
					}
					break;
				} else {
					System.out.println("1~5 숫자만 입력가능합니다.");
				} // else
			} // while
		}// autoLottoMany()

		public void start() {
			boolean power = true;
			while (power) {
				switch (showMenu()) {
				case "1": {
					autoLottoOne();
					break;
				}
				case "2": {
					autoLottoMany();
					break;
				}
				case "3": {
					getAllLottoData();
					break;
				}
				case "4": {
					fixLotto();
					break;
				}
				case "5": {
					System.out.println("미개발 메뉴");
					break;
				}
				case "6": {
					System.out.println("프로그램 종료");
					power = false;
					System.exit(0);
				}

				} // switch
			} // while
		} // run

		// int 입력 체크 int 값 반환
		public int intChk() {
			int num = 0;
			boolean power = true;
			while (power) {
				try {
					num = Integer.parseInt(scanner.nextLine());
					power = false;
				} catch (Exception e) {
					System.out.println("숫자를 제대로 입력해주세요");
				}
			}
			return num;
		}
}
