import java.util.Scanner;

public class Ex07_printf_format {

	public static void main(String[] args) {
		// System.out.println()
		// C# : Console. WriteLine()
		
		System.out.println("A");//출력하고 줄바꿈 하겠다는 의미임임(엔터)
		System.out.println();
		System.out.println("B");
		
		
		int num= 1000;
		System.out.println(num);
		System.out.println("num 값은" + num + "입니다");
		
		
		//형식 format
		System.out.println(num);
		System.out.println();
		System.out.println();
		/*
		 %d 10 진수 형식의 정수
		 %f 실수
		 %s 문자열
		 %c 문자
		 \t(tab), \n (줄바꿈)
		 
		 */
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f변수 값은 %f입니다\n",f);
	
		//cmd 모드 (console 창에서) 사용자가 입력한 값을  read ...
		//설계도 == 클래스 == 타입 은 사용하고 싶다면 heap 에 올린다
	Scanner sc= new Scanner(System.in);//생성자 함수 호출하는 괄호임
	String value = sc.nextLine();//입력하고 enter 칠 때까지 대기 (프로그램이 종료 되지 않고 계속 대기) 
	System.out.println("value 입력값: " +value);
/*

	int number = sc.nextInt(); //사용자가 입력한 값을 정수로 변환 return  하는 함수
	System.out.println(number);
	
	float fnumber = sc.nextFloat();
	
	되도록이면 
	권장사항) nextInt, nextFloat 보다는 모든 데이터를 NextLine()read 
	Today Point
	
		[문자를]-> 숫자로 (정수, 실수)
		
		String data=sc.nextLine();
		int idata=Integer.parseInt("10000")
		
		
	
*/	
	
	}

}
