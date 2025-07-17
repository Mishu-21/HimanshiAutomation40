package Api_Java_Topics;


class Employees21
{
	int id;
	String name;
	boolean isMarried;
	float salary;
	
//Constructor overloading 
	Employees21(int id,String name,boolean isMarried)
	{
		this.id=id;
		this.name=name;
		this.isMarried=isMarried;
		System.out.println(id+"  "+name+"  "+isMarried);
	}
	
	Employees21(int id,String name,boolean isMarried,float salary)
	{


		/*
		 In ThisKeyword_UseCase1 we have not used this callinfg statement 
		 */

		this(id,name,isMarried);  //as here we are using this calling statement isliyi output is 
		this.salary=salary;
		System.out.println(id+"  "+name+"  "+isMarried+"  "+salary);
	}
	
}


public class ThisKeyword_UseCase2 {
public static void main(String[] args) {
		
	Employees21 e1=new Employees21(123,"Himanshi",false);
	Employees21 e2=new Employees21(456, "Rahul", true, 50000.75f);
		
		

	}

}


/*
 OUTPUT-------> 
 123  Himanshi  false
456  Rahul  true
456  Rahul  true  50000.75
 
 */
