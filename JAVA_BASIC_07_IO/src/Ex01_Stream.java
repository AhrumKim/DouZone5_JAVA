import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
IO(input /output) 
Stream(통로)
데이터 종류: 이미지, 파일, <> 문자

 JAVA API >> 클래스 제공 받아요
 I/O 기본 단위는 Byte
 
 추상 클래스
 
InputStream, OutPutStream(추상함수... 재정의)

당신이 Byte 데이터 작업
InputStream 상속 구현하는 클래스 사용해라

대상이 
1. Memory : ByteArrayInputStream
2. File   : FileIntputStream (**)

당신이 Byte 데이터 작업
출력 OutputStream 상속 구현하는 클래스 사용해라

대상이 
1. Memory : ByteArrayOutputStream
2. File   : FileOutputStream (**)

사실 지금까지 memory Array, Collection  통해서 메모리기반 작업...


 */
public class Ex01_Stream {

	public static void main(String[] args) {
		//byte(-128~127) 정수를 저장하는 타입
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[]outSrc = null; //현재 메모리를 가지고 있지 않아요
		
		//빨대 >> memory >> read, write
		ByteArrayInputStream input = null; //빨대 (통로) 입력
		ByteArrayOutputStream output = null;// 빨대 (통로) 출력

		input = new ByteArrayInputStream(inSrc); //input 대상 inSrc >> read
		output= new ByteArrayOutputStream(); //write
		
		System.out.println("outSrc before: "+ Arrays.toString(outSrc));
		
		//공식같은 로직(암기)
		int data=0; 
		while((data= input.read()) != -1){ 
			//System.out.println(data);
			
			//read 한 데이터를 다른 Stream 을 사용해서 출력
			output.write(data); // 출력통로 안에 (빨대) 안에 데이터를 담고 잇는 것
			// write 대상이 data가 아니고 ByteArrayOutputStream 자신의 통로에....
			
		/*
		while(input.read()!=-1) {
			//System.out.println("data: " + data);
			//read()함수는 내부적으로 next()
			//System.out.println(input.read());
			
		}
		*/
		//byte[] outSrx = null;
			outSrc= output.toByteArray();//자신이 가지고 있는 데이터를 Bye[]
			//바꾸어서 주소를 outSrx 전달
			System.out.println("outSrx vefore : " +Arrays.toString(outSrc));
			}
	}
}

