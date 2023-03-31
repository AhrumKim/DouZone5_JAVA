package kr.or.kosa;
/*
 *디자인 패턴(생성에 관련 된 이야기) >> new

싱글톤 : 객체 하나를 만들어 공유 
의도 : 하나의 객체를 공유하는 보장성 코드를 만들어라


공유프린터 
공유 IP

Singleton s = new Singleton(); //new는 생성자 호출
Singleton s2 = new Singleton();  
Singleton s3 = new Singleton();
 */


public class Singleton {
	public static Singleton p;
	private Singleton() {
		//생성자 접근자 ㅔ걒ㅁㅅㄷ >> 생성자 호출하지 못해서 객체 new 하지 못하게...		
	}
	public static Singleton getInstance() {
		if(p==null) {
			p= new Singleton();  //POINT 같은 클래스 내부에서는 public, private 볼 수 있어요
			
		}
		return p ; //함수 같은 주소(메모리) 보장 //=> 한개의 객체만을 만드는 것을 보장하는 패턴=> 싱클톤 패턴
		
		
	}

}
