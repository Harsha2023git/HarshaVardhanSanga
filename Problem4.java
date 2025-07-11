package org.interview.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n =sc.nextInt();
		int[] input =new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++) {
			input[i]=sc.nextInt();
		}
		Map<Integer,Integer>result=new HashMap<>();
		for(int i =1;i<=9;i++) {
			result.put(i,0);
		}
		for(int num:input) {
			for(int i=1;i<=9;i++) {
				if(num%i==0) {
					result.put(i, result.get(i)+1);
				}
			}
		}
		System.out.println(result);
	}

}
