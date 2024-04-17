package grotechjava_Inheritnace;


class MethodOverridings
{
   final	void add()
	{
		System.out.println("Parent_MethodOverRiding");
	}
	}

public class Method_Overriding_final extends MethodOverridings {

	// void add() gives cte so saying jao apna naam change kro
	void asub()
	{
		System.out.println("Method_Overriding");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overriding_final m1=new Method_Overriding_final();
		m1.add();
	}
}

