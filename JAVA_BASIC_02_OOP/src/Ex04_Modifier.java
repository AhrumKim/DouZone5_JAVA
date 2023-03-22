import kr.or.kosa.Mouse;
import kr.or.kosa.NoteBook;

public class Ex04_Modifier {

	public static void main(String[] args) {
		
		/*
		Notebook notebook = new NoteBook();
		notebook.color = "blue";
		notebook.year = -2023; // 직접할당
		
		System.out.println("년도 : " +notebook.year);
		*/
		
		NoteBook notebook = new NoteBook();
		notebook.setColor ("blue");
		notebook.setYear(-100); // he field Notebook.year is not visible
		notebook.noteBookInfo();
		System.out.println(notebook.getYear());
		System.out.println(notebook.getColor());
		
		//---------------------------------------------------------------------
		
		NoteBook mynote = new NoteBook();
		Mouse mouse = new Mouse();
		
		//마우스 필요해 연결 해 줄께
		mynote.handleMouse(mouse);; //주소값을 전달
		

	}

}
