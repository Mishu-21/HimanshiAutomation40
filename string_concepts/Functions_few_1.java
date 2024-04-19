/*String function covered are:



	1. length()
	2. charAt()
	3.toUpperCase()
	4.toLowerCase()
	5.indexOf()
	6.equals()
	*/


package string_concepts;

public class Functions_few_1 {
	
	public static void main(String[] args) 
	{
		String name="Himanshi";  //as soon as we declare the string we get all the functions of string
		
		//length()
		System.out.println("Length of string " + name.length());//return length of string   //return type int of length unction
		
		//toUpperCase()
		System.out.println("In uppercase "+ name.toUpperCase());  //return type string
		
		//toLowerCase()
		System.out.println("In Lowercase "+ name.toLowerCase());  //return type string
		
		
		//charAt(index)
		System.out.println("character at specific index "+ name.charAt(5)); //return char 
		//if index which we pass is greater the length what output we get 
	//	System.out.println("character at specific index "+ name.charAt(8));   //got excpetion StringIndexOutOfBoundsException
	
	 
		//indexOf(char)
		System.out.println("Index of specific character "+name.indexOf('s'));  //return int 
		System.out.println("if 2 char is repeating in the string,than index of 1st one will be returned "+name.indexOf('i'));
	   //if char is not present in the string 
		System.out.println("Index of specific character "+name.indexOf('d'));  //-1 output
		
		
		//equals()
		System.out.println("compare string "+ name.equals("himanshI")); //return type boolean
		
		
	}

}
