package com.assignments.day6.PracticeProblems;

import java.security.SecureRandom;
import java.util.*;

public class CouponNumbers {
	
	static void randomGenerator(int N) {
		SecureRandom r= new SecureRandom();
		int i=1;
		while(i<=N) {
			int Coupon=r.nextInt(N*N);
			System.out.println(Coupon);
			i++;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter The No. Of Coupon Numbers You Want::");
		Scanner S =new Scanner(System.in);
		int N=S.nextInt();
		randomGenerator(N);
	}
}
