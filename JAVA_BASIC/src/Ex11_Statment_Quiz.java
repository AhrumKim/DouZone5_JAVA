import java.util.Scanner;

public class Ex11_Statment_Quiz {

	public static void main(String[] args) {
		// 메뉴를 보여주고 사용자에 선택 ...
		// 원하시는 메뉴를 선택하지 않으면 강제로 다시 메뉴를 보여 주세요

		// 1.예금
		// 2.출금
		// 3.잔고
		// 4.종료

		// 잔액 변수를 생성 (balance)
		// 예금 처리 + 누적
		// 예금 처리 - 누적
		// 잔고 balance 출력
		// 종료 프로그램 끝(함수의 종료, 프로그램의 강제 종료)
		System.out.println("1.예금 2.출금 3.잔고 4.종료");

		Scanner sc = new Scanner(System.in);
		int balance = 0;
		int inputData = 0;
		int inputDeposit = 0;
		int inputWithdraw = 0;
		do {
			System.out.print("메뉴를 선택하세요: ");
			inputData = Integer.parseInt(sc.nextLine());

			if (inputData == 1) {
				System.out.printf("예금 금액을 입력하세요: ");
				inputDeposit = Integer.parseInt(sc.nextLine());
				System.out.println("예금 금액: " + inputDeposit);
			} else if (inputData == 2) {
				System.out.printf("출금 금액을 입력하세요: ");
				inputWithdraw = Integer.parseInt(sc.nextLine());
				System.out.println("출금 금액: " + inputWithdraw);
			} else if (inputData == 3) {
				balance = balance + (inputDeposit -inputWithdraw );
				System.out.printf("잔고 금액:%d\n ", balance);
			}else if(inputData == 4) {
			System.out.println("종료되었습니다");
			}
		} while (inputData<4);// while 조건 true 계속해서 do문을 실행
								// while 조건 false do 실행하지 않아요
		}
	}


