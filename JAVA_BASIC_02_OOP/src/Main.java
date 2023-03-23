import java.util.Scanner;
/*
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String m=sc.next();
		char[] a = m.toCharArray();//String 문자열을 char형 배열로 바꿔서 반환해주는 메서드
		/*
		 "ABCD" 라는 문자열이 있으면
			arr[0] = 'A'
			arr[1] = 'B'
			arr[2] = 'C'
			arr[3] = 'D'
		위 값처럼 char 배열을 반환해준다. 
		 */
		int sum=0;
		for(int i=0; i<n ; i++) {
			sum += a[i] -'0';			
		}
		System.out.println(sum);
		
	}

}
