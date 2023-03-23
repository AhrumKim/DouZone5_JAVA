package kr.or.kosa;
/*
 책은 책이름과 가격정보를 가지고 있다
 책이 출판되면 반드시 책이름과 책 가격정보를 가지고 있어야 한다
 책의 이름과 가겨정보는 특정 기능을 통해서만 볼 수 있고, 출판된 이후에는 수정 할 수 없다(책의 가격, 이름)
 책이름과 가격정보는 각각 확인할 수 있다
 */
public class Book {
	private String book_name;
	private int book_price;
		
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
	public void bookInfo() {
		System.out.println("[책이름] : " + book_name + "\t[가격] : " + book_price);
 }
}


