package org.interview.programs;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
	        while(true) {
	        	Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a : ");
		        double a =sc.nextDouble();
		        System.out.println("Enter b : ");
		        double b =sc.nextDouble();
		        System.out.println("Enter the Type of Operation :\nFor Addition enter add \nFor Substraction enter sub \nFor Multiplication enter mul \nFor Division enter div");
		        String operation =sc.next();
		        switch(operation) {
		        case "add" :System.out.println("Addition of "+a+" and "+b+" is equals to "+(a+b));
		        break;
		        case "sub" :System.out.println("Substraction of "+a+" and "+b+" is equals to "+(a-b));
		        break;
		        case "mul" :System.out.println("Multiplication of "+a+" and "+b+" is equals to "+(a*b));
		        break;
		        case "div" :if(b==0){
		        	System.out.println("Invalid Input");
		        }else {
		        	System.out.println("Division of "+a+" and "+b+" is equals to "+(a/b));
		        }
		        break;
		        }
		        
	        }
	        

	}

}
