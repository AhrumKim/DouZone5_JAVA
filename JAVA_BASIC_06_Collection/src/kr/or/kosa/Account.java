package kr.or.kosa;

import java.util.ArrayList;

public class Account {
    private String accountNo;
    private String name;
    private long balance;
    private int num;

    private final ArrayList<Transaction> transactions;

    public Account(String accountNo, String name) {
        this.transactions = new ArrayList<>();
        this.accountNo = accountNo;
        this.name = name;
        this.balance = 0;
        this.num = 0;
    }

    public void deposit(long amount) {
        if(amount <= 0){
            System.out.println("입력오류");
        }else{
            this.balance += amount;
            transactions.add(new Transaction("deposit", amount, balance));
        }
    }

    public void withdraw(long amount) {
        if(amount <= 0){
            System.out.println("입력오류");
        }else{
            if(this.balance < amount){
                System.out.println("잔액부족");
            }else{
                this.balance -= amount;
                transactions.add(new Transaction("withdraw", amount, balance));
            }
        }
    }

    public long getBalance() {
        return this.balance;
    }

    public ArrayList<Transaction> getTransaction() {
        return this.transactions;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "[" + "계좌번호:" + this.accountNo +
                        ", 소유자명:" + this.name +
                        ", 잔액:" + this.balance + "]";
    }
}