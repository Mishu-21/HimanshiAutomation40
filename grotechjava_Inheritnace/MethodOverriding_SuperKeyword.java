package grotechjava_Inheritnace;



class Parents_MethodOverRiding
{
	void add()
	{
		System.out.println("Parent_MethodOverRiding");
	}
	}

public class MethodOverriding_SuperKeyword extends Parents_MethodOverRiding {

	void add()
	{
		//super.add();
		System.out.println("MethodOverriding_SuperKeyword");
		super.add(); //can write here also ---> means any line
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding_SuperKeyword m1=new MethodOverriding_SuperKeyword();
		m1.add();
		
	}
}
		

