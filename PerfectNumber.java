package com.assignments.day6.PracticeProblems;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number to check if it is Perfect Number or not ::");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		System.out.println(n+" is divisible by:");
		for(int i=1; i<n; i++) {
			if( n%i == 0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("\nSum of divisors :"+sum);
		if ( n == sum) {
			System.out.println("\n"+n+" = "+sum);
			System.out.println("Perfect Number.");
		}
		else {
			System.out.println("\n"+n+" != "+sum);
			System.out.println("Not a Perfect Number.");
		}
			
	}

}
