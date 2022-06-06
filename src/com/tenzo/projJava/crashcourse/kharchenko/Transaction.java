package com.tenzo.projJava.crashcourse.kharchenko;

public class Transaction {

    public String transaction(AccountHolder fromUser, float sum, int toUserIdentity){
        if (fromUser.getMoney() < sum) return "Not enough money!";

        fromUser.setMoney(fromUser.getMoney() - sum);

        AccountHolder userTo = Bank.accounts.get(String.valueOf(toUserIdentity));
        userTo.setMoney(userTo.getMoney() + sum);

        Bank.transactionHistory.put(String.valueOf(fromUser.getIdentity()), String.format("You send %.2f to %s.", sum, toUserIdentity));
        Bank.transactionHistory.put(String.valueOf(userTo.getIdentity()), String.format("You take %.2f from %d.", sum, fromUser.getIdentity()));

        return "Transaction success!";
    }
}
