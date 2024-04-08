package grotechjava;

public class StaticGlobalVariable_Default_WithValue {

	//Doubt kya yeh koi local static method ke sath bhi higa kya??Try 
	
	//Decalre all datatype as Static Global variable n access it in main method n see its default value
	static int age;  
	static String name; 
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean bo;
	
	static byte by=5;
	static short sh=89;
	static int in=67;
	static long lo=90;
	static float fl=90.9f;
	static double dou=9076;   //as it is double so output is 9076.0
	static char ch='a';
	static boolean bol=true;
	static String st="Himanshi";
	
	
	/* Doubt Kya non-static variable ko bhi humne aise he kr ste h call 
		int a;
		String name1; //error dega doubt ---compilation issue as done in line 45 if we call like this 
  as it nonstatic gloabl variabke and if want to access in static main 
	so access in same way  as u access non static method ie by reference variable for all data types
	*/
	
	public static void main(String[] args) {
		
		
	//Print Static gloabl variables defaukt value
		System.out.println("Static Gloabal variable datatype default value");
     System.out.println(age); 
     System.out.println(name);
     System.out.println(b);
     System.out.println(s);
     System.out.println(i);
     System.out.println(l);
     System.out.println(f);
     System.out.println(d);
     System.out.println(c);
     System.out.println(bo);
     
   //Print Static gloabl variables with some value
     System.out.println("Static Gloabal variable datatype with some value");
     System.out.println(by);
     System.out.println(sh);
     System.out.println(in);
     System.out.println(lo);
     System.out.println(fl);
     System.out.println(dou);
     System.out.println(ch);
     System.out.println(bol);
     System.out.println(st);
   
     /*
      Can't access this way as yeh nonstatic variable hai 
      so to access them we can do it by reference variable  
     System.out.println(name1);  error
    System.out.println(a);//Error
    NonStaticGlobalVariable_Default_WithValue  see this code
    
   */
	}

}
