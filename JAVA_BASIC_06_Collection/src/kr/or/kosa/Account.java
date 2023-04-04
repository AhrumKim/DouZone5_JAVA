package kr.or.kosa;

import java.util.ArrayList;

public class Account {
	String account_number; //계좌번호
	String account_name; //소유자명
	int balance; //잔고
	String[] Transaction; // 거래 내역

	
	Account account= new Account("123-456-78910,"김유신");
	System.out.println(emp.toString());
	Account[]emplist = {new Account(100,"김씨", "영업"), new Account(200,"박씨","IT")};
	for(account e : emplist) {
		System.out.println(e.toString());
	}
	
	//3. ArrayList 사용해서
	ArrayList elist = new ArrayList();
	elist.add(new Emp(100,"김씨","영업"));

	
	//계좌번호 및 소유자명 
	Account(String account_number, String account_name,int balance){
		this.account_number= account_number;
		this.account_name= account_name;
		this.balance= balance;
		
	}
}
class account1 extends Account{
	account1(){
		super( );
	}
}
