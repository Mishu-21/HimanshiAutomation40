//Check whether given 2 String is anagram or not 

package arrays;

import java.util.Arrays;

public class Problem3_StringAnagramOrNot {

	public static void main(String[] args) {


		//Step-1 Declare and initialise 2 string
		String s="lion";
		String s1="loin";
		
		//Step-2 Convert given string to char[]
	char[]c	=s.toCharArray();
	char[]c1	=s1.toCharArray();
	
	//print c n c1 array
	System.out.println(Arrays.toString(c));
	System.out.println(Arrays.toString(c1));
	
	
	//Step-3 Sort the char array
	Arrays.sort(c);
	System.out.println(c);
	Arrays.sort(c1);
	System.out.println(Arrays.toString(c1));
	
	
	//Step-4 Now check if both r equal or not 
	Boolean b =Arrays.equals(c, c1);  //equals ka return type h boolean
	if(b==true)
		System.out.println("anagram");
	else
		System.out.println("Not anagram");
	}

}

