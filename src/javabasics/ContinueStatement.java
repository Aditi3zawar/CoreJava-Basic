package javabasics;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<5) {
			if(i==2) {
				i++;
				continue;
			}
			System.out.println(i++);
		}
	}

}
