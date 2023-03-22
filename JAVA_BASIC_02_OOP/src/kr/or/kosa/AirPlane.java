package kr.or.kosa;


/*
우리 회사는 비행기를 수분 제작 판매하는 회사입니다
우리 회사는 비행기를 생산하는 설계도를 만들려고 합니다
 
 
 요구사항
 1. 비행기를 생산하고 비행기의 이름과 번호를 부여해야 한다
 2. 비행기를 생산되면 비행기의 이름과 번호가 맞게 부여되었는지 확인 하는 작업이 필요하다(출력) -> 기능
 3. 공장장은 현재까지 만들면서 비행기의 총 누적대수를 확인 할 수 있다-> 기능
 
 AirPlane air101 = new AirPlan();
 air101.자원 = 대한항공
 air101. 자원 = 707
 
 비행기 이름, 번호 추력
 
 
 생성자 사용금지 >> 배운 다음에 사용 >> 생성자를 써야 코드가 이뻐져요 
 
 */
public class AirPlane {
	
	public static int airP_sum;
	
	private String name;
	private int airNum;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAirNum() {
		return airNum;
	}

	public void setAirNum(int airNum) {
		this.airNum = airNum;
	}

	public void aircheck() {
		System.out.print("비행기 이름 : "+name);
		System.out.println(", 비행기 번호 : "+airNum);
		airP_sum++;
	}

	
}