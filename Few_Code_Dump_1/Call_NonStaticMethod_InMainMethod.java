package grotechjava;

public class Call_NonStaticMethod_InMainMethod {
	
  public 	void add()  //creating non static method as humne koi modifier nhi likha so bydefault it will be non-static 
	{
		System.out.println("Calling nonstatic method add");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Call_NonStaticMethod_InMainMethod s1 =new Call_NonStaticMethod_InMainMethod();  // creating an object with its reference variable
		s1.add();  //calling a nonstatic method using reference variable/object    //can create in small or large
	}

}
