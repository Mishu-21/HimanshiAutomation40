//Trying to inherit constructor

package grotechjava_Inheritnace;

public class Inherit_Constructor_Child extends Mentor         ///child jo class name se file save hoti h vho ain() hota h 
{
	Inherit_Constructor_Child()
	{
	//	super();  //super calling statement  -->explicitly---Non para
		//nhi likha tb bhi bcz of implivit writr
		System.out.println("child constructor");
	}
	
	public static void main(String[] args) {
		
		//how can we invoke Child constructor by creating an object
		Inherit_Constructor_Child i1= new Inherit_Constructor_Child();
		
	}

}

class Mentor  //parent
{
	Mentor()
	{
		System.out.println("Mentor constructor");
	}
}


/*
 * humne run object bnaya child class ka lekin paremt class ka constructor bhi
 * invoke ho gaya why so?? this is happening bcz of "Super Calling Statement"
 */
		
