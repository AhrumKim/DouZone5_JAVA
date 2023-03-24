

class Zcar2{
	String color;
	String gearType;
	int door;
	
	Zcar2(){ //기본 설정
		this("red",2);
		System.out.println("default ....");
		//기본옵션(red,2,auto)
	}
	Zcar2(String color ,int door){ //기본설정 색상,문의 개수 변경
		this(color,"auto",door);
		System.out.println("overloading parameter 2개 call");
		//옵션 color , door 변경 (default auto)
	}
	
	Zcar2(String color , String gearType , int door){ //모든 옵션은 변경가능 합니다
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("overloading parameter 3개 call");
		//옵션 : color , door , gearType
	}
	
	
	void socarPrint() {
		System.out.println(this.color + " , " + this.gearType + " , " + this.door);
	}
}

public class Ex16_this {

	public static void main(String[] args) {
		Zcar2 zcar = new Zcar2();
		zcar.socarPrint();
		
		Zcar2 zcar2 = new Zcar2("yellow","auto",10);
		zcar2.socarPrint();
		
		Zcar2 car = new Zcar2(); //기본옵션

		
		Zcar2 car2 = new Zcar2("gold",10); 
		
		Zcar2 car3 = new Zcar2("gold","auto",20); 
	}

}
