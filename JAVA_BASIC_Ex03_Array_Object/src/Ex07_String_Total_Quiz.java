import java.util.Scanner;

public class Ex07_String_Total_Quiz {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    boolean run= false;
	    while(!run){
	    System.out.print("주민번호를 입력하세요(ex)123456-1234567): ");
	    String jumin = sc.nextLine();
	    if (isValidLength(jumin) && isValidFirstNumber(jumin)) {
	        printGender(jumin);
	        run =!run;
	    } else {
	        System.out.println("주민번호가 올바르지 않습니다.다시 입력해주세요^^");
	    }
	    }
	}

	// 1. 자리수 체크 (기능)함수 (14 ok)  return true , false 
	public static boolean isValidLength(String jumin) {
	   return (jumin.length() == 14) ? true : false;
	}

	// 2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수  return true, false
	public static boolean isValidFirstNumber(String jumin) {
	    char firstNum = jumin.charAt(7);
	    boolean n = (firstNum >= '1' && firstNum <= '4') ? true : false;
	    return n;
	        
	    }

	// 3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수  void  출력
	public static void printGender(String jumin) {
		 char firstNum = jumin.charAt(7);
		 
		   String gender= (firstNum == '1' || firstNum == '3') ? "남자입니다":"여자입니다";
		   System.out.println(gender);
		}
}

