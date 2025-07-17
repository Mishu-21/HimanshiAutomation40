package Api_Java_Topics;
class V3
{
	String colour="red";
	
}

class V5 extends V3
{
	String colour="black";
	void display()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}
}
public class SuperKeyword {
public static void main(String[] args) {
		
		V5 obj=new V5();
		obj.display();
		

	}
}
