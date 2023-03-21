import kr.or.kosa.common.Car;

//객체지향 언어 => 재사용성(설계도가 있으면 똑같이 재사용 할 수 있음)

/*
클래스의 구성 요소 (설계도라고 판단하기엔 최소한 무엇을 가지고 있어야 한다)
[필드 + 메서드] +생성자
(속성 + 명수(기능))

필드(member filed >> 데이터, 자료 정보를 달고 있다 >>  고유정보, 생성정보)
함수(method) >> 기능(생략)>> 자동차 >> 달린다 >> 멈춘다  >> 소리가 난다 , 문을 연다....
+ 추가적으로 생성자(함수) >> 특수한 목적의 함수 >> 객체 생성시 member field 초기화 목적 생성되는 함수,  getter, setter (read, 
class  설계도{
	고유정보
	상태정보
	부품 정보
	
	기능(행위)
}        

	
	클래스, 필드 , 생성자함수, 메서드 : 영역 (범위) >> 생성되는 장소(위치) or 접근자(생성자, 수행자)
	
	장소(위치) : 폴더(package) 를 기반으로... 클래스 내부, 함수 내부, 제어문 내부
	접근자    : public, private, default, protected
	
	kr.or.kosa.common 안에 생성한 Car 클래스는 > public lass Car() >> 나 다 오픈할꺼야
	kr.or.kosa.common 안에 생성한 AirPlane 클래스는    > class AirPlane{} >> 같은 폴더 안에서만 사용
	
	
	>> default 같은 폴더에서만 공유 (같은 package  에서만 사용)
	>> 연습용으로 ... 또는 특정클래스의 도움을 주는 클래스 생성시
	
	연스뵹으로 바르게 작업... 편할까
	
	하나의 물리적 Java 파일은 여러개의 클래스를 가질 수 있다
	>> Ex01_ Main.java 파일은 그 안에 public class Ex01_Main 클래스를 가지고 있다
	1. 개발에서는 필요한 클래스는 Package 생성하고 그 안에 만들어 사용합니다(Car 클래스 처럼)
	2. 그냥 연습... 굳이 폴더 생성.. 물리적파일 여러개 만들 필요가 있을까
	3. 하나의 물리적 파일에 여러개의 클래스를 만들어 쓸 수 있게 해줄까 (연습 . . .)
	31 대신에 public 접근자는 한 놈....
	
	
 */

class Emp{ //연습할때나 공부할때 ....	
	
}


class Dept{  //컴파일러가 default class Dept 해석
	int deptNo; //컴파일러가 default int deptNo 해석
	public String dname; //에러는 아니지만 다른 폴더 사용 불가(클래스 default) public 의미 없다.
	private int count;  //Private 캡슐화(은닉) 
	                    // 설계자의 의도 : 클래스 내부에서만 사용 목적
	                    // 설계자의 의도 : 직접 할당을 막고 간접할당을 활동 제어 하겠다

	//특수한 함수
	//getter(읽기 전용),  setter(쓰기 전용)
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) { //간접할당
		if(count<0) {
			this.count = 0;
		}else {
			this.count = count;
		}
		
	}
		
}
 
//class Apt{
	
//}

/*
폴더
kr.or.kosa.dto.Test

public class Test{
	private int i;
	
	public void setI(int i)
	this.i = i;
	}
	public it getI(){
		return this.i;
		}
		public void print(){
		
		}
	}
		
 */

//연습용
class Test{   // default 
	int data;    // default 클래스가 가지는 변수 (member field) >> instance variable
	
	void print() {//default
		int num=0; //local variable => 무조건 초기화
		for(int i = 0; i<=100; i++) { //int i =0 제어문 안에서 block  variable
			
		}
	for(int i = 0; i<=100; i++) { //int i =0 제어문 안에서 
		
	}
	int k=0;
	for(k = 0; k<=100; k++) { //int i =0 제어문 안에서 
		
	}
	System.out.println(k);
	
}
//data 변수는 :Test test = new Test();
//print()함수가 호출 되었을 때 num 변수 생성
//int i 변수 for문 실행 될 때 생성
public class Ex01_Main {

	public static void main(String[] args) {
		// 같은 폴더 안에 있는 클래스 ... 
		Apt apt = new Apt();
		 //kr.or.kosa.common.Car car = new kr.or.kosa.common.Car(); //public class Car{} 폴더의 구분없이 어디서나 사용가능하다
		Car car= new Car();
		
		Dept dept= new Dept();
		//dept.count (캡슐화) 
		dept.deptNo = 100;
		System.out.println(dept.deptNo);
		
		dept.dname="IT";
		System.out.println(dept.dname);
		
		dept.setCount(-100);
		System.out.println(dept.getCount());
		
		Test test = new Test();
		test.print(); //
		
	}
 }
}


