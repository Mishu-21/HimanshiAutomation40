package grotechjava;

public class Call_Constructor_InMianMethod {

	//Constructor name will be same as class name with no return type  and is non static
	
	public Call_Constructor_InMianMethod()
	{
		System.out.println("Calling constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constructor will we called once we create an object .
		//no need to call the method as we do for non-static
		
		//1st  way to create an object .
	//	Call_Constructor_InMianMethod c1= new Call_Constructor_InMianMethod(); // so when we create an object Constructor will invoke itself on its own
	//	c1.Call_Constructor_InMianMethod();// no need to do this for constructor calling 
		
		//2nd way to create an object
		new Call_Constructor_InMianMethod();  //but with this we don't get referenece variable as we get with the 1st method so this way we will not be able to call non static method
	    // this also call teh constructor bcoz for calling a constructor we don't need reference varibale
	}

}
