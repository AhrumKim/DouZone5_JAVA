import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_Stream_imageCopy {

	public static void main(String[] args) {
		String oriFile= "C:\\Temp\\1.jpg";
		String targetFile = "copy.jpg";
		//default 경로 : C:\Douzone\java\Labs\JAVA_BASIC_07_IO
		//JAVA_BASIC_07_IO 폴더가 default 경로가 되네요		
		FileInputStream fs = null;
		FileOutputStream fos = null;
		
		try {
			fs= new FileInputStream(oriFile);
			fos= new FileOutputStream(targetFile);
			
			
			int data = 0;
			while((data= fs.read())!=-1) {
				fos.write(data); //byte 값
			}
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
