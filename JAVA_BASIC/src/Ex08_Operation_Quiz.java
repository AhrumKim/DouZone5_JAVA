import java.util.Scanner;

public class Ex08_Operation_Quiz {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);//생성자 함수 호출하는 괄호임
		System.out.print("입력값: ");
		int value1 = Integer.parseInt(sc.nextLine());//입력하고 enter 칠 때까지 대기 (프로그램이 종료 되지 않고 계속 대기) 
		
		System.out.print("입력값(기호): ");
		String value2 = sc.nextLine();
		
		System.out.print("입력값: ");
		int value3 = Integer.parseInt(sc.nextLine());
		
		if(value2.equals("+")){
		System.out.println("연산결과: " +(value1+value3));
		}else if(value2.equals("-")) {
		System.out.println("연산결과: " +(value1-value3));
		}else if(value2.equals("*")) {
			System.out.println("연산결과: " +(value1*value3));
			}else if(value2.equals("/")) {
				System.out.println("연산결과: " +(value1/value3));
				}else {
					System.out.println("입력기호가 없습니다");
				}
	}
	/*

	간단한 사칙 연산기 (+ , - , * , /)

	입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환)

	목적 : Integer.parseInt() , ** 구글 java equals() 활용 문자열의 비교** 

	화면

	>입력값:숫자

	>입력값(기호): +

	>입력값:숫자 

	>연산결과 :200

	-------------

	>입력값:100

	>입력값(기호): -

	>입력값:100

	>연산결과 :0

	hint)

	■ if문은 조건값이 boolean형, 

	■ switch문은 정수형(byte, short, int)과 문자형(char), 문자열(String)

	■ long, boolean, float, double형 사용 불가

	*/

}


