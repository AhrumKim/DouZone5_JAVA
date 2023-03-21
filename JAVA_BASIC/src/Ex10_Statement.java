import java.io.InputStream;
import java.util.Scanner;

public class Ex10_Statement {


	public static void main(String[] args) {
		// 반복문(while, do ~while)
		int i = 10;
		while(i>=10) {  //true
			//반드시 
			//증가감을 통해서 true, false 판단
			//--i;  증가감의 위치도 고민하자 . . .
			System.out.println(i);
			--i;
	
		}
		//while 1~110까지의 합
		int sum=0;
		int j=1;
		while(j<=100) {
			sum+=j;
			j++;
		}
		System.out.println("sum: " +sum);
		
		//while(true){}메뉴 만들어서 . . . 
		
		//while 문으로 구구단을 작성
	    //for(int i = 2; i <=9; i++){ //블러견수 i scope
		//for(int j=1; j<=9; j++){
		
		int a =2;
		int b =1;
		
		while(a<=9) {
			b=1; //1로 정의
			while(b<=9) {
					System.out.printf("[%d]*[%d]=[%d]\t",a,b,a*b);
					b++;
				}
				System.out.println();
				a++;
			}
		//System.out.println();
		
		//for(;;){ if(조건) break;}
		//do while : 일단 한번은 강제적으로 수행.... 그리고 조건을 보고 판단한다
		//do {실행블럭} while(조건판단)
		
	
	   Scanner sc= new Scanner(System.in);
	   int inputData=0;
	   do {
		   System.out.println("숫자 입력해(0~9)");
		   inputData=Integer.parseInt(sc.nextLine());
	    }while(inputData >=10);//while 조건 true 계속해서 do문을 실행
	   							//while 조건 false do 실행하지 않아요
	 
	    	System.out.println("당신이 입력한 숫자는" +inputData);
	}
	   
		}	



