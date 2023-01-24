package javabasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MarksheetSwitchCase {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Percentage:");
		int per=Integer.parseInt(br.readLine());
		switch(per/10) {
		case 9:
			System.out.println("A Grade");
			break;
		case 8:
			System.out.println("B Grade");
			break;
		case 7:
			System.out.println("C Grade");
			break;
		case 6:
			System.out.println("D Grade");
			break;
		default:
			System.out.println("Fail");
			
		
		}
	}
}
