package grotechjava;

public class UpdateValue_Static_NonStatic_GlobalVariable {
	
	int i=10;  //Non-static Global Variable
	static  int in=19;   //static Global Variable
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	System.out.println(i); cant print in this way as i is nonstatic gloable variable---->create object with reference variable
		UpdateValue_Static_NonStatic_GlobalVariable u1= new UpdateValue_Static_NonStatic_GlobalVariable();
		System.out.println(u1.i);
		System.out.println(in);
		u1.i=90;  //update nonsttic gloable varibale with help of regerence variable
		in=100;  //update sttic gloable varibale
		System.out.println("After updating value");
		System.out.println(u1.i);
		System.out.println(in);
	}

}
