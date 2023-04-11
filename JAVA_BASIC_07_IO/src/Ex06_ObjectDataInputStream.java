import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import kr.or.kosa.UserInfo;

public class Ex06_ObjectDataInputStream {

	public static void main(String[] args) {
		String filename = "UserData.txt";
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		
		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			in = new ObjectInputStream(bis);
			
			//복원
			UserInfo r1 = (UserInfo)in.readObject();
			UserInfo r2 = (UserInfo)in.readObject();
			System.out.println(r1.toString());
			System.out.println(r2.toString());
		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
