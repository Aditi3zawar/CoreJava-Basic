package javabasics;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<5) {
			if(i==2) {
				break;
			}
			System.out.println(i++);
		}
	}

}
