package grotechjava;

public class MethodOverloading {
	//Method Overloading
	void add()
	{
		System.out.println("1");
	}
	void add(int a)
	{
		System.out.println("2");
	}
	void add(double a,int b) //order of occurence of the argument is different in next n this method so valid 
	{
		System.out.println("3");
	}
	void add(int a,double b)
	{
		System.out.println(+a+ " " +b);
	}
	
  /* static void add()
	{}                                  Doubt: Error showing even though we have different method as one is static one is nonstatic and second return type is different
	static int add()
	{}  */
	
	/*
	 * 
	 * static void add(int a) { System.out.println("5"); }
	 * yeh kiya even though ek static hai ek non static still ives error 
	 * that means dono ke alg he parameter hone chahiye statiuc n non static se farak nhi pdhTA
	 */
	
	static void add(int a,String b)
	{ 
		System.out.println("5");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MethodOverloading m1 =new MethodOverloading();
       add(0,"Manish");  //5
       m1.add();
       m1.add(2);
       m1.add(1,0.0);
	}

}
