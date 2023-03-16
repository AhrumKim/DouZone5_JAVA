/*
1. 자바가 제공하는 기본 타입(원시타입) >> 8가지
2. 8가지 타입은 값을 저장 하는 타입
숫자      정수(음의 정수 0 양의 정수) byte(8bit) -128 ~ 127
                               char(2 byte) 한문자 (내부적으로는 정수값)
                               영문자, 특수문자, 공백(1Byte), 한글 1자(2byte)
                               협의(국제) >> 모든 문자는 2byte >>  표준화 >> unicode >>아스키 코드표현
                               ex)chat c= 'A', char ch= '가'
                               short 호환성 
                               int (4byte -21~21) **~~ ** 정수 리터럴의 기본 타입 int  
                               long (8byte)
                         
         실수(부동소수점)          float(4byte)  7자리 정도의 표현 가능
                               double(8byte) 15자리 정도의 소수 표현 가능
                               (boolean) 정밀도가 높다(표현 범위가 크다) **~~** 싷수 리터럴의 기본 타입은  double
                              
논리                             참 거짓을 표현하는 타입(true, false) 판단      

현재는 대충 ...
정수는 int, 실수는 double 타입을 사용하면 별 문제 없다.

가장 많이 사용되는 타입(String)
String str="홍길동"; 문자열
우리가 가장 많이 사용하는 String은 클래스입니다
String 타입은 문자열을 담을 수 있습니다
ex) String str = new String("홍길동");
약속) 별도의 이야기.... 8가지 기본 타입 + 1(String) >>String 은 int, long 처럼 쓰세요 =>9가지 타입 쓰는 것

자바 타입은
1. 값 타입: 8 + 1 (값을 저장) 
2. 참조 타입 (주소값을 저장) : 클래스, 인터페이스, 배열 등등 ....


정수값을 표기하는 방법
100      십진수
0x2a     16진수
0123     8진수
0b11010  2진수
123L  or 1231    리터럴 long 타입 십진수 **
0x2aL            리터럴 long 타입 16진수

 [실수값을 표기하는 바법]
 3.14
 123.4
 123.4F, 123.4f
 1.1234e2승 >> 123.4 rkqtdmf wltnvyrlqjq
 1.234 e2승f
 
 문자값을 표기하는 방법
 'A' or '가'
 '\u0065'

 진리값을 표기하는 방법
 true
 false
  
 문자열을 표기하는 방법
 "홍길동"
 " ABCD"
 */


public class Ex03_DataType {

	public static void main(String[] args) {
		// int (-21 ~ 21)
		int num = 100000000;
		System.out.println("num: "+num);
		//int num2 = 100000000000;//The literal 100000000000 of type int is out of range 
		//literal  개발자 직접 입력한 값(있는 그대로의 값)
		//컴파일 오류
		//나는 4byte 크기의 방인데 ...더 큰값은 담을 수 없어

		
		//1.해결방법
		//int num2= 10000000000;
		long num2 = 10000000000L; //The literal 10000000000 of type int is out of range 
		//개발자가 입력하는 정수 범위는 int 벗어나면 안되요
        System.out.println("num2:"+num2);
        
        long num3 = 100;  //속지 않을 려면 값을 보지 말고 타입을 보세요(리터럴값도)
                          //long num3 = (long)100
                          //임시적 형변환 (자동으로 컴파일러가.... 큰 타입에 작은 타입을 넣는 것은)
                          //작은 타입에 있는 값을 큰 타입에 넣는 것은 당근이지
        //해결하세요
        //손실이 발생하더라도 담아 보겠다
        //int num4 = 10000000000;//The literal 10000000000 of type int is out of range 
        // int num4 = 10000000000L; //Type mismatch: cannot convert from long to int 
        // 담아 담아 (손실.....) 명시적 형변화(타입 변환) 캐스팅
        int num4= (int) 10000000000L;
        System.out.println("타입 변환 :" + num4);//1410065408 쓰레기값
        
        //정산적인 해결방법이 아니다 (버려지는 값 발생)
       
        //데이터 손실이 없어요 다행이도... 있을 수 도 있어
        //1.강제 형변환
        //int num5 = (int) 1000L; //Type mismatch: cannot convert from long to int
        
        //2. 담을 그릇을 크게
        //long num5 = 1000L;
        
        //char 2byte >>16bit >> 0 ~(216-1) >> 0 ~65535 (유니코드)
        
        // char 2byte : 한 문자를 표현하기 위해서 만든 타입
        // 영문자, 특수문자, 공백, 한글 >>>> 한문자로 표현하는 표준화
        // 한문자 >> 'A', '가', ' '
        // 문자열 >> "abcd" >> String str="abcd"
        
        char ch = '가';
        System.err.println("한문자: " + ch);
        //char ch2 ='가나'; 예외 발생(커컴파일도 안되요)... 한문자만 가능 Invalid character constant
        
        ch ='a';
        ch='A';
        
        // char 정수 타입 ( 문자를 저장하지만 내부적으로 정수값을 가지고 있다)
        // 아스키 코드표에서 십진수값과 문자값을 비교해 보세요
        int chint = ch;
        System.err.println("ch 문자를 십진수 보면: " + chint); //65
        
        //int chint = ch;
        //내부적으로 암묵적으로 자동 형변환이 발생 했어요 (자동으로)
        //int chint =(int) ch;
        
        int chint2= 'a';
        System.err.println(chint2);
        int intch2=(int)chint2; //개발자가 직접 형변환 문제 없다.
        
        
         int intch3 =65;
         //char chint3 = (char) intch3;//Type mismatch: cannot convert from int to char
         
         //1 해결 (명시적 형변환) >> 데이터 손실 발생
         //char chint3=(char)intch3;
         
         //2 해결 받는 그릇을 크게...(개발자의 의도 문자를 보고 싶어요)
         //int chint3 =intch3;
         
         //char chint3 = intch3; ..위로 올라가서  char intch3 =65;
         
         char chint3= (char) intch3;
         System.out.println("chint3 가지는 문자값: " +chint3);
         
         /*
          1. 할당에 있어서 값을 보지말고 값이 가지는 타입을 보자.
          1.1 리터럴 값에 대해서
          1.1.1 정수 리터럴의 기본 타입은 int
          1.1.2 실수  리터럴의 기본 타입은 double
          
          2.암시적 형변환, 명시적 형변화
          2.1 큰타입에 작은 타입의 값으 ㄹ넣은 것은 암시적 형변환을 하기에 개발자.. 그냥.. 사용
          2.2 작은 타입에 큰타입을 넣고자 한다면 자동 형변환을 지원하지 않기 때문에 강제적(명시적)형변환
          2.2.1  접미사  L, 1, (int) 정수, (long) 정수
          KEY POINT 강제적 형변환 데이터 손실을 감수.... 책임은 개발자가 져야 한다....
          ex) char c= (char) int  ... 손실 발생....
          */
         
         //String 타입  (8+1) 값타입 처럼 사용하자 >> 값타입 처럼 써도 문제 없게 만들었어요
         //문자열 >> 문자의 집합 >> 문자의 배열은 >>  문자열
         // int, long 동일하게 사용하세요
         String name = "홍길동";
         name ="홍길동 바보";
         
         String color= "red";
         color= color + " 방가방가"; // 오라클 + 산술만 해요 >> 결합 연산자 || 
         System.out.println(color);
         
         //TIP)
         //연산자는 언어마다 표현이 달라요
         //JAVA >> + 산술 하고, 결합도 해요
         //Oracle >> + 산술만 해요, 결합연산자 || '안녕' ||'방가방가'>>
        
         
         
         
        
        
       
        
     
        
	}

}
