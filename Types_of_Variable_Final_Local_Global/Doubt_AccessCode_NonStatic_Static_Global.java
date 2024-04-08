package grotechjava;

public class Doubt_AccessCode_NonStatic_Static_Global {
	
	
	//Create static global variable with n without initialisation
	static int i;
	static int in=10;
	
	//Create nonstatic global variable with n without initialisation
	
	short s;
	short sh=12;
	
	void add()
	{
		System.out.println("Access static Global variable in nonstatic method");
		System.out.println(i);
		System.out.println(in);
		
		System.out.println("Access NOnstatic Global variable in nonstatic method");
		System.out.println(s);
		System.out.println(sh);
	}
	
	void mult()
	{
		add(); //nonstatic -non satic call it directly
	}
	
	static void sub()
	{
		// error add() like thuis if decalred as sub is static n add is nonstatic;
		
		Doubt_AccessCode_NonStatic_Static_Global d2=new Doubt_AccessCode_NonStatic_Static_Global();
		System.out.println("Access static Global variable in nonstatic method");
		System.out.println(i);
		System.out.println(in);
		d2.add();
		System.out.println("Access NOnstatic Global variable in nonstatic method");
		System.out.println(d2.s);
		System.out.println(d2.sh);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To Access Nonstatic method create object with reference variable
		Doubt_AccessCode_NonStatic_Static_Global d1=new Doubt_AccessCode_NonStatic_Static_Global();
     d1.add();
     sub();
     d1.mult();
  
	}

}
