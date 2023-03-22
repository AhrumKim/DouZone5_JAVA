
/*
instance variable >> class Car { private String color; }
>> 생성되는 객체마다 다른 값을 가질 수 있다
>> 만약 초기값을 설정한다면 어떤 의미 :  기본저긴 어떤 값을 초기화하겠다(private String color ="black")


local variable >> class Car { public void move(){ int speed = 0 반드시 초기화} }
>> public static void main(String[] args){ 선언된 변수 지역변수 초기화 }

block variable >> class Car { public void move() {  for(int i = 0...){} } }


 Today Point
 static variable >> 공유자원 (heap에 생성된 객체간 공유자원)
 1. 객체 생성 이전에 memory 올라가는 자원(heap, stack, 클래스(메서드) 영역 class area)
 2. 설계도를 가지고 구체화(메모리) 올라는 방법 유일 : new 
 3. static 자원은 new 없이도 메모리에 올라가요 (class 또는 method area)
 
   Ex05_Variable_Scope 클래스 >> new >> 메모리 >> 이 중에 필요한 자원 사용가능

 javac 컴파일 
 java Ex05_Variable_Scope 엔터
 1. Ex05_Variable_Scope 분석(누가, 어떤 자원, 연세......)정보 메모리 올려요 
 2. 안에 static 이런 것이 붙어 잇는 member field, method 보이면 메모리에 올려요
 3. 그런데 static 함수 중에서 이름이 main 이면 약속.... 실행하겠냐고(진입점, 실행점
 */

//class VariableClass{

//}


class VariableClass{
	int iv;
	static int cv;
	
	void main() {
		int lv= 0;
		for(int i=0; i<=100; i++) {
			
		}
	}

	public void method() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Ex05_Variable_Scope {

	public static void main(String[] args) {
		
		
		VariableClass.cv=100;//클래스 이름. static ;
		
		VariableClass vc = new VariableClass();
		vc.iv =100 ;
		vc.method();
		vc.cv=200;
		
		VariableClass vc2 = new VariableClass();
		System.out.println(vc2.cv); //어떤 값
		vc2.cv=400;
		
		
		
	}

}
