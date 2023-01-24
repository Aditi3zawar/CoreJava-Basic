package javabasics;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[][] arr=new int[10][10];
		System.out.println("Enter elements in array:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements in array are:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
		}
//		System.out.println("Addition");
//		System.out.println("Subtraction");
//		while(true)
//		{
//			System.out.println("Enter your choice:");
//			int ch=sc.nextInt();
//			switch(ch) {
//			
//			}
//		}
	}
	

}

