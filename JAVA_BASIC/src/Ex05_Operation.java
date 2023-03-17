
public class Ex05_Operation {

	public static void main(String[] args) {
		// 연산자(산술, 논리, 관계)
		int result= 100/100;
		System.out.println("result : " + result);
		
		result=13/2; //몫
		System.out.println("result :" + result);
		
		//나머지를 구하는 연산자(%)
		result =13%2;
		System.out.println("result : " + result);
		
		//증가, 감소(증감감 여난자 : ++1씩 증가, --1씩 감소)
		int i =10;
		++i;  //전치증가
		System.out.println("i: " +i);
		i++; //후치증가
		System.out.println("i: " +i);
		//다른 결합되지 않고 혼자서 있으면 전티와 후치는 의미가 없다.
		
		//Today point( 증가감 연산자와 다른 연산이 결합되면)
		int i2 =5;
		int j2= 4;
		
		int result2 = i2 +  ++j2; //전치가 먼저 동작
		System.out.println("result2: "+result2+" j2: "+j2);
		//result2 :10 j2:5
		result2=i2 +j2++;
		System.out.println("result2: "+result2+" j2: "+j2);
		//result2: 10 j2:6
		
		
	}

}
