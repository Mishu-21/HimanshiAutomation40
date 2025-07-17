package Api_Java_Topics;


class Student
{
	//these are instance/global  variable 
	int id;
	String name;
     String address; 
   
     /*
      If we write like this and the variable name of local and global/instance variable are the same so it is not able to distinguish between local and instance/global variable
      therefore default value of global variable is printed 
    Student(int id,String name,String address)
    {
    	
    	id=id;
    	name=name;
    	address=address;
    }
    
    Output ---> 
    0  null  null
    */
     
     /*
      But if we write like this 
      */
     Student(int id,String name,String address)
     {
     	this.id=id;
     	this.name=name;
     	this.address=address;
     }
     
     /*
      Output---> 
      1234  Mohan  Delhi
      */
     void display()
    {
    	System.out.println(id+"  "+name+"  "+address);
    }
    
    
    
}
public class ThisKeyword {
public static void main(String[] args) {
		
		Student obj=new Student(1234,"Mohan","Delhi");
		obj.display();
		

	}

}
