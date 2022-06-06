package com.tenzo.projJava.crashcourse.kharchenko;

public class AccountHolder {
   private int identity;
   private String pin;
   private float money;

   public AccountHolder(){}

    protected AccountHolder(int identity, String pin){
       this.identity = identity;
       this.pin = pin;
       this.money = 0.0f;
    }

    protected int getIdentity() {
        return identity;
    }

    protected void setIdentity(int identity) {
        this.identity = identity;
    }

    protected String getPin() {
        return pin;
    }

    protected void setPin(String pin) {
        this.pin = pin;
    }

    protected float getMoney() {
        return money;
    }

    protected void setMoney(float money) {
        this.money = money;
    }
}
