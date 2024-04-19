/*case1--->defining different  methods with different access specifier within package 

we can access private ,protected,public and default methods within class  
*/

package Access_Specifier;

public class Case1_WithinClass1 {

  protected Case1_WithinClass1()   //protected constructor
	{
		System.out.println("protected constructor");
	}
  public Case1_WithinClass1(String a)   //public constructor
	{
		System.out.println("public constructor");
	}
  Case1_WithinClass1(double a)   //default/package constructor
	{
		System.out.println("default  constructor");
	}
  private Case1_WithinClass1(int a)  //private constructor
  {
	  System.out.println(" private constructor");
  }
  
  protected void NonStatic_ProtectedMethod()   //protected non static method 
  {
	  System.out.println(" protected non static method ");
  }
public void  NonStatic_PublicMethod()  //public non static method
{
	System.out.println(" public non static method ");
	}

  private void NonStatic_PrivateMethod()  //private non static method 
  {
	  System.out.println(" private non static method ");
  }
  
  void NonStatic_DefaultMethod()   //default/package non static method 
  {
	  System.out.println(" default/package non static method ");
  }
  
  
  protected static void Static_ProtectedMethod()   //protected  static method 
  {
	  System.out.println(" protected  static method ");
  }
  
  private static void Static_PrivateMethod()  //private  static method 
  {
	  System.out.println(" private  static method ");
  }
  private static void Static_PublicMethod()  //Public  static method 
  {
	  System.out.println(" Public  static method ");
  }
  static void Static_DefaultMethod()   //default/package  static method 
  {
	  System.out.println(" default/package  static method ");
  }
  
	public static void main(String[] args) {
		
		
		//now we r rying to access each one of them .
		System.out.println("++++++++++++++++++++++++++++++++++++++=Calling contructor wih diiferent access specifier++++++++++++++++++++++++++");
		Case1_WithinClass1 c=new Case1_WithinClass1();
		new Case1_WithinClass1(5);
		new Case1_WithinClass1(5.0);
		new Case1_WithinClass1("Manish");
		System.out.println("\n\n++++++++++++++++++++++++++++++++++++++=Calling Non static wih diiferent access specifier++++++++++++++++++++++++++");
        c.NonStatic_PublicMethod();
		c.NonStatic_ProtectedMethod();
		c.NonStatic_PrivateMethod();
		c.NonStatic_DefaultMethod();
		System.out.println("\n\n++++++++++++++++++++++++++++++++++++++=Calling static static wih diiferent access specifier++++++++++++++++++++++++++");

		Static_ProtectedMethod();
		Static_PrivateMethod();
		Static_DefaultMethod();
		Static_PublicMethod();
	}

}
