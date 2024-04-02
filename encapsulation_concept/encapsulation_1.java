//Encapsulation--Making sensitive info as private

package encapsulation_concept;

//created a class which has private info

class login
{
	//created private info
	
	private String email_id="contact@grotechminds.com";  //defaukt emaIL ID
	
	/*
	 * Shortcut to generate getter and setter method by click on the line and right
	 * clisck and sorce-->geberate getter and setter
	 */
	
	
	//getter method--->use to fetch the value
	public String getEmail_id()
	{
		//if u want to retrieve sny value of a variable which is already present so use return 
		return email_id;
	}

	//setter method--->use to set the value 
	public void setEmail_id(String email_id) //local variable  //if any other class is setting ur value so it will accept some paraterers
	{
		//when i want to update my dfault email id with customer email id use "this" keyword
		this.email_id=email_id;
	}
	
	
	//Now we have one more sensitive info in our class which is private
	private String password="contact@password.com";

	//self generate kiya by source -->get setter and getters
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	//get and setter method are public always  bcz they need to be accessed by another class and sometimes possible that it need to be acccessed by another package so public he outisde pkg accessibke h 

   private int age=24;

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
   
}

public class encapsulation_1 {

	public static void main(String[] args) {
		
		//if my 2 class dont have any relation and main method is in this class but i need to call the methods of login class --->so create the object of login class
		login l1=new login();
		l1.setEmail_id("vijay@gmail.com "); //USER EMAIL ID
		
		//now call getter method n see email_id ki kya value h
		System.out.println(l1.getEmail_id());
		
		l1.setPassword("vijay@password");
		System.out.println(l1.getPassword());
		
		l1.setAge(27);
		System.out.println(l1.getAge());
		
	}

}
