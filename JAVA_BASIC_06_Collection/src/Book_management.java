import java.util.HashMap;
import java.util.Scanner;

class Book{ //Book 클래스 생성
	String book_number; //번호
	String book_name; //이름
	int book_price; //가격

	//Book 생성자 생성
	public Book( String book_number, String book_name, int book_price) {
		
		this.book_name= book_name;
		this.book_number=book_number;
		this.book_price=book_price;			
	}
	
	//  getter, setter 함수 생성
	
public String getBook_number() {
		return book_number;
	}
	public void setBook_number(String book_number) {
		this.book_number = book_number;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	
	//오버라이드 toString  함수 생성
	
	@Override
	public String toString() {
		return "Book [book_number=" + book_number + ", book_name=" + book_name + ", book_price=" + book_price + "]";
	}

}
	
	//BoojManger 클래스 생성
	
class BookManager{
	// bookaMap 해쉬맴 생성

	private HashMap<String,Book> bookMap;
	
	//BookManger 생성자 함수 생성
	public BookManager() {
		
		this.bookMap = new HashMap<String, Book>();
		
	}
	
	//추가 도서 메서드 생성
	
	public void addBook() {
		Scanner sc= new Scanner(System.in);//추가 책 정보 저장
		
		System.out.println("추가할 도서 ISBN:");
		String isbn = sc.nextLine();//추가 도서 저장
		
		System.out.println("도서 제목:");
		String title= sc.nextLine(); //추가 도서 제목 저장
		
		System.out.println("가격: ");
		int price=sc.nextInt(); //추가 도서 가격 저장
		
		
		
		Book book = new Book(isbn, title, price); //book 생성
		bookMap.put(isbn,book); //bookMap에 isbn, book  정보 넣기
		System.out.println(book.toString() + "생성하였습니다.");	 //book 추가 정보 생성 출력
	}
	
	//삭제 도서 메서드 생성
	public void removeBook() {
		Scanner sc= new Scanner(System.in); //삭제 도서 정보 저장
		
		System.out.println("삭제할 도서 ISBN:");
		String isbn=sc.nextLine();
		
		if(bookMap.containsKey(isbn)) {//삭제할 도서 정보 찾기
			Book book = bookMap.get(isbn); //받아온 isbn 도서
			bookMap.remove(isbn);
			System.out.println(book.getBook_name()+ "삭제하였습니다.");
		}else {
			System.out.println("해당 ISBN의 도서가 존재하지 않습니다.");
		}
	}
	public void searchBook() {
		//책 검색 메소드 생성
		Scanner sc= new Scanner(System.in);
		System.out.println("검색할 도서 ISBN:");
		String isbn = sc.nextLine();
		
		if(bookMap.containsKey(isbn)) {
			Book book = bookMap.get(isbn);
			System.out.println("검색 결과 >>" + book.toString());					
		}else {
			System.out.println("해당 ISBN의 도서가 존재하지 않습니다.");
		}			
}

	public void printBookList() {
		//목록 메소드 생성
		System.out.println("도서 목록");
		System.out.println("도서 수 : " + bookMap.size()); //size()함수는 배열의 크기를 구하는 함수임
		for(String isbn: bookMap.keySet()) {// keySet()함수는  Map의 전체 Key를 꺼내는 함수
			Book book= bookMap.get(isbn);
			System.out.println(book.toString());//도서 목록 출력
			
		}
	}
	
	public void printisbnList() {
		//isbn 목록 메소드 생성
		System.out.println("ISBN 목록");
		System.out.println("도서 수:" +bookMap.size());//도서 수 출력 size()함수 사용
		for(String isbn: bookMap.keySet()) {
			System.out.println(isbn);
		}
	}
	public void Run() { //실행 메소드 생성
		Scanner sc= new Scanner(System.in);
		int menu= -1;
		
		while(menu!=0) {
			System.out.println("1. 추가 2:삭제 3:검색 4: 도서 목록 5: ISBN 목록 0: 종료");
			menu=sc.nextInt(); //메뉴 값 저장
			sc.nextLine();//개행 문자 제거
			
			 switch(menu) {
			 case 1:
				 addBook();
				 break;
			 case 2: 
				 removeBook();
				 break;
			 case 3: 
				 searchBook();
				 break;
			 case 4: 
				 printBookList();
				 break;
			 case 5: 
				 printisbnList();
				 break;
			 case 0: 
				 System.out.println("종료합니다....^^");
				 break;
			default: 
				System.out.println("다시입력해주세요!!:) ");
				break;
				 
			 }
		}
	}
}

	
public class Book_management {

	public static void main(String[] args) {
		BookManager bm = new BookManager();
        bm.Run();
    }
}




