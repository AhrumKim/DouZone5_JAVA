import java.util.Vector;

/*
Collection FrameWork
[다수의 데이터]를 다루는  [표준화된 인터페이스]를 구현하고 있는 [클래스 집합]

Collection 인터페이스 > 상속 List >> 구현  ArrayList 
Collection 인터페이스 >> 상속 Set >> 구현 HashSet

*ArrayList의 부모타입은 List 이다 (0) >> 다형성
*Collection 인터페이스는 ArrayList 부모타입니다(0)
*instanceof 검증
*Map 인터페이스 (key, value) 쌍의 배열 >> 구현 HashMap

1.List (줄을 서시오)
순서가 있는 데이터 집합(번호표) ...중복 허용 >> 순서 (0), 중복(0) 데이터 집합
>> Tip) Array 관리 >> [홍길동][홍길동][홍길동][][]>>[0] 번째 방... 단점...

1.1 Vector (구버전)-> 동기화 보장(0) >>
 		    Vector (화장실) -> 멀티 스레드 환경(Lock)-> 성능(X), 보안(0)

1.2 ArrauList(신버전)-> 동기화 보장(x)
			ArrayList(비빔밥)-> 멀티 스레드 환경(Lock) -> 성능(0), 보안(X)
Vector 유지보수, 학습용
ArrayList 활용

-------------------------------------------------------------
다수의 데이터를 다루는 방법(Array >> 정적, 고정
********방의 개수가 한번 정해지면 (방의 크기는 변경 불가)********
1. int[] arr = new int[8];
2. int[] arr2 = new int[]{2,3,4,5,6};
3. int[] arr3 = {100,200,300};

arr3 놀고 있는데 데이터가 100건이 추가
int[] arr4 = new int[100];
*****새로운 배열 생성하고 데이터 이동 (코드로 직접 개발자 구현)*****

Array
1.배열의 크기가 고정 : Car[]cars = {new Car(), new Car()} 2ro
2.접근방법 (index) >> cars[0] ,,,,, n(length-1) 

List 인터페이스를 구현하고 있는  ArrayList, vector는 
1. 배열의 크기가 동적으로 확장 or 축소 가능 >> **진실은 컴파일러가 새로운 배열을 만들고 데이터 이동...**
2. 순서를 유지(내부적으로 Array) 사용, 중복값 허용
3. 중복값 허용(index를 통해서 제어)
 */
public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 용량: " + v.capacity());//10개
		System.out.println("size: 값의 크기(개수) : " + v.size());
		
		v.add("AA"); //순서[0]
		v.add("BB"); //순서[1]
		v.add("CC"); //순서[2]
		v.add(10);
		System.out.println("size:"+v.size());
		System.out.println(v.toString());//[AA, BB, CC, 10]
		//Array >> 배열의 개수 >> length()>> 방의 개수 >> Car[0]
		//Collection>> size() >> 값의 개수 >> 객체 >> 함수 get(0)
		for(int i=0; i<v.size();i++) {
			System.out.println(v.get(i)); //get(index) return 배열 값이
					
		}
		//개선된 for 문 출력
		for(Object obj: v) {
			System.out.println(obj);
		}
		//단점 : 작은 데이터(같은 타입의 데이터)  >>>>> 가장 큰 타입을 사용해서 얻는 것이 불합리 
		//제너릭 >> 타입을 강제 >> POINT
		Vector<String>v2 = new Vector<String>();
		v2.add("hello");
		v2.add("world");
		for(String str: v2) {
			System.out.println(str);
		}
		
		Vector v3 = new Vector<>();
		
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A"); //11번째
		
		System.out.println(v3.toString());
		System.out.println(v3.capacity());//20개
		
		// 그냥 편하게 쓰세요(동적 늘어나고 줄어요)
		
		
	}

}
