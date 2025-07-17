package Api_Java_Topics;

public class staticBlock_calledFirstIfWeHaveBothStaticBlockAndMainMethod{
	
	/*
	 If we have both main method and static block toh execution will start from static block 
	 */
	static
	{
		System.out.println("Hi");
	}
	

	public static void main(String[] args) {
		
		System.out.println("Hellooooooooo");

	}
}
