package com.javamaven.example.JunitMaven;

public class Calculator implements ICalculator {
	
	public int sum(int a, int b) {
		 return a + b;
	}
	
	public int sub(int a, int b) {
		 return a - b;
	}
	
	 public int mult(int a, int b) {
	         return a * b;
	}
	 
	 public int div(int a, int b) throws Exception {
		 if (b == 0) {
			 throw new Exception("Divider can't be zero");
	     }
	  return a / b;
	 }
	 
	 public boolean equalIntegers(int a, int b) {
		 boolean result = false;
	     	if (a == b) {
	     		result = true;
	        }
	     return result;
	 }
}
