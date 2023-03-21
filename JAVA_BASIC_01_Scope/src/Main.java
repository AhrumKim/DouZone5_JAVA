import java.util.Scanner; //키보드 입력 받기  ctrl+ shift+

//숫자의 합
/*
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 */
public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();//next 를 통해서 단어 하나를 읽은 후 정수 형태 로 변환
		 String m = sc.nextLine();
		 sc.close();
		 int sum = 0;
		 
		 for(int i=0; i<n; i++){
	            sum += a[i] - '0';
	        }
	        System.out.println(sum);
	    }
	}