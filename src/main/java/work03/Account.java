package work03;
import work01.Utilitor;
import work01.Utilitor.*;
import work02.Person;

import java.util.Objects;


public class Account {
    private static long nextNo = 1_000_000_000;
    private final long no;
    private Person owner;
    private double balance;

    public Account(Person ownwe){
        if (owner == null){ throw new NullPointerException();}
        this.owner = owner;
        this.no = nextNo + Utilitor.computeIsbn10(nextNo);
        nextNo += 10;
        this.balance = 0.0;

    }
    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    public double deposit(double amount){
        this.balance += Utilitor.testPositive(amount);
        return this.balance;
    }
    public double withdraw(double amount){
        this.balance = Utilitor.testPositive(this.balance) - Utilitor.testPositive(amount);
        return this.balance;
    }
    public void transfer(double amount , Account account){
        if (account == null) throw new IllegalArgumentException();
        this.withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder
        sb.append("Account{");
        sb.append("no=").append(this.no);
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
    @Override
    public boolean equals(Objects obj){
        return this == obj;
    }
}
