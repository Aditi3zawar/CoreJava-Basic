package javabasics;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=3; i++) {
			System.out.println("Value of i:"+i);
			for(int j=1; j<=i; j++) {
			System.out.println("value of j:" +j);
			} 
		}

	}

}
