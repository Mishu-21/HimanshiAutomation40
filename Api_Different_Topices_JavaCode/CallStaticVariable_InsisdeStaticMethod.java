package Api_Java_Topics;


class Test1  //class is non static but variabe inside this is static
{
	static String str="Helloiiii";	
}


public class CallStaticVariable_InsisdeStaticMethod {
	public static void main(String[] args) {
		
		
		/*
		 To Call static Variable insisde static method ie main method
	     	 className.variableName
		 */
		System.out.println(Test1.str);  
	}

}
