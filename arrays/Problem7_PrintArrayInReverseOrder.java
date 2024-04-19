//Print array in reverse order
package arrays;

import java.util.Arrays;

public class Problem7_PrintArrayInReverseOrder {

	static void ReverseArray()
	{
		int number[]=new int[4];
		int number1[]=new int[4];
		int k=number1.length-1;
				number[0]=1;
				number[1]=3;
				number[2]=6;
				number[3]=4;
				System.out.println("Original Array: "+Arrays.toString(number));
				for(int i=0;i<number.length;i++)
				{
				   number1[k]=number[i];	
				   k--;
				}
				System.out.println("Reverse Array: "+Arrays.toString(number1));
	}
	public static void main(String[] args) {
		int number1[]= {2,4,6,7};
		for(int i=number1.length-1;i>=0;i--)
		{
		  System.out.println(number1[i]);
	}
		ReverseArray();
}
}