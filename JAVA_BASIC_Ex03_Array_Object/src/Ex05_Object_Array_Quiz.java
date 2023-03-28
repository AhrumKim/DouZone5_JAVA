import kr.or.kosa.dto.Emp;

public class Ex05_Object_Array_Quiz {

	public static void main(String[] args) {

		/*
		 사원 3명을 만드세요
		 단 Array 사용하세요
		 사원의 정보
		 1000, 홍길동
		 2000, 김유신
		 3000, 유관순
		 
		 2.개선된 for문으로 사번, 이름 모두 출력하세요
		 
		 */
		Emp[] empArray = new Emp[3];
		empArray[0] = new Emp(1000, "홍길동");
		empArray[1] = new Emp(2000, "김유신");
		empArray[2] = new Emp(3000, "유관순");
		
		// 2. for문으로 사번, 이름 모두 출력
		for (int i = 0; i < empArray.length; i++) {
			empArray[i].empInfoPrint();
			//System.out.println("사번: " + empArray[i].getEmpno() + " , " + "이름: " + empArray[i].getEname());
		}
	}

}