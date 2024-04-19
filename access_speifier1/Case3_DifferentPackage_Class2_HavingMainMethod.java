/*case3--->

 defining main   methods in this class

 
*/




package access_speifier1;

import Access_Specifier.Case3_DifferentPackage_Class1_HavingMethod;

/*when we r trying to access methids of different ackage need to import 
so use import pacagename.classname (whise methids we r importing )
*/
public class Case3_DifferentPackage_Class2_HavingMainMethod extends Case3_DifferentPackage_Class1_HavingMethod {

	public static void main(String[] args) {
		
		/*
		 * to access class 1 methid need to create an object of class2 iie child class
		 * as bith my class has the relation
		 */
		
		
		Case3_DifferentPackage_Class2_HavingMainMethod c3= new Case3_DifferentPackage_Class2_HavingMainMethod();
		//call protected constructor
		
		/*
		 * when trying to access private and default constructor we are not able to
		 
		new Case3_DifferentPackage_Class1_HavingMethod(5);  //private constructor
		new Case3_DifferentPackage_Class1_HavingMethod('a');  //default constructor
		*/
		new Case3_DifferentPackage_Class1_HavingMethod("Himanshi");
		
		/*
		 * when trying to access private and default non static  we are not able to
		 
		c3.NonStatic_PrivateMethod();
		c3.NonStatic_DefaultMethod();
		*/
		
		
		//can access non static pritected and public methid 
		c3.NonStatic_ProtectedMethod();
		c3.NonStatic_PublicMethod();
		
		
		
		//can access static pritected and public methid 
		Case3_DifferentPackage_Class1_HavingMethod.Static_ProtectedMethods();
		Case3_DifferentPackage_Class1_HavingMethod.Static_PublicMethod();
		
	}
}
