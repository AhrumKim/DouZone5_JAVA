import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Today Point(ArrayList)
public class Ex02_ArrayList {

	public static void main(String[] args) {
		//List 인터페이스 구현하고 있는 클래스 >> ArrayList >> 순서보장(index), 중복데이터 허용)
		//식당 번호표 , 은행 번호표 (동명이인)
		ArrayList arraylist = new ArrayList(); //ctrl+shift+o
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		for(int i = 0 ; i < arraylist.size() ; i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println(arraylist.toString());
		
		//add 함수는 데이터 순차적으로 넣기
		arraylist.add(400); //index > 3번째
		System.out.println("400추가 : " + arraylist.toString());
		arraylist.add(0, 1111);
		System.out.println("0번째 방에 1111 추가 :" + arraylist.toString());
		//0번째 방에 1111 추가 :[1111, 100, 200, 300, 400]
		// 1. 비순차적인 데이터 추가, 삭제 >> 성능이 좋지 않아요 >> 순서가 있는 데이터 집합
		// 2. 순차적인 데이터 추가 , 삭제  유리
		
		// [1111, 100, 200, 300, 400]
		
		System.out.println(arraylist.contains(200)); // true
		System.out.println(arraylist.size());
		arraylist.clear(); //데이터 삭제 (용량은 남아 있다)
		System.out.println(arraylist.size());
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		
		System.out.println(arraylist.isEmpty()); //false
		System.out.println(arraylist.size());
		
		Object value = arraylist.remove(0); //101  // [101][102][103]  >> 101삭제
	    System.out.println(arraylist.toString());  // [102][103]
	    
	    //POINT 다형성
	    //인터페이스 부모 타입
	    //다형성(확장성 ,유연성)
	    
	    //ArrayList arraylist = new ArrayList();
	    //습관적으로 다형성
	    List li = new ArrayList();
	    //부모타입의 참조변수 li는 자식객체의 주소값을 가질 수 있다 (다형성)
	    //인터페이스는 구현코드가 없어요 ... 재정의 ... 자식의 함수 실행 (^^)
	    li.add("가");
	    li.add("나");
	    li.add("다");
	    li.add("라");
	    System.out.println(li);
	    
	    List li2=  li.subList(0, 2);  //내부적으로 List 인터페이스 ...코드 
	    System.out.println(li2);
	    
	    //ArrayList >> Array 
	    //정렬
	    ArrayList alist = new ArrayList();
	    alist.add(50);
	    alist.add(1);
	    alist.add(7);
	    alist.add(40);
	    alist.add(46);
	    alist.add(3);
	    alist.add(15);
	    
	    System.out.println(alist.toString());
	    Collections.sort(alist); //낮은 값부터 정렬
	    //초급 ..코드 직접 작성
	    System.out.println(alist.toString()); //[1, 3, 7, 15, 40, 46, 50]
	    
	    //높은 값
	    Collections.reverse(alist);
	    System.out.println(alist.toString());
	    
	    
	}

}