package javabasics;

import java.util.Scanner;

public class PrintElementUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter elements in array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();	
		}
		System.out.println("Elements in array are:");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}
