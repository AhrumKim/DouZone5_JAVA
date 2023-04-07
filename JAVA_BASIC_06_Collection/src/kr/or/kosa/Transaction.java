package kr.or.kosa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private String transactionDate;
    private String transactionTime;
    private String kind;
    private long amount;
    private long balance;

    public Transaction(String kind, long amount, long balance) {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] time = simpleDateFormat.format(now).split(" ");

        this.transactionDate = time[0];
        this.transactionTime = time[1];
        this.kind = kind;
        this.amount = amount;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return  "[" + "거래유형:" + this.kind +
                            ", 거래금액:" + this.amount +
                            ", 잔액:" + this.balance +
                            " /"+this.transactionDate+" "+this.transactionTime+"]";
    }
}