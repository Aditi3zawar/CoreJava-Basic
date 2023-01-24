package javabasics;

public class MissingElemInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
//		take default input array
		int[] numbers=new int[] {
				1,
				2,
				3,
				4,
				5,
				6,
				7
		};
//		last element
		n=7;
//		sum of elements till last value
		int expected_sum=n*((n+1)/2);
		int sum=0;
		
		for(int i:numbers)
		{
			sum +=i;
		}
//		obtain missing elements
		int m=expected_sum-sum;
		System.out.println("Missing element is:"+m);
	}

}
