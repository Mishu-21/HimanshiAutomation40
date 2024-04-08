package grotechjava;

public class SIB_Class {
	
	//Decalre SIB ie static initilisation block n can have multiple SIB block 
	//and will executed in fcfs manner 
	static 
	{
		System.out.println("SIB");
	}
	static
	{
		System.out.println("SIB1");
	}

	public static void main(String[] args) {  //main method
		// TODO Auto-generated method stub
          System.out.println("Main Method");
	}

}

//If both SIB n Mian method JVM will execute SIB first n than JVM
