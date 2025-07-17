package Api_Java_Topics;


class Employees
{
/*
As company name will be same for all the candidates so we can define that under static varibale as static varible is going to define a common set of data
   therefore main advantage of static varible is---> that it is going to define a common set of data
*/
	static String comname="TCS";
	
	//as id and name can change theefore made them as non static
	int id;
	String empname;
	
	Employees(int i,String n)
	{
		id=i;
		empname=n;
	}
	
	void display()
	{
		System.out.println(id+"  "+comname+"  "+empname);
	}
	
	
}
public class RealTimeExampleOfStaticVariable {

public static void main(String[] args) {
		
		
		
		Employees obj=new Employees(1234,"Manish");
		obj.display();
		
		Employees obj1=new Employees(9234,"Ramesh");
		obj1.display();
		
		Employees obj2=new Employees(9876,"Harish");
		obj2.display();
		

	}
}
