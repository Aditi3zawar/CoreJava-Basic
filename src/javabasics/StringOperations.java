package javabasics;

import java.util.Arrays;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Aditi ";
		String t=new String("Zawar");
		String u=s+t;
		System.out.println("Concatinated string is:"+u);
		System.out.println("Length of string is:"+u.length());
		
		System.out.println("Uppercase:"+s.toUpperCase());
		String v="Java";
		char dist[]=new char[3];
		v.getChars(0,3,dist,0);
		System.out.println("Get Character:"+Arrays.toString(dist));
		System.out.println("Compare method:"+"java".compareToIgnoreCase(v));
		
		String w="";
		System.out.println("Check empty or null"+w.isEmpty());
		System.out.println("Check empty or null"+w.isBlank());
		
		System.out.println("charAt method:"+s.charAt(3));
		System.out.println("Start with method:"+s.startsWith("A"));
		System.out.println("End with method:"+s.endsWith("i"));
		
		String x="   Zawar   ";
		String y="   zawar   ";
		System.out.println("Trim function:"+x.trim());
		
		System.out.println("Strip leading:"+x.stripLeading());
		System.out.println("Strip trailing:"+x.stripTrailing());
		
		System.out.println("Repeat method:"+x.repeat(3));
		
		System.out.println("Equals:"+x.equalsIgnoreCase(y));
		
	}

}
