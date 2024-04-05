package com.ps6;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	Scanner sc1 =new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	
//	BankAccount bank=new BankAccount();

    System.out.print("Enter the Account number : ");
    int a=sc.nextInt();
    System.out.println("Enter the name :");
    String b=sc1.nextLine();
    System.out.println("Enter the Acoount type :");
    String c= sc1.nextLine();
    System.out.println(" Enter the Balance :");
    float d=sc2.nextFloat();
    
    
    
//   bank.setAccNo(a);
//   bank.setCustName(b);
//   bank.setAccType(c);
//   bank.setBalance(d);
	
	try {
        BankAccount account1 = new BankAccount(a,b,c,d);  // This will throw LowBalanceException
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

   
}
}

