/*case2--->defining main   methods in this class

and we can access class 1 by creating an object of class 1 in class 2
but private methid cannot be accessed
*/

package Access_Specifier;

public class Case2_WithinPackage_class2HavingMainMethod {

	public static void main(String[] args) {
		
		Case2_WithinPackage_class1HavingMethod c1= new Case2_WithinPackage_class1HavingMethod(); //protected constructor will be called
		
		/*
		 * // new Case2_WithinPackage_class1HavingMethod(5); as this methodis private so
		 * we cant access it e error shows Exception in thread "main" java.lang.Error:
		 * Unresolved compilation problem: The constructor
		 * Case2_WithinPackage_class1HavingMethod(int) is not visible
		 * 
		 * at Access_Specifier.Case2_WithinPackage_class2HavingMainMethod.main(
		 * Case2_WithinPackage_class2HavingMainMethod.java:14)
		 */
		
		new Case2_WithinPackage_class1HavingMethod("Himanshi");  //public constructor will be called
		new Case2_WithinPackage_class1HavingMethod('a');  //default constructor will be called
		
		//when we do c1. so humko priavte methid wala option show he nhi hoga 
	//	c1.NonStatic_PrivateMethod(); give same error as above 
		
		c1.NonStatic_DefaultMethod();
		c1.NonStatic_ProtectedMethod();
		c1.NonStatic_PublicMethod();
		
		
		
		
		
		/*
		 to access static methods into another class syntax is: classname.methodname
		 */
		
		
		
		
		Case2_WithinPackage_class1HavingMethod.Static_ProtectedMethods();

		Case2_WithinPackage_class1HavingMethod.Static_DefaultMethod();
		Case2_WithinPackage_class1HavingMethod.Static_PublicMethod();

		
		/*
		 * If we try to access this way Static_DefaultMethod(); Static_PublicMethod();
		 * Static_ProtectedMethods();
		 * 
		 * error we got:
		 *  The method Static_DefaultMethod() is undefined for the type Case2_WithinPackage_class2HavingMainMethod
		  as it is seraching the mthod in this class
		 */
	}

}
