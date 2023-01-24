package javabasics;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value:");
		int a=sc.nextInt();
		int f1=0;
		int f2=1;
		System.out.print(f1+" "+f2+" ");
		for(int i=a;i>0;i--) {
			int temp=f1+f2;
			f1=f2;
			f2=temp;
			System.out.print(temp+" ");
		}
	}

}
