package exceptionHandling;

public class Define_Concept_With_1Catch{

	public static void main(String[] args) {
		
		//if exception doesnt occur try will exceute
		try
		{
			int c=1/1;
			System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("I have handled Arithmetic Exception which occured in try block ");
		}
	}
}
