package javabasics;

class Priv {
	private void PRINT() {
		System.out.println("Private access");
	}

	 void getPrint() {
		PRINT();
	}
}

public class PrivateAccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Priv priv = new Priv();
//		priv.PRINT();
		priv.getPrint();
	}
}
