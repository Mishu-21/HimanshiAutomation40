package TypeCasting;

class GrandParent
{
	void add()
	{
		
	}
}
class Parent extends GrandParent
{
	void sub()
	{
		
	}
}
public class Ctc_Upcasting_1 extends Parent  {

	void mul()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p1= new Ctc_Upcasting_1();
		
		/*
		 * so if we do upcaste we can also utilise the methods of those class whi are
		 * upper the class whose object is made which means here we can access both
		 * grandparent and parent class methid but not Ctc_Upcasting_1 methid
		 */
		
		p1.add();
		p1.sub();
		//p1.mul();  cant access Ctc_Upcasting_1() clas metods
	}

}

