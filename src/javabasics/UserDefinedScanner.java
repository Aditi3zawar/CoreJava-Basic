package javabasics;

import java.util.Scanner;

public class UserDefinedScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
//		System.out.println("Enter Your Age:");
//		int age=s.nextInt();
//		System.out.println("Enter Your Percentage:");
//		float per=s.nextFloat();
		System.out.println("Enter your name:");
		String a=s.nextLine();
//		System.out.println("My age is:"+age);
//		System.out.println("Percentage is:"+per);
		System.out.println("My name is:"+a);
	}

}
