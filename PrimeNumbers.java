package com.assignments.day6.PracticeProblems;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.println("Enter a number to check if it is Prime Number or not ::");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		
		for(int i=1; i<=n;i++) {
			
			if(n%i==0) 
				count++;
		}
		if(count == 2)
			System.out.println(n+" is a Prime Number.");
		else
			System.out.println(n+" is not a Prime Number.");
	}
}
