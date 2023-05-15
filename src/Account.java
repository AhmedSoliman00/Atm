package com.mycompany.myproject;
import java.util.Date;
import java.util.Scanner;
public class Account implements Bank_Interface {
        Scanner sc=new Scanner(System.in);
    static int count=1;
    protected String name;
    protected String password;
    protected int id;
    protected double balance;
    protected Date dateCreated;
    protected static int minimum_passwordlenght=6;
    //Data Show
        @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
        @Override
        public void withdraw(double withdrawAmount){
       if (withdrawAmount>0&&this.balance>=withdrawAmount){
           this.balance-=withdrawAmount;
           System.out.println(withdrawAmount+"Are withdrawn successfully");
       }
       else{
           System.out.println("your balance is unsufficient");
       }
    }
        @Override
         public void deposit(double depositAmount){
      if (depositAmount<=0){
          System.out.println("insufficient number");
      }
      else{
             this.balance += depositAmount;
        System.out.println( depositAmount+"Are  deposited successfully");
      }
    }
        @Override
      public double checkBalance(){
        return this.balance;
    }   
        
}

