package com.assignments.day6.PracticeProblems;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		//Initializing first two term.
		int a =0; 
		int b =1;
		//This is used to store the sum of previous two terms of the series.
		int c;
		System.out.println("Enter the number of Fibonacci terms you want :: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Fibonacci Series :");
		
		for(int i = 1; i<=n; i++) {
			if(i==1)
				System.out.println(a);
			if(i==2)
				System.out.println(b);
			if(i>2) {
				c = a+b;    //Next term is generated here.
				System.out.println(c);
				a = b;      //Changing the value of existing integer to the next integer.
				b = c;      //Changing the value of existing integer to the next integer.
			}
		}
	}

}
