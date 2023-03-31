import kr.or.kosa.Bird;

class Bi extends Bird {

	protected void moveFast() {
		super.moveFast();
	}

	public void fly1() {
		// TODO Auto-generated method stub
		
	}

	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}
class Ostrich extends Bird{
	//Ostrich
	//특수화 , 구체화
	void run() {
		System.out.println("run .....");
	}

	@Override
	protected void moveFast() {
		run();
	}
	
}

public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Bi bi = new Bi();
		bi.fly1();
		bi.moveFast();

		Ostrich o = new Ostrich();
		((Bird) o).fly1();
		o.moveFast();
	}

}