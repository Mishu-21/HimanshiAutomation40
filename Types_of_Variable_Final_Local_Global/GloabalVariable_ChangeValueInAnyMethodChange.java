package grotechjava;

public class GloabalVariable_ChangeValueInAnyMethodChange {
	/* DOUBT any difference if we use static n non static variable for global  VARIABLE
	        --yes to access it 
	        ie for static we cam call it by normally calling the methid name 
	        but for nonstatic call it by creating an object with its reference variable   */
	
	/*
	 Doubt--> Global variable hai ek uski value humne local mai change ki toh bhi woh ab update ho jati h as its gloabl 
	 but agr local variable hoga toh uska scope vhi method tk limited hai 
	 nichi explain kiya h 
	 */
	
	int a=10;  //Global variable  as non static
	static double pi=3.14;  //Global variable as static
	
	/*static char gender;
	gender='M';    Point3 Explained
	*/
	static int i; // Decalre Global variable   static withot initilisation
	int z;   //Decalre Global variable  non static withot initilisation
	static int DecalreInOneLineUseInAnotherMethodNotUnderThisLine; //but it must be static variable
	static  char gender='M'; //decalre n initialise in one line
   static	void add()
	{
	   i=10; //can do with static n can initiliase here
	//   z=10; error de rha h as humne z static nhi bnaya tha so access nhi ho errha h 
	   DecalreInOneLineUseInAnotherMethodNotUnderThisLine=10;
	   System.out.println(pi);
	    pi=98; //Can initialize it again
		int a=10;
		int b=20;
		System.out.println(pi);
	}
	
   static   void sub()
    {
    	int a= 10,b=20;
    	System.out.println(pi);
    	pi=78;
    	System.out.println(pi);
    }
    
    static void multi()
    {
    	System.out.println(pi);//can utilize it as global
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(pi);  //can use as global variable  //3.14
    System.out.println(pi*2); //can perforn //3.14*2
    add();
    sub();
 //   z=10;
    multi();
    System.out.println(pi);
    }

}

/*
EXPLANATION 
   MAIN SE START kiya
      phle pi is global static variable with its default value as 3.14
      now phle print kiya --->o/p 3.14
      then again print kiya but this time *2-->o/p 6.28
      now we called static add() 
           vha print ki pi value-->o/p 3.14     as normal value yhi h abhi koi update nhi ki h 
           ab pi ki value set ki 98 n pi is gloabl variable so ab woh throughout program k liye update ho gyi h 
           again print pi value---> o/p  98.0   98.0 as it is double in value
      now we called static sub()
           vha ki pi value print jo ab 98 ho gyi thi as gloablly we changed it to 98 --->98.0 o/p 
           ab initialise ki pi value as 78 but as yeh double h toh yeh 78.0 lega
           now print again --->o/p 78.0
      ab call kiya mult same yhi hua 
      then last mai again main mai pi value ki print 0/p 78*/
     