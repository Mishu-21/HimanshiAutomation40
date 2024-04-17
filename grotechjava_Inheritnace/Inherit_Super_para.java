package grotechjava_Inheritnace;


class Mentors  //parents
{
	Mentors(int a)
	{
		System.out.println("Mentor constructor");
	}
}

public class Inherit_Super_para extends Mentors {
	
	Inherit_Super_para()
	{
		super(1);
		 //super calling statement  -->explicitly---para
		
	//as humne parent constructpr parameterised bnaya h isliyi ab super calling statement ko paramterised rkha h 
		System.out.println("child constructor");
	}
	
	public static void main(String[] args) {
		
		//how can we invoke Child constructor by creating an object
		Inherit_Super_para i2= new Inherit_Super_para();
		
	}

}
