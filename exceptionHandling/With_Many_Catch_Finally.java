package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class With_Many_Catch_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * when input is 1--->try block o/p
		  input is 0 ---> o/p Arithmetc exception
		  input is manish--->o/p InputMismatchException
		 */
		try
		{
			Scanner s1=new Scanner(System.in);
			int c=1/s1.nextInt();
			System.out.println("Try block ");
		}
		catch(ArithmeticException a1)
		{
			System.out.println("I have handled Arithmetic Exception which occured in try block ");
		}
		
		catch(NullPointerException a2)
		{
			System.out.println("I have handled NullPointerException which occured in try block ");
		}
		
		catch(InputMismatchException a3)
		{
			System.out.println("I have handled InputMismatchException which occured in try block ");
		}
		
		catch(ArrayIndexOutOfBoundsException a4)
		{
			System.out.println("I have handled ArrayIndexOutOfBoundsExceptionwhich occured in try block ");
		}
		finally
		{
			System.out.println("Here we can have some common action no matter exception occured or not ");
		}
	}

}
