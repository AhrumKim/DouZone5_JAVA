
public class JuminNumber {
	public static void main(String[] args) {
		/*
		 String jumin="123456-1234567";
			 int sum1 = 0;
			 jumin = jumin.replace("-", "");
			 for (int i = 0 ; i < jumin.length() ; i++) {
				 sum1 += Integer.parseInt(jumin.substring(i,i+1));
			 }
			 System.out.println(sum1);
		 */

		String jumin = "123456-1234567";
		int sum = 0;
		for (int i = 0; i < jumin.length(); i++) {
		    char c = jumin.charAt(i);
		    if (c == '-') continue;
		    sum += Integer.parseInt(String.valueOf(c));
		}
		System.out.println(sum);
		        
		    }
	}



