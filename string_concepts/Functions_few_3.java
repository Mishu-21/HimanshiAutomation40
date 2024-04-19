/*String function covered are:




    1.isEmpty-->Check whether given string is empty or not 
	2.lastIndexOf(char)-->finds last index of a char
	3.equalsIgnoreCase(String anotherString): try to check is 2 string r equal or nit by ignoring the cases 
	4.repeat(int n)--> going to repeat a string n no.of time
	
	*/



package string_concepts;

public class Functions_few_3 {

	public static void main(String[] args) {
	
		String s="Himanshi chauhanZ";
		String name="";
		String n=" ";
		
		
		//isEmpty--->Return type boolean
		System.out.println(s.isEmpty());
		System.out.println(name.isEmpty());
		System.out.println(n.isEmpty());
		
		
		//lastIndexOf(char)--->return type int 
		System.out.println(s.lastIndexOf('Z'));
        System.out.println(s.lastIndexOf('A'));  //if char is not present in a string than -1 is returned 
        System.out.println(s.lastIndexOf('n'));  //as 'n' bhut saare hai humare pass lekin ye last index dega n ka 
        System.out.println(s.indexOf('n'));      //yeh 'n' jo first time string mai aa rha hoga uska index dega 
	
	
	     //equalsIgnoreCase(String anotherString)--->Return type boolean
        System.out.println(s.equalsIgnoreCase("HimaNshi Chauhanz"));
        System.out.println(s.equalsIgnoreCase("HimaNshiChauhanz"));
        
        //repeat(int n)-->return type String
      System.out.println(s.repeat(5));  
    
	
	
	
	}

}
