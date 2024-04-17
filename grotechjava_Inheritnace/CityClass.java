package grotechjava_Inheritnace;


public class CityClass extends StateClass
{
	static void sub()
	{
		System.out.println("Sub");
	}
	
	void mul()  //non static method
	{
		System.out.println("mul");
	}
  public static void main(String[] args) 
  {
	add();
	sub();
	CityClass c1= new CityClass();
	c1.mul();  //as non static so create an object with reference variable n call it 
	
	//Object which we willbe creating is of child class only
	c1.div(); //can able to call non static parent method as inheritance is done
  }
}

class StateClass
{
	static void add()
	{
	   System.out.println("Add");
	}
	
	void div()   //non static method of paremt class 
	{
		System.out.println("div");
	}
}


//doesnt matter where we are creating ur parent class ie above or below child class 
//as execution starts from main only  until we r using extend so it knows which is parent n child class