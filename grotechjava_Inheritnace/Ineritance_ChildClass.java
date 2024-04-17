package grotechjava_Inheritnace;

/* Methods that can inherit is 
   static n non static method
   constructor cant be inherited in java*/

class Inheritance_ParentClass
{
	static void parent()
	{
		System.out.println("Parent method");
	}
}

public class Ineritance_ChildClass extends Inheritance_ParentClass
{
	static void child()
	{
		System.out.println("child method");
	}
 
	public static void main(String[] args) {
 
		child();
		parent();  //as inheritimg so child is also able to inherit parent methid herefire we can call it

	}

}
