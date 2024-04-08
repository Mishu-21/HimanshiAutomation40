package grotechjava;

public class ClassCombination_Static_NonStatic_Constructor {
	
	public static void StaticMethod() //Creating StaticMethod
	{
		System.out.println("Calling Static Method");
	}
    
	public void NonStaticMethod()  //Creating NonStaticMethod
    {
		System.out.println("Calling NonStatic Method");

    }
    public ClassCombination_Static_NonStatic_Constructor() //Creating Constructor
    {
		System.out.println("Calling Constructor");

	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StaticMethod();  //calling static method
       
        //calling non static as well as constructor 
        //1 constructor will be called and when nonstatic methiod will be called than it is called method 
       ClassCombination_Static_NonStatic_Constructor c1= new ClassCombination_Static_NonStatic_Constructor();
       c1.NonStaticMethod();
       
       /*  this line output will be 
       1st constructor method 
       then non static because phle object bnaya so constructor invoke ho gaya
       n then jb call kiya reference variable ke through tb humara nonstatic method call hua   */ 
       
       //Another way of calling Constructor
       new ClassCombination_Static_NonStatic_Constructor();
	}

}
