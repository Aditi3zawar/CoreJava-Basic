package javabasics;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int i=sc.nextInt();
		int onum=i;
		int rev=0;
		while(i!=0)
		{
			int num=i%10;
			rev=rev*10+num;
			i=i/10;
	
		}
		if(onum==rev) 
		{
			System.out.println("Number is Pallindrome");
		}
		else
		{
			System.out.println("Number is not Pallindrome");
		}
	}

}
