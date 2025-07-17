package Api_Java_Topics;


class Employeess
{

	static String comname="TCS";
	int id;
	String empname;
	
	/*
	 Now suppose in future company nam changes so we are not going to call them again for each object
	 we can simply create another static variable and call it directy in main 
	 */
	static void change()
	{
		comname="Infosys";
	}
	
	Employeess(int i,String n)
	{
		id=i;
		empname=n;
	}
	
	void display()
	{
		System.out.println(id+"  "+comname+"  "+empname);
	}
	
	
}
public class RealTimeExampleOfStaticVariable1 {
public static void main(String[] args) {
		
	Employeess.change();
		
		Employeess obj=new Employeess(1234,"Manish");
		obj.display();
		
		Employeess obj1=new Employeess(9234,"Ramesh");
		obj1.display();
		
		Employeess obj2=new Employeess(9876,"Harish");
		obj2.display();
		

	}
}
