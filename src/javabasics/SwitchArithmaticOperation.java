package javabasics;

import java.util.Scanner;

public class SwitchArithmaticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st num:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd num:");
		int b=sc.nextInt();	
		while(true) {
		System.out.println("+)Addition");
		System.out.println("-)Subtraction");
		System.out.println("*)Multiplication");
		System.out.println("/)Division");
		System.out.println("%)Modulus");
		System.out.println("0)Exit");
		
		
		System.out.println("Enter your choice:");
		char op=sc.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println("Addition of "+a+" and "+b+" is:"+(a+b));
			break;
		case '-':
			System.out.println("Subtraction of "+a+" and "+b+" is:"+(a-b));
			break;
		case '*':
			System.out.println("Multiplication of "+a+" and "+b+" is:"+(a*b));
			break;
		case '/':
			System.out.println("Division of "+a+" and "+b+" is:"+(a/b));
			break;
		case '%':
			System.out.println("Modulus of "+a+" and "+b+" is:"+(a%b));
			break;
		case '0':
			System.exit(0);
			break;
		default:
			System.out.println("Choice is wrong");
		
		}
		}
	}

}
