package com.assignments.day6.PracticeProblems;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args){
		
		int number, reverse = 0;  
		System.out.println("Enter a numbe to print its Reverse :");
		Scanner s = new Scanner(System.in);
		number = s.nextInt();

		while(number != 0){
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;
		}  
		System.out.println("The Reverse of the number is : \n" + reverse);  
	}	
}
