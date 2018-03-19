package com.javamaven.example.JunitMaven;

public interface ICalculator {
	int sum (int a, int b);
	int sub (int a, int b);
	int mult (int a, int b);
	int div(int a, int b) throws Exception;
	boolean equalIntegers(int a, int b);

}
