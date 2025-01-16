package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("잔액 : " + balance);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("잔액 : " + balance);
        } else {
            System.out.println("잔액 부족");
            System.out.println("잔액 : " + balance);
        }
    }

    void showStatus() {
        System.out.println("잔고: " + balance);
    }
}
