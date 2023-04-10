import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08_File_Dir {

	public static void main(String[] args) {
		File dir = new File("D:\\Temp");
		File[] files = dir.listFiles(); // POINT (폴더 or 파일)
		
		for(int i = 0 ; i < files.length ; i++) {
			File file = files[i];
			
			String name = file.getName(); //폴더명 or 파일명
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH-mma");
			String attribute="";
			String size="";
			
			if(files[i].isDirectory()) { //폴더
				attribute="< DIR >";
			}else { //파일  a.txt ....
				size = file.length() + "byte";
				attribute = file.canRead()   ? "R" : "";
				attribute += file.canWrite() ? "W" : "";
				attribute += file.isHidden() ? "H" : "";
			}
			
			System.out.printf("%s  %3s  %10s  %s  \n",
					          dt.format(new Date(file.lastModified())),
					          attribute,
					          size,
					          name);
		}

	}

}
