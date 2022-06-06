package com.tenzo.projJava.crashcourse.kharchenko;

import java.util.Scanner;

public class Main {

    static {
        new Account().registration(1, "1111");
        new Account().registration(2, "0000");
        new Account().registration(3, "2222");
        new Account().registration(4, "3333");
        new Account().registration(5, "4444");
        new Account().registration(6, "5555");
        new Account().registration(7, "6666");
    }

    public static void main(String[] args) {
        Account account = new Account();
        Transaction transaction = new Transaction();
        ATM atm = new ATM();
        AccountHolder holder = null;
        Scanner scanner = new Scanner(System.in);
        boolean isCancel = false;
        int answer;
        int identity;
        String pin;
        float sum;

        while (!isCancel) {
            System.out.println("\nWelcome to the internet bank!");
            System.out.println("1: Registration.");
            System.out.println("2: Login.");
            System.out.println("3: Make transaction.");
            System.out.println("4: Put money into the account.");
            System.out.println("5: Check sum on wallet.");
            System.out.println("0: Exit.");
            System.out.print("Enter: ");
            answer = scanner.nextInt();

            switch (answer) {
                case 1:
                    System.out.print("Enter your identity: ");
                    identity = scanner.nextInt();
                    System.out.print("Enter your PIN: ");
                    pin = scanner.next();

                    System.out.println(account.registration(identity, pin));
                    break;
                case 2:
                    System.out.print("Enter your identity: ");
                    identity = scanner.nextInt();
                    System.out.print("Enter your PIN: ");
                    pin = scanner.next();

                    holder = account.login(identity, pin);

                    if (holder == null) System.out.println("Login failed!");
                    else System.out.println("Login successful");
                    break;
                case 3:
                    if (holder == null) System.out.println("You need login!!!");
                    else {
                        System.out.print("Enter recipient identity: ");
                        identity = scanner.nextInt();
                        System.out.print("Enter sum: ");
                        sum = scanner.nextFloat();

                        System.out.println(transaction.transaction(holder, sum, identity));
                    }
                    break;
                case 4:
                    System.out.print("Enter sum: ");
                    sum = scanner.nextFloat();

                    System.out.println(atm.putMoneyOnAcc(holder, sum));
                    break;
                case 5:
                    if (holder == null) System.out.println("You need login!!!");
                    else {
                        System.out.println("Money: " + account.checkWallet(holder));
                    }
                    break;
                case 0:
                    isCancel = true;
                    break;
            }
        }

        scanner.close();
    }
}
