package Abstarct_Concrete_concept;

//ac with 0 am 
abstract class AbstactClass

{
	public void add()
	{
		System.out.println("add");
	}
	
	static void sub()
	{
		System.out.println("sub");
	}
	
	}
public class AbstactClass_NoAbstarctMethid extends  AbstactClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstactClass_NoAbstarctMethid a=new AbstactClass_NoAbstarctMethid();
		
     sub();
     a.add();
		
	}

}
