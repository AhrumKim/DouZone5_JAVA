import java.util.Arrays;
import java.util.Scanner;
/*
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 */


/*  public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String m=sc.next();
		char[] a = m.toCharArray();//String 문자열을 char형 배열로 바꿔서 반환해주는 메서드
		
		 "ABCD" 라는 문자열이 있으면
			arr[0] = 'A'
			arr[1] = 'B'
			arr[2] = 'C'
			arr[3] = 'D'
		위 값처럼 char 배열을 반환해준다. 
		 
		int sum=0;
		for(int i=0; i<n ; i++) {
			sum += a[i] -'0';			
		}
		System.out.println(sum);
		
	}

}
*/

 
public class Main{

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	char[] a = S.toCharArray();
	int o = 0;
	int intArr[] = new int[26]; // 알파벳 개수만큼 배열생성
	Arrays.fill(intArr,-1);     // 배열을 전부 -1로 채움
	for (int i=0; i<a.length; i++) {
		o = a[i]-'a';                     //첫번째부터 어떤 알파벳이 있는지 확인
		if(intArr[o] == -1) {             //중복되는 알파벳 숫자입력 방지
			intArr[o] = i;    }             // 해당 알파벳 배열에 순서입력	
	}
	for (int i=0; i<intArr.length; i++) {
		 System.out.print(intArr[i] + " "); 
	}
}
}