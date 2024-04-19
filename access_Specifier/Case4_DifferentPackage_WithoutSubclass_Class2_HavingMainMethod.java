/*case4--->

 defining main   methods in this class

 
*/



package Access_Specifier;

import access_speifier1.Case4_DifferentPackaage_Withoutsubclass_Class1HavingMethod;
/*when we r trying to access methids of different ackage need to import 
so use import pacagename.classname (whise methids we r importing )
*/

public class Case4_DifferentPackage_WithoutSubclass_Class2_HavingMainMethod {

	public static void main(String[] args) {

		//create an object of class 1 in class 2 if they dont have any relation and belong to different pokg
		
		Case4_DifferentPackaage_Withoutsubclass_Class1HavingMethod c4=new Case4_DifferentPackaage_Withoutsubclass_Class1HavingMethod("Himanshi"); //public constructor 

		//cant access another access specifier constructor
		
		c4.NonStatic_PublicMethod();
		Case4_DifferentPackaage_Withoutsubclass_Class1HavingMethod.Static_PublicMethod();
		
		//only public methids can be accessed
	}

}
