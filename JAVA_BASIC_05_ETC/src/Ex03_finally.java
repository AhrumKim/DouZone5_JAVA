/*
 *try{
 }catch(Exception e){
 }finally{
 	강제적으로 실행되는 블럭
 	}
 	finally 구현했다면
 	예외가 발생하던, 예외가 발생하지 않던 [강제적으로 실행]되어야 하는 구문 가지고 있다
 	
 	게잌
 
 */
public class Ex03_finally {

	
	static void copyFiles() {
		System.out.println("copy Files");
	}
	static void starInstall() {
		System.out.println("install...");
	}
	static void fileDelete() {
		System.out.println("file Delete");
	}
	/*
	 예외가 발생... 정말 0/0, index 범위....
	 "홍길동"입력되는 예외... 개발자가 필요헤 의해서 어떤 상황을 예칙적 상황이라고 정의 가능
	 >>사용자 정의 예외 처리<<
	 throw new IOException
	 
	 */
		System.out.println("Install...");
	}



