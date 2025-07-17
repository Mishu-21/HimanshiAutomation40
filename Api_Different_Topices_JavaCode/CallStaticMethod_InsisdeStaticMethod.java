package Api_Java_Topics;

class Test5
{
	static void display()  //created static method
	{
		System.out.println("Hellossss");
	}
}

public class CallStaticMethod_InsisdeStaticMethod {
public static void main(String[] args) {
		
	/*
	 To Call static method inside static method ie inside  main method
	     	 className.methodName()
	 */
		Test5.display();   

	}
}
