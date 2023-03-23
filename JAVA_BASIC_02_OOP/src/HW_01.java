import java.util.Scanner;

/*
UNIT : 화폐단위
NUM : 화폐매수
SW : 스위칭 변수 , 화폐의 다음 단위를 위해
MONEY : 입력받는 금액

​아래 코드는 금액을 입력받아 

예)
12345
10000 1개
5000 0개
1000 2개
500 0개
100 3개 
50 0개
10 4개
5 1개
1 0개
를 계산하는 프로그램 입니다 

 */
public class HW_01{
	
		public static void main(String[] args) {
					
			
		int unit = 10000;
		int num = 0;
		int sw = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 금액을 입력하세요 " );
		
		int money = Integer.parseInt(sc.nextLine());
		
		
		while(true) {
			
			num = money / unit;
			System.out.println( unit +"원 " + num +"개");
			if(!(unit > 1)) {
				break;
			}else {
				money = money - unit * num;
			}			
					
			if(sw == 0) {
				unit = unit / 2;
				sw = 1;
			} else {
				unit = unit / 5;
				sw = 0;
			}
		}
	}
}