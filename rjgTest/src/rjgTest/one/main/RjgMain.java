package rjgTest.one.main;

import java.util.Scanner;

import rjgTest.one.test.RjgCalculator;

public class RjgMain {

	public static void main(String[] args) {
		
		RjgCalculator rjgCalculator = new RjgCalculator();

		int tryNum = 2;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < tryNum; i++) {
			int inputNum = sc.nextInt();
			System.out.println(rjgCalculator.positiveIntegerCalculator(inputNum));
		}
		
	}

}
