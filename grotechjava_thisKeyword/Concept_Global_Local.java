package grotechjava_thisKeyword;

public class Concept_Global_Local {
	
	//Non static global variables

	String name;
	int age;
	double salary;
	
	//Non static method
	void Person_details(String name,int age,double salary)
	{
		System.out.println("My name is "+name +" and age is " +age +" and salary " +salary);
	}

	public static void main(String[] args) {
		
		Concept_Global_Local c1= new Concept_Global_Local();
		c1.Person_details("ram", 21, 98980.0);  //as non static method so call it using reference variable 
		
		//global variable hai so inki default value print hui
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);

	}

}
