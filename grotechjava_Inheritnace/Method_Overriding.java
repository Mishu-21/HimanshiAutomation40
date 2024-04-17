/*method overriding concept
 
only non static method*/

package grotechjava_Inheritnace;

class Parent_MethodOverRiding
{
	 void add()
	{
		System.out.println("Parent_MethodOverRiding");
	}
	}

public class Method_Overriding extends MethodOverriding_SuperKeyword {

	 void add()
	{
		System.out.println("Method_Overriding");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overriding m1=new Method_Overriding();
		m1.add();
		m1.add(); //always calling child method n suppresing parent method
		//so to overcome this problem we have super keyword concept
	}

}
