import kr.or.kosa.AirPlane;


public class Ex06_Static_AirPlane {
	public static void main(String[] args) {
		
		AirPlane a1 = new AirPlane();
		a1.setName("a1");
		a1.setAirNum(1);
		a1.aircheck();
		
		AirPlane a2 = new AirPlane();
		a2.setName("a2");
		a2.setAirNum(2);
		a2.aircheck();
		
		
		AirPlane a3 = new AirPlane();
		a2.setName("a3");
		a2.setAirNum(3);
		a2.aircheck();
		
		System.out.println("만들어진 비행기 총 대수 : "+ AirPlane.airP_sum);
	}
}
