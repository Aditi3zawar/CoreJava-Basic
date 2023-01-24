package javabasics;

public class StarPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
	    for (int i = 0; i < size; i++) {
	      // print spaces
	      for (int j = 1; j < size - i; j++) {
	        System.out.print(" ");
	      }
	      // print stars
	      for (int k = 0; k <= i; k++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }

	}

}

//Output
//    *
//   **
// ****
//*****