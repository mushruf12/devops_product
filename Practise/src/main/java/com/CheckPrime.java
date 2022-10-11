package com;

public class CheckPrime {
	 public Boolean prime(int a) {
			int i=2;
			if(i<0 || i==1) {
				System.out.println("Enter number Greater than one");
				return false;
			}
			for(i=2;i<a;i++) {
				if(a%i==0) {
					return false;
				}
			}
			return true;
	 }
		
	 }





