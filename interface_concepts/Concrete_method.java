package interface_concepts;

//Interface will have only AM which r by default public 


interface Interface_1 {

	void login();
	void registraction();
}

public class Concrete_method implements Interface_1
{
	public static void main(String[] args) {
		
		Concrete_method c1 = new Concrete_method();
		c1.login();
		c1.registraction();
		concrete_method();
	}
	
	//1 cm 
	static void concrete_method()
	{
		System.out.println("Concrete method");
	}

	//uper pakage h access specifier lekin jb implement kiya by default it become public
	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login abstarct method");
	}

	@Override
	public void registraction() {
		// TODO Auto-generated method stub
		System.out.println("registratiob abstarct method");
	}
}




