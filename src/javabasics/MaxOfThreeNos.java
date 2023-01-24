package javabasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxOfThreeNos {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter the number:");
		int b=Integer.parseInt(br.readLine());
		System.out.println("Enter the number:");
		int c=Integer.parseInt(br.readLine());
		if (a>b && a>c) {
			System.out.println("A is max");
			}
		else if (b>c && b>a){
			System.out.println("B is max");
		}
		else{
			System.out.println("C is max");
			
		}
	}

}
