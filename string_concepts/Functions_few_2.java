/*String function covered are:




	1. contains()
	2. substring
	       -->substring(initial value)
	       -->substring(initial index,last index)
	3.concat()
	4.trim()
	*/



package string_concepts;

public class Functions_few_2 {
	
	public static void main(String[] args) {
		
		String s="Himanshi Chauhan";
		String a="I am Student";
		
		
		//contains()
		System.out.println("Checked does it contained in a giben string or not: "+ s.contains("shi C"));   //Return type:Boolean


		//Substring
		//-->substring(initial index)
		System.out.println(a.substring(5));  //String return type
		//-->substring(initial index,last index)  //middle se ki substring chahiye ho string se so use this 
		System.out.println(a.substring(2,4));   //String return type
		
		
		//concat():combine 2 string
		System.out.println(a.concat( s));  //Return type String
		
		
		//trim():remive extra space from front and end of the string 
		String name="    I am Himanshi     ";
		System.out.println(name); //without trim space bhi print hogi 
		System.out.println(name.trim());  //Return type : String
		
			}

}
