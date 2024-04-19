/*case2--->defining different  methods in this class

we can access  ,protected,public and default methods within package
private method cannot be accessed. 
*/


package Access_Specifier;

public class Case2_WithinPackage_class1HavingMethod {

	protected Case2_WithinPackage_class1HavingMethod()   //protected constructor
	{
		System.out.println("protected constructor");
	}
  private Case2_WithinPackage_class1HavingMethod(int a)  //private constructor
  {
	  System.out.println(" private constructor");
  }
  
  public Case2_WithinPackage_class1HavingMethod(String a)  //public constructor
  {
	  System.out.println(" public constructor");
  }
  
   Case2_WithinPackage_class1HavingMethod(char a)  //default constructor
  {
	  System.out.println(" default constructor");
  }
  
  protected void NonStatic_ProtectedMethod()   //protected non static method 
  {
	  System.out.println(" protected non static method ");
  }
  
  private void NonStatic_PrivateMethod()  //private non static method 
  {
	  System.out.println(" private non static method ");
  }
  
  void NonStatic_DefaultMethod()   //default/package non static method 
  {
	  System.out.println(" default/package non static method ");
  }
  
  public void NonStatic_PublicMethod()   //Public non static method 
  {
	  System.out.println(" Public non static method ");
  }
  protected static void Static_ProtectedMethods()   //protected  static method 
  {
	  System.out.println(" protected  static method ");
  }
  
  private static void Static_PrivateMethod_1()  //private  static method 
  {
	  System.out.println(" private  static method ");
  }
  
  static void Static_DefaultMethod()   //default/package  static method 
  {
	  System.out.println(" default/package  static method ");
  }
  
  public static  void Static_PublicMethod()   //Public  static method 
  {
	  System.out.println(" Public  static method ");
  }
  

	}


