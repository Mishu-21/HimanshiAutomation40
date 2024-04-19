/*Sort the given array 
sort() methid is used to sort the given array from ower to higher manner */ 

package arrays;

import java.util.Arrays;

public class Problem2_SortArray {
	
	
	public static void main(String[] args) {
		
		int[] a=new int[3];
		
		a[0]=1221;
		a[1]=122;
		a[2]=120;
		System.out.println(Arrays.toString(a));  
		
		Arrays.sort(a); //sort finction is used to sort the given array
		
		System.out.println(Arrays.toString(a));  
	}
	
	

}
