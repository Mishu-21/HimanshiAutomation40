package Api_Java_Topics;

class Employees2
{
	int id;
	String name;
	boolean isMarried;
	float salary;
	
//Constructor overloading 
	Employees2(int id,String name,boolean isMarried)
	{
		this.id=id;
		this.name=name;
		this.isMarried=isMarried;
		System.out.println(id+"  "+name+"  "+isMarried);
	}
	
	Employees2(int id,String name,boolean isMarried,float salary)
	{
		       this.id=id;
				this.name=name;
				this.isMarried=isMarried;
                this.salary=salary;
				System.out.println(id+"  "+name+"  "+isMarried+"  "+salary);
	}
			
}


public class ThisKeyword_UseCase1 {
	
	public static void main(String[] args) {
		Employees2 e1=new Employees2(123,"kavita ",true);
		Employees2 e2=new Employees2(456, "Rul", false, 5000.75f);
	}
	
		
		}


/*
 OUTPUt--------> 
 123  kavita   true
456  Rul  false  5000.75

 */
