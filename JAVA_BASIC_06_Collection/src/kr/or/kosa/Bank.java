package kr.or.kosa;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final ArrayList<Account> accounts;
    private int count;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.count = 0;
    }

    public void addAccount(String accountNo, String name) {
        accounts.add(new Account(accountNo, name));
    }

    public Account getAccount(String accountNo) {
        Account findAccount = null;
        for (Account account : accounts) {
            if (accountNo.equals(account.getAccountNo())) {
                findAccount = account;
            }
        }
        return findAccount;
    }

    public ArrayList<Account> findAccounts(String name) {
        ArrayList<Account> findAccounts = new ArrayList<>();
        for (Account account : accounts) {
            if (name.equals(account.getName())) {
                findAccounts.add(account);
            }
        }
        return findAccounts;
    }

    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }

    public int getTotalAccount() {
        return this.count;
    }
}