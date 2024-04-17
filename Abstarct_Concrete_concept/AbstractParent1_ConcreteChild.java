package Abstarct_Concrete_concept;

abstract class Abstarct_Class
{
	//these are AM which can be overridden---> only nin static
	abstract public void mul();
	abstract public void div();
	
	//cc method-->both static n non static 
	//static not overriden 
	//static overridden
	
	void add()  //concrete non static method 1
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	static void sub() //concrete  static method 2
	{
		System.out.println(Math.subtractExact(10, 20));  //math class
	}
}

/*
 * looking above class how many methods we can override it---> 3 method 1. both
 * AM 2. 1 concrete nion static methid
 */

public class AbstractParent1_ConcreteChild extends Abstarct_Class {

	//child class--> 1 concrete method 
	public void rem()
	{
		System.out.println(Math.floorMod(12, 4)); 
	}

	

	@Override
	public void mul() {
		System.out.println(Math.multiplyExact(12, 2)); 
		
	}

	@Override
	public void div() {
		System.out.println(Math.floorDiv(12, 4)); 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractParent1_ConcreteChild a2=new AbstractParent1_ConcreteChild();
		a2.add();
		sub();
		a2.mul();
		a2.div();
		a2.rem();
	}

}
