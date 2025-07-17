package Api_Java_Topics;


class Test2
{
	 void display()  //created static method
	{
		System.out.println("Hellozzzz");
	}
}

public class CallNonStaticMethod_InsisdeStaticMethod {

	public static void main(String[] args) {
		
		/*
		 To Call nonstatic method inside static method ie inside  main method
		 create a object of class and than objectofClass.NonStaticMethodName()
		     	 className.methodName()
		 */
		
		
		Test2 obj=new Test2();
		obj.display();
	}
}
