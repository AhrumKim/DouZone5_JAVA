import java.util.StringTokenizer;

public class Ex06_String_Method {

	public static void main(String[] args) {
		String str ="hello";
		String concatstr = str.concat(" world");
		System.out.println(concatstr);
		
		boolean bo = str.contains("ello");  //str.contains("elo");
		System.out.println(bo);
		
		String str2 = "a b c d"; //[a][ ][b][ ][c][ ][d]
		System.out.println(str2.length()); //7
		
		String filename ="hello java world";
		System.out.println(filename.indexOf("e"));
		System.out.println(filename.indexOf("java"));
		System.out.println(filename.indexOf("개폭망"));
		// 값이 없으면 -1 리턴 .... 배열에 원하는 단어가 없다
		// 신문사설 원하는 검색 ... 내가 원하는 단어가 있는지를 ...확인
		if(filename.indexOf("wo") != -1) {
			System.out.println("wo 단어라 하나라도 있다");
		}
		
		System.out.println(filename.lastIndexOf("a")); //9
		
		//length() , indexOf() , substring() , replace() , split() 암기...
		
		String result = "superman";
		System.out.println(result.substring(0)); //superman 시작 index ~
		System.out.println(result.substring(1)); //uperman
		System.out.println(result.substring(1,2)); // u   
		//beginIndex the beginning index, inclusive.
		//endIndex the ending index, exclusive.  (index  -1)
		System.out.println(result.substring(0,1)); //s
		System.out.println(result.substring(0,0)); //(0,-1)
		
		//Quiz
		String filename2 = "home.jpg"; //또는  h.jpeg , aaaaa.hwp 올 수 있어요
		//여기서 파일명과 확장자를 분리해서 출력
		//파일명 : home
		//확장자 : jpg
		//단 위에 배운 함수만 사용해서 출력하세요
		int position = filename2.indexOf(".");
		String file = filename2.substring(0,position);
		
		
		String extention2 = filename2.substring(++position);
		System.out.println(extention2);
		
	
		String extention =  filename2.substring(position, filename2.length());
		System.out.println(extention);
		
		System.out.println(position);
		System.out.println(file);
		
		//replace
		String str3 = "ABCDADDDDDDA";
		String result3 = str3.replace("DDDDD", "오늘은 화요일");
		System.out.println(result3);
		
		result3 = str3.replace("A", "a");
		System.out.println(result3);
		
		//ETC
		 System.out.println(str3.charAt(0));
		 System.out.println(str3.charAt(3));
		 System.out.println(str3.endsWith("DDDA")); //true
		 System.out.println(str3.equalsIgnoreCase("aBCDAdDDDDDA")); //대소문자 구별 없이 비교 
		 
		  //Today Point
		 String  str4="슈퍼맨,팬티,노랑색,우하하,우하하";
		 String[] namearray = str4.split(",");
		 for(String s : namearray) {
			 System.out.println(s);
		 }
		 
		 //정규표현식 일단 내일 시간상...
		 
		 //
		 //참고 ....StringTokenizer
		 String str6 = "a/b,c-d.f";
		 StringTokenizer sto = new StringTokenizer(str6 , "/,-.");
		 while(sto.hasMoreElements()) {
			 System.out.println(sto.nextToken());
		 }
		 
		 //넌센스
		 String str7 ="홍       길       동";
		 //저장 >> 공백제거 >> "홍길동"
		 System.out.println(str7.replace(" ","")); //홍길동
		 
		 String str8 = "      홍길동       ";
		 System.out.println(">"+str8+"<");
		 System.out.println(">"+str8.trim()+"<");
		 
		 String str9="    홍    길    동     ";
		 //"홍길동"
		 
		 //자바를 .... 혼나요
		 String result5 = str8.trim();
		 result5 = result5.replace(" ", "");
		 System.out.println(result5);
		 
		 //여러개의 함수를 연결해서 (method chain)
		 System.out.println(str8.replace(" ", "").trim().substring(2));
		 
		 //hint
		 int sum=0;
		 String[] numarr = {"1","2","3","4"};
		 for(String s : numarr) {
			 sum+= Integer.parseInt(s);
		 }
		 System.out.println("sum : " + sum);
	}

}


