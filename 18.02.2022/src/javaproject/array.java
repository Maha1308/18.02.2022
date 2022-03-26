package javaproject;

public class array {

	public static void main(String[] args) {
		
		int[] array = {3,2,5,6,7,8,9,2};
		System.out.println(getSum(array));
		
	}
	public static int getSum(int[]arr)
	{
		int sum=0;
		for(int a:arr)
		
	       sum += a;
		
		return sum;
		

	}

}
