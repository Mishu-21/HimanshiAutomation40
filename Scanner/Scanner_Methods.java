package grotechjava;

import java.util.Scanner;

public class Scanner_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		
		//To input various values we have various methods n all methids have some return type so need to store in some variables 
		  int first =s1.nextInt(); //nextint() will allow us to enter int value having return type as int therefore stored in int variable type 
		   //n here first variable is local variable 
		  System.out.println("Print NextInt Value having returntype as int-->"+first);  //Iput--> 7   Output-->7
		  
		  //similarly declared different methods
		    
		  boolean b=s1.nextBoolean();
		  System.out.println("Print NextBoolean Value having returntype as Boolean-->" +b);   //Iput-->false   Output-->false
		  
		  short s=s1.nextShort();
		  System.out.println("Print NextShort Value having returntype as Short-->" +s); //Iput--> 7   Output-->7
		  
		  long l=s1.nextLong();
		  System.out.println("Print NextLong Value having returntype as Long-->" +l); //Iput--> 7   Output-->7
		  
		  byte by=s1.nextByte();  //cant enter 200 value as iski limit -128 to 127 tk hoti h 
		  
		  System.out.println("Print NextByte Value having returntype as Byte-->" +by); //Iput--> 7   Output-->7
		  
		  float f=s1.nextFloat();
		  System.out.println("Print Nextfloat Value having returntype as float-->" +f); //Iput--> 7   Output-->7.0
		  
		  double d=s1.nextDouble();
		  System.out.println("Print NextDouble Value having returntype as Double-->" +d); //Iput--> 7   Output-->7.0
		  
		  String st=s1.next();
		  System.out.println("Print NextString Value having returntype as String-->" +st); //Iput-->himanshi   Output-->himanshi
		  
		  //as system.in is waiting for human input so after that we can close it
		  s1.close();  //closing it  if not do this then hover krke note mil skta h as 
		  //Resource leak s1 is never closed
	}

}
