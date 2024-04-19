package exceptionHandling;

public class Define_Concept{

	public static void main(String[] args) {
		
		/*
		 * int c=1/0; when tried to run got exception java.lang.ArithmeticException:
		
		jo bhi line exception degi woh try mai hogi so
		 catch block mai need to handle exception 
		 
		 sysntaxof catch
		catch(ExceptionName refvariable)
		{
		}
		
		 */
		
		
		
		//if exception  occur catch will exceute
		
		try
		{
			int c=1/0;
		}
		catch(ArithmeticException a1)
		{
			System.out.println("I have handled Arithmetic Exception which occured in try block ");
		}
	}

}
