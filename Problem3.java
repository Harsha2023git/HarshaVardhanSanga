package org.interview.programs;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n =sc.nextInt();
		
		if(n%2==0) {
			      n=n-1;  
			      for(int i =0;i<n;i++) {
						System.out.print((2*i)+1+" ");
					}
		}else {
			for(int i =0;i<n;i++) {
				System.out.print((2*i)+1+" ");
			}
		}
	}

}