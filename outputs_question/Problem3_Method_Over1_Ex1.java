package outputs_question;

public class Problem3_Method_Over1_Ex1 {
	
	void add(int a)   //Method Overloading
	{

	System.out.println("Method 1");
	}

	void add(boolean b, char c)
	{

	System.out.println("Method 2");
	}

	void add(int a, String s) {

	System.out.println("Method 3");

	}

	static void add(boolean b) {

	System.out.println("Method 4");
	}
	
	Problem3_Method_Over1_Ex1(int a, char b) //cons overloading
	{ 
	System.out.println("Constr over 1");
	}
	Problem3_Method_Over1_Ex1(String s)
	{
	System.out.println("Const over 2");
	}
	

	public static void main(String[] args) {
		
		Problem3_Method_Over1_Ex1 m1= new Problem3_Method_Over1_Ex1(null);  //as parameter passed is of string typpe thats by const2 is prinited

		m1.add(10);
		add(true);

		m1.add(true, 'd');

		m1.add(45, "Gayatri");

		add(true);

		new Problem3_Method_Over1_Ex1(10, 'g');

		new Problem3_Method_Over1_Ex1("Gayatri");
	}

}
