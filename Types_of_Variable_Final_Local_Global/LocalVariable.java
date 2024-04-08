package grotechjava;

public class LocalVariable {
	//Note: any variable which is brown in color is local n varibale which is blue in color is global
 /*	  int c;
	  c=10;   cant declare n initialise in two line 
	But  */  
	int b;
	void add()
	{
		b=19;//globale variable3 can be initialised insisde methhiod
		int a;  //local variable
        a=100;  //valid can declare n initialise in different line
        int b;
      //  System.out.println(b);  Giving error as we havnt initialise b variable
       // static int a;  Error as cant distinguish local variable as static n nonstatic 
        
	}
	
	void sub()
	{
		int a=200;  //local variable
	}
	
	static  void sub(int a)   // here this is also local
	{
		
	}
	
	
	public static void main(String[] args) {
		
	}

}
