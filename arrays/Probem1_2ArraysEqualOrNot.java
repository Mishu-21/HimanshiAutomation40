//check given 2 arrays r equal or not
package arrays;

import java.util.Arrays;

public class Probem1_2ArraysEqualOrNot {

	public static void main(String[] args) {
	
		int[] a=new int[3];
		int[] b=new int[3];
		
		a[0]=12;
		a[1]=122;
		a[2]=120;
		b[0]=125;
		b[1]=122;
		b[2]=120;
		
		//array is a class
	System.out.println(	Arrays.equals(a, b));

	}

}
