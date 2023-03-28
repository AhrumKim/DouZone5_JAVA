
public class Ex02_Exception {

	public static void main(String[] args) {
		System.out.println("main start");
		int num =100;
		int result = 0;
		
		//개발자가 의심되면... 문제가...
		try {
			for(int i = 0; i<10; i++) {
				result = num/ (int)(Math.random()*10); //0~9 난수
				System.out.println("result: " + result + "i:" +i);
			}
			
		}catch(ArithmeticException e) { //Exception e[유지보수]가 힘들어요(기독성)
				System.out.println("문제 발생했어요^^ 관리자에게 알려주세요");
				System.out.println("원인 :" +e.getMessage());
		}
		System.out.println("main end");
	}

}
