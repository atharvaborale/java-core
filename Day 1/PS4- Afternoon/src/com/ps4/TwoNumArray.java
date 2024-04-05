package com.ps4;

import java.util.Scanner;

public class TwoNumArray {
	
	
	 static int arr[]= {5,10,15,20,25};
	
	
	 public static void  Check(int a,int b) {
    	 
		 boolean num1=false;
		 boolean num2= false;
    	 for(int n=0; n<arr.length; n++) {
    		 if (arr[n]==a) {
    			  num1=true;
    		 }
    		 
    	 if (arr[n]==b) {
    		 num2=true;
		 }
    	 
    	 }
    	
    	 if (num1 && num2) {
             System.out.println("It's Bingo");
         } else {
             System.out.println("Not Found");
         }
		
	 }
	 
	 
      

	public static void main(String[] args) {
		System.out.println("Please Enter number from 1 to 40");
		Scanner sc =new Scanner(System .in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		TwoNumArray.Check(a,b);
		
	    
	}
}
