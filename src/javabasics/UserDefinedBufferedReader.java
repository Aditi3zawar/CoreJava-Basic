package javabasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserDefinedBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name:");
		String name=br.readLine();
		System.out.println("Name is:"+name);
		System.out.println("Enter your age:");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Age is:"+age);
		
		
	}

}
