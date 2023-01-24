package javabasics;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your percentage:");
		float per=s.nextFloat();
		if(per>= 60) {
			System.out.println("You passed with first grade.");
			} else if(per >=45 || per < 60) {
			System.out.println("You passed with second grade.");
			} else if(per >=33 || per < 45) {
			System.out.println("You passed with third grade.");
			} else {
			System.out.println("Sorry, you are fail.");
			}

		
				
	}

}
