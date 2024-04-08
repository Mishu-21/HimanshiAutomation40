//Call static method in main method

package grotechjava;

public class Call_StaticMethod_InMainMethod {

	public static void add()
	{
		int c=20+10;
		System.out.println(c);
	}
	
	public static void main(String[] args)  {
		 
		System.out.println("animsa");
	
           // add(); if we dont call this then only main methiod println will be printed 
		add(); //when we will call this then only add method will be called
		
		/*do we have the freedom to call any method "N " number of time 
		Yes we can calll any nethod n no. of time 
		eg 
		add();
		add();
		add();
		this way we can call N no. of times  */
	}

}
