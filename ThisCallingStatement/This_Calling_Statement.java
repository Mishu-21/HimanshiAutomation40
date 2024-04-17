package grotechjava;

//this calling statment is used to acll one constructor from another constructor 
public class This_Calling_Statement {

	This_Calling_Statement(int a)
	{
		// this(); giving CTE as our this calling statement  must match the arguments of our any constructor 
	this("Start");
		System.out.println("1");
	}
	This_Calling_Statement(String n)
	{
		this(0.0);
		System.out.println("3");
	}
	This_Calling_Statement(double a)
	{  this();
		System.out.println("2");
	}
	This_Calling_Statement()
    {
		System.out.println("4");
    }
	
	public static void main(String[] args) {
		
        new This_Calling_Statement(0); 
        
        //n if we hve many constructor so jo constructor call hote ja rhre hai vha tis statement likhni hai randomly kahi bhi nhi likh kste hum 
	}

}
