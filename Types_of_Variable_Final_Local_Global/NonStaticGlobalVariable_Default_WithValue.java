package grotechjava;

public class NonStaticGlobalVariable_Default_WithValue {
	
	//To Access non-static variable  inside static variable do access in the smae fashion how we accessed the non static method ie by creating an object with its referenec variable

	//Decalre all datatype as NonStatic Global variable n access it in static main method n see its default value
		 int age;  
		 String name; 
		 byte b;
		 short s;
		 int i;
		 long l;
		 float f;
		 double d;
		 char c;
		 boolean bo;
		
		 byte by=5;
		 short sh=89;
		 int in=67;
		 long lo=90;
		 float fl=90.9f;
		 double dou=9076;   //as it is double so output is 9076.0
		 char ch='a';
		 boolean bol=true;
		 String st="Himanshi";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticGlobalVariable_Default_WithValue n1= new NonStaticGlobalVariable_Default_WithValue();
		
		//Print nonStatic gloabl variables defaukt value
				System.out.println("nonStatic Gloabal variable datatype default value");
		     System.out.println(n1.age); 
		     System.out.println(n1.name);
		     System.out.println(n1.b);
		     System.out.println(n1.s);
		     System.out.println(n1.i);
		     System.out.println(n1.l);
		     System.out.println(n1.f);
		     System.out.println(n1.d);
		     System.out.println(n1.c);
		     System.out.println(n1.bo);
		     
		   //Print nonStatic gloabl variables with some value
		     System.out.println("nonStatic Gloabal variable datatype with some value");
		     System.out.println(n1.by);
		     System.out.println(n1.sh);
		     System.out.println(n1.in);
		     System.out.println(n1.lo);
		     System.out.println(n1.fl);
		     System.out.println(n1.dou);
		     System.out.println(n1.ch);
		     System.out.println(n1.bol);
		     System.out.println(n1.st);

	}

}
