package kr.or.kosa;
/*
기능 (행위) 만드는 방법
method 만드는 방법(문법)
 
 method: 행위 또는 기능의 최소단위 구현: [하나의 함수]는 [하나의 기능]만 구현
 ex) 먹는 기능, 자는 기능
 
 ex) 롯데월드 : 게임방 : 동전(농구), 동전 뽑기(포켓몬)
 
 **모든 함수는 호출에 의해서만 동작한다**
 누군가 이름을 부르지 않으면 동작하지 않는다
 
 JAVA)
 1.void, parameter(0) >> 인자, 인숲 : public void print(String str){실행구문}
 2 void, parameter(X) : public void print(){실행구문}
 3.return type, parameter(0) : public int print(int data){return 100;}
 4.return type, parameter(X) : public int print(int data){return 100;}

void > 돌려주는 것이 없어요 > return type없어요 
return type >> 8가지 기본 타입 +1(String), Array, class, interface, Collection
이 중에서 8가지 + String + class 학습

public boolean print(){ return true; }
Car print() { return Car 주소값}
Car print() { return new Car();}
Car print() { Car car = new Car(); return car; } 목표 : 자유롭게 가지고 놀기 
 
 Sting print(){return "AAAA";}
 
 paramter type >> void print(String 변수)
 parameter type >>8가지 기본 +1(String), Array, Class, interface, Collection
 
 void print(int i ){} >> 호출 print(100);
 void print(String str){}>> 호출 print("이예진");
 void print(Car car){}>>호출> Car c1=new Car() print(c1);.....print( new Car());
 void print2(int a, int b, int c){ //나는 무조건 실행할 때 3개 paramter 받겠다 강제제
 
 print(10);(X)
 print2(10,20) (X)
 print2(10,20,"30")
 print291,2,3) (0)
 
 함수의 이름: 관용적
 class Car , class Person
 
 메서드 : getNumber();
 
 사원테이블에서 사원의 모든 정보를 가지고 오는 함수를 만들어라
 void getEmpAllList()

 사원테이블에서 사원의 번호를 가지고 사원의 모든 정보를 가지고 오는 함수를 만들어라
 void getEmpListByEmpno()
 
  */
public class Fclass {
	public int data;
	
	// void m() >> 컴파일러가 >> default void m() >> 같은 폴더(package)내에서만 사용
	
	//함수의 접근자(수정자) : 70% public
	//함수 30% private  : class 내부에서는 public, private 의미가 없어요 다 같은 식구일뿐
	
	//클래스 내부에서 사용해라>> 이런 함수 >> 다른 함수를 도와주는 함수 (공통함수)
	
	public void m() {//void parameter (X)
		//기능 구현
		System.out.println("일반함수 : void, parameter(x)");
		
	}
	
}
