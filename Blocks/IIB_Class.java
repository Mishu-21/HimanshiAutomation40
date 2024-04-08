package grotechjava;

public class IIB_Class {
	//n executed in fcfs manner
	{   //IIbMethod
		System.out.println("IIB");
	}
	
	{
		System.out.println("IIB2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//as execution is line by line so jb ibject bnaya tb he call hoga iib
		IIB_Class I1=new IIB_Class();
     System.out.println("Mian method");
      
     new IIB_Class();
    IIB_Class I2=new IIB_Class();
       //create an object with or without reference variable to calll iib method  
	}

}
