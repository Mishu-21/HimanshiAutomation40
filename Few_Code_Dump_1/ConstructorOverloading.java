package grotechjava;

public class ConstructorOverloading {

	//Can multiple Constructor but different arguments
	ConstructorOverloading(int a)
	{
		System.out.println("1");
	}
	ConstructorOverloading()
	{
		System.out.println("3");
	}
	ConstructorOverloading(double a)
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// new ConstructorOverloading();  //Error as aisa method ek bhi define nhi kiya hai
		
      //  new ConstructorOverloading(0.0); //Double constructor calling
        new ConstructorOverloading(0); //int constructor
        new ConstructorOverloading(); 
       
        ConstructorOverloading c1=new ConstructorOverloading(0.0);//Double constructor calling
        
	}

}
