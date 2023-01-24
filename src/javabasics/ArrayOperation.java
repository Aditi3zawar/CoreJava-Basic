package javabasics;

import java.util.Arrays;

public class ArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,50,30,29,0};
		int b[]= {34,1,7,9,5,3};
		Arrays.sort(a);
		
		System.out.println("My sorted array is:");
		for (int i=0;i<5;i++)
		{
			System.out.println(a[i]);
			
			
		}
		
		System.out.println("Element found at position:"+Arrays.binarySearch(a, 2));
		System.out.println("Compare method:"+Arrays.compare(b, a));
	}

}
