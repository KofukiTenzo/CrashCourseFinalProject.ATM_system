package com.tenzo.projJava.crashcourse.kharchenko;

public class ATM {

    public String putMoneyOnAcc(AccountHolder user, float sum){
        if (user == null){
            return "Operation failed!";
        }else{
            user.setMoney(user.getMoney() + sum);
            return "Operation success!";
        }
    }

}
