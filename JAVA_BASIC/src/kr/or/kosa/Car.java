package kr.or.kosa;

//class== 설계도==타입
public class Car {
    private int door;   //캡슐화 (직접적으로 사용 못하게 함)
    private String carColor;
    
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
     
public void run() {
	//void=> 아무것도 돌려주지 않음.
	System.out.println("달린다");
}
public void stop() {
	System.out.println("멈춘다");
}
};
