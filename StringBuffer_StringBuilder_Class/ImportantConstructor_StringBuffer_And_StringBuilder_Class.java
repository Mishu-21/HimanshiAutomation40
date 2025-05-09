package StringBuffer_StringBuilder_Class;

public class ImportantConstructor_StringBuffer_And_StringBuilder_Class {

	
	public static void main(String[] args) {
		
		//No Need to import this as its coming from java.lang package so jo bhi jabva.lang se aate hai we dont import it
		
		// 1st way-->
		StringBuffer s1= new StringBuffer();  //Create an empty StringBuffer with Initial capacity of 16.
		
		//2nd way --->Syntax StringBuffer StringBuffer_Object= new StringBuffer(String str)
		StringBuffer s2= new StringBuffer("Automation Batch 40"); // Creates a StringBuffer with specified string 
		
		//3rd way ---> Syntax StringBuffer StringBuffer_Object= new StringBuffer(int capacity)
		StringBuffer s3= new StringBuffer(40); // Creates an empty StringBuffer with specified capacity as length
		
		
		//These constructor will be same for String Builder only in place of StringBuffer ,StringBuilder will be used  another than that description will remain same 
		StringBuilder s4= new StringBuilder();
		StringBuilder s5= new StringBuilder("Automation Batch 40");
		StringBuilder s6= new StringBuilder(89);
		
	}
}
