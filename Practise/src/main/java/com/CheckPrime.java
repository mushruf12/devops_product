package com;

public class CheckPrime {
	 public Boolean prime(int a) {
			int i=2;
			for(i=2;i<a;i++) {
				if(a%i==0) {
					return false;
				}
			}
			return true;
	 }
		
	 }





