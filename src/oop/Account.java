package oop;

public class Account {
    int accountNumber;
   String custName;
    int balance;
    int interesrate;
    void details(int a,String c,int b){
        accountNumber=a;
        custName=c;
        balance=b;
    }
   void calculateInterest(int p,int r,int t){
       interesrate=(p*r*t)/100;
       balance+=interesrate;
   }
   void Dispalydetails(){
       System.out.println(accountNumber);
       System.out.println(custName);
       System.out.println(balance);
   }
}
class Bank{
    public static void main(String[] args) {
        Account a1=new Account();
        a1.details(1000253,"urvish",2000);
        a1.calculateInterest(5000,3,2);
        a1.Dispalydetails();
    }
}
