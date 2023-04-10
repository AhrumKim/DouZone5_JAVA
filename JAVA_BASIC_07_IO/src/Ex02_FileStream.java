import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Today Point

Byte 데이터를 read / write 대상이  >> File (a.txt)

FileInputStream
FileOutputStream

이미지 , 엑셀  read , write

File >> 1.txt , 1.data (write , read)

I/O 자원은 개발자 직접적으로 자원에 해제 (워드 파일 작업중에 같은 파일 열었어요 ..상황 기존파일 닫기)
>>Close()
>> 예외처리 (강제된) 사용하는 I/O 클래스는 강제로 예외처리를 요구하는 코드가 많다

*/
public class Ex02_FileStream {
	public static void main(String[] args) {
		FileInputStream fs = null;
		FileOutputStream fos = null;
		
		String path = "D:\\Temp\\a.txt";
		
		try {
			
			fs = new FileInputStream(path);
			fos = new FileOutputStream("D:\\Temp\\new.txt",true);
			//현재 Temp 폴더 안에 new.txt 파일이 없어요
			/*
			FileOutputStream 
			1. write 파일이 존재하지 않으면 >> 자동 파일 생성 (create 기능)
			
			2. fos = new FileOutputStream("D:\\Temp\\new.txt",false);
			   false >> overwrite
			   
			2. fos = new FileOutputStream("D:\\Temp\\new.txt",true);
			   true >> append
			*/
			int data=0;
			while((data = fs.read()) != -1) { //"D:\\Temp\\a.txt";
				//System.out.println("정수 : " + data +  " : " + (char)data);
				fos.write(data); // 출력 스트림 //D:\\Temp\\new.txt
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//정상 , 비정상
			//함수가 강제로 return 
			//finally 강제 실행
			//자원해제  (I/O) 가비지 컬렉터가 관리하지 않아요
			//close() 명시적 >> 소멸자 호출
			
			try {
				fs.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}

