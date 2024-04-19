package exceptionHandling;


public    class Throw_Throws_Keyword {

	
	/*
	 * throws basically declare an exception so here we declare that inside this
	 * methid which all exceptuion r thrown.
	 */
	
	public static void main(String[] args) throws NullPointerException, InterruptedException  {
		// TODO Auto-generated method stub
		
		
		//throw and new are the keyword
		
		Thread.sleep(2000);  //InterruptedException
		
		
		throw new NullPointerException();  //NullPointerException
		//Will give run time error
		
		//as one exception ke baad program ruk jayega so no need to write 2 throw statemnet 
		
		//if we write
	//	throw new ArithmeticException();--->error aayeag agr 2 exception dene k try kiya bt agr middle mai koi activity hogi tb 2 throw likh skte hai 
		//lekin ek sath 2 throw nhi likh skte 
		
		
		

	}

}
