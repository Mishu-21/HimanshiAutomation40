package grotechjava_Inheritnace;


//// as parameterised constructor hai explicilty write ki h supercalling statemnet 
class GrandParents_Classes
{
	GrandParents_Classes()
	{
		System.out.println("3");
	}
}

class Parents_Classes extends GrandParents_Classes
{
	Parents_Classes(int a,double b)
	{
		this();
		System.out.println("2");
	}

	public Parents_Classes() {
		// TODO Auto-generated constructor stub
	}

}

class child_classes extends Parents_Classes
{
	child_classes()
	{
		super(0, 0.0); //as parent constructor parameterised tha isliyi humne explicitly call kiya
		System.out.println("1");
	}
}
public class Super_calling_Statment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new child_classes();

	}

}
