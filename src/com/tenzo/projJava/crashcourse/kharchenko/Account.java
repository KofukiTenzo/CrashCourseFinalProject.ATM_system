package com.tenzo.projJava.crashcourse.kharchenko;

public class Account {

    public String registration(int identity, String pin) {
        String key = "";
        key += String.valueOf(identity);

        if (Bank.accounts.containsKey(key)) return "This identity is already exist";
        else if (pin.length() > 4){
            return "PIN longer than four!";
        }else if(pin.length() < 4){
            return "PIN shorter than four!";
        }
        else {
            Bank.accounts.put(key, new AccountHolder(identity, pin));
            return "Account has been created";
        }
    }

    public AccountHolder login(int identity, String pin) {
        String key = "";
        key += String.valueOf(identity);

        AccountHolder holder = Bank.accounts.get(key);

        if (holder.getPin().equals(pin)) {
            return holder;
        } else return null;
    }

    public float checkWallet(AccountHolder user){
        return user.getMoney();
    }
}
