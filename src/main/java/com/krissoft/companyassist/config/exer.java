package com.krissoft.companyassist.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class exer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		polidrom();
	}

	public static void polidrom() {
		List a = new ArrayList<Integer>();
		try {
			int x = 0;
			boolean end = false;
			for (int i = 999; i > 100; i--) {
				for (int j = 999;  j > 100; j--) {
					x = i * j;
//					System.out.println("Initx = " + x);
					String x1 = Integer.toString(x);
					String x2 = new StringBuilder(x1).reverse().toString();
					
					if (x1.equals(x2)) {
						a.add(x);
					}
				}

			}

			System.out.println("x =" +  Collections.max(a));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fibonachi() {
		long array[] = new long[50];
		array[0] = 1;
		array[1] = 2;
		long finalSuml = 0l;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
			System.out.println(" array[i]= " + array[i]);
			if (isArrayFull(array)) {
				array[i] = 0;
				for (int j = 0; j < array.length; j++) {
					if (array[j] != 0) {
						if (array[j] % 2 == 0) {
							System.out.println(" array[j]= " + array[j]);
							finalSuml = finalSuml + array[j];
						}
					}
				}
				System.out.println("finalSuml= " + finalSuml);
				break;
			}
		}
		System.out.println("x= " + Arrays.toString(array));
	}

	public static boolean isArrayFull(long[] array) {
		boolean isFull = false;
		long fourMillions = 4000000l;
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] != 0) {
				if (array[i] > fourMillions) {
					return true;
				}

			}
		}
		return isFull;
	}

	public static void fibonachi2() {
		int array[] = new int[50];
		array[0] = 1;
		array[1] = 2;
		long finalSuml = 0l;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
			if (isArrayFull2(array)) {
				array[i] = 0;
				for (int j = 0; j < array.length; j++) {
					if (array[j] != 0) {
						if (array[j] % 2 == 0) {
							System.out.println(" array[j]= " + array[j]);
							finalSuml = finalSuml + array[j];
						}
					}
				}
				System.out.println("finalSuml= " + finalSuml);
				break;
			}
		}
		System.out.println("x= " + Arrays.toString(array));
	}

	public static boolean isArrayFull2(int[] array) {
		boolean isFull = false;
		double sum = 1l;
		double fourMillions = 4000000d;
		for (int i = 0; i < array.length - 1; i++) {
			sum = sum + array[i];
			System.out.println("sum= " + sum);
			if (sum >= fourMillions) {
				System.out.println("sumX= " + sum);
				return true;

			}
		}
		return isFull;
	}

	public void theBiggestPrimeFactor() {
		double number = 600851475143d;
		double sum = 1;
		for (int i = 2; i < number; i++) {
			double d = number / i;
			if (d % 1 == 0) {
				sum = sum * i;
				if (sum == number) {
					System.out.println("x= " + i);
				}
			}
		}
	}

	public void sum1() {
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0) {
				System.out.println("i1= " + i);
				sum = sum + i;
				continue;
			}
			if (i % 5 == 0) {
				sum = sum + i;
				System.out.println("i1= " + i);
			}
		}
		System.out.println("sum= " + sum);
	}

}
