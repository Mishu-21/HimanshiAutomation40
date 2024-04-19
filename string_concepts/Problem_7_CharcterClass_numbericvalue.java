/*in a given string cgheck which us numeric value
Character class--->only used when we need to perform anything on given particular character

*/

package string_concepts;

import java.util.Arrays;

public class Problem_7_CharcterClass_numbericvalue {

	 public static void main(String[] args) {
		
		 String name="Man5ish1";
		char[] c = name.toCharArray();
		
		System.out.println(Arrays.toString(c));
		
		//charcatee class use karo 
		for(int i=0;i<c.length;i++)
		{
			Boolean b= Character.isDigit(c[i]);  //this will check ki array mai digit hai ya nhi and hue toh character class return boolean value 
			if(b==true)
			{
				System.out.println("Numberic value is presnet at index " +i +"and value is" +c[i]);
			}
		}
		
	}
}
