package grotechjava_thisKeyword;

public class Concept_Global_Local_This {
	//global variable must be non static 
	String name;
	int age;
	double salary;
	
	//Non static method
	 void Person_details(String name,int age,double salary)
	{
		System.out.println("My name is "+name +" and age is " +age +" and salary " +salary);
		this.name=name;   //this local varibale name has Ram value which is now assigned to global variable name
	    this.age=age;     //this local varibale age has 21 value which is now assigned to global variable age
	    this.salary=salary;    //this local varibale salary has 98980.0 value which is now assigned to global variable salary
	
	
	}

	public static void main(String[] args) {
		
		Concept_Global_Local_This c1= new Concept_Global_Local_This();
		c1.Person_details("ram", 21, 98980.0);  //as non static method so call it using reference variable 
		
		//global variable hai so inki default value ab update nhi hui as humne this keyword ka use krke inki value set krdi
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);

	}


}
