package kr.or.kosa;

/*Tv 설계도 요구사항 정의
 
 */
public class Tv {
	public int channel;
	public String brand_name;

	public int upChannel() {

		return channel++;
	}

	public int downChannel() {

		return channel--;
	}
	public void name(){
		System.out.printf("브랜드: %s",brand_name );		
	}
	public void information(){
		System.out.printf("브랜드: %d",channel);		
	}
	
}
