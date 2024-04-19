/*String function covered are:

    
    1.toCharArray();-->converts this String to a new character array
    
    Arryas.toString(object)-->use to print array values in array form without using for loop
 */


package string_concepts;

import java.util.Arrays;

public class Functions_few_4_MainFunction {

	
	public static void main(String[] args) {
		
		
		//toCharArray()-->Return type char[](char array) 
		
		//First need to understand array concept
		int[] age=new int[3];
		age[0]=2;
		age[1]=7;
		
		double s[]=new double[2];
		String s1[]=new String[2];
		
		
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]); 
		
		/*
		 * if we dont initialise value than default value is printed of a given datatyeo
		 * as at age[2] --<0 output as it gives int default value
		 */
		
System.out.println(s[0]);  //o/p-> 0.0
System.out.println(s1[0]); //o/p-> null



//System.out.println(s1[4]);
//agr out of index print krne ka try kiya so i give ArrayIndexOutOfBoundsException 


//but aise print krne ki jgha for loop jyada better hai 
	

int[] age1=new int[3];

age1[0]=21;
age1[1]=72;


for(int i=0;i<3;i++)
{
	System.out.println(age1[i]);
	}
	

//agr humko forloop se nhi print krna toh we van one more class in java known as Arryas.toString(object)
	

//Arryas.toString(object)--->String[]
System.out.println(Arrays.toString(age1));
//iska out jo aata h uss jaisa he humara array dikhta h 


//toCharArray()-->Return type char[]
String st="Himanshi";
     char[] c=st.toCharArray();   //String ko humne char[] mai convert kiya so ab c object ke pass char[] type mai value store hai 
     
     System.out.println(c[1]);  //i
     System.out.println(Arrays.toString(c));

     
     //Print the given string array in arrray form 
     //so use Arrays class
     String value[]=new String[4];
     value[0]="Ram";
     value[1]="Ramesh";
     value[2]="Rama";
     value[3]="sham";
     System.out.println(Arrays.toString(value));
	
	
	}

}
