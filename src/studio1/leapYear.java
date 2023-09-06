package studio1;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		
		boolean isLeapYear = false;
		Scanner in = new Scanner(System.in);
		System.out.println("What is your year?");
		int year = in.nextInt(); 
		isLeapYear = (year%4) == 0 & (year%100) != 0 | (year%400) == 0; 
		System.out.print(isLeapYear);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
