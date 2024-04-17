//abstact method -->always non static n present with parent 

package Abstarct_Concrete_concept;


//any class which has abstract methid in it is abstract class
abstract  class google_Parent
{
	//method which have semicolon in it is abstarct method so write abstact 
   abstract	void login();
	abstract void registration();
	
	google_Parent(){
		System.out.println("constructor");
	}
}

/*
 * //yeh child class m de rha h error n say add unimplemented method public
 * class Abstract_Concrete extends google_Parent{
 * 
 * }
 */


//this way our overrideen concept is fullfilled 
//whuich methid i will show to client or 3rd party ---> Parent methiod 
public class Abstract_Concrete extends google_Parent
{
	

	@Override
	//
	void login() {
		System.out.println("login logic");
		
	}

	@Override
	void registration() {
		
		System.out.println("registration method");
	}
	
public static void main(String[] args) {
	Abstract_Concrete a1=new Abstract_Concrete();
	a1.login();
	a1.registration();
	}
}
