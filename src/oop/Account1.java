package oop;

import java.util.Scanner;

public class Account1 {
   int accountNo;
   String custName;
   int accountBalance;
   void  setAccountDetails(int accountNo,String custName,int accountBalance){
      this.accountBalance=accountBalance;
      this.custName=custName;
      this.accountNo=accountNo;
   }
   void withdrow(int wamount){
      accountBalance-=wamount;
   }
  void deposit(int Damo){
      accountBalance+=Damo;
  }
 void dispAccountDetails(){
    System.out.println(accountNo);
    System.out.println(custName);
    System.out.println(accountBalance);
 }
}
class main1{
   public static void main(String[] args) {
      Account1 a1=new Account1();
      a1.setAccountDetails(102546,"pidu",250000);
      System.out.println("1.withdrow\n2.deposit");
      System.out.println("Enter your choice : ");
      Scanner sc=new Scanner(System.in);
      int a= sc.nextInt();
      switch (a){
         case 1:
         a1.withdrow(50000);
         break;
         case 2:
            a1.deposit(50000);
            break;
         default:
            System.out.println("please enter valid choice");

      }
      a1.dispAccountDetails();
   }
}
