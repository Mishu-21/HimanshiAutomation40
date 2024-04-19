package TypeCasting;


class Dataprovider
{
	void username()
	{
		
	}
	void password()
	{
		
	}
}
public class Ctc_Upcasting extends Dataprovider
{
	void login_Button()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * whenever we see 1 class is declared in eight hand side n another in left hand
		 * side as we can see here Dataprovider is one class name which is declared in
		 * left hand side and Ctc_Upcasting is another class name which is declared in
		 * right hand side
		 * so it means uocasting 
		 */
		
		//upcasting --> can be explicitly or implictly
		
		//Dataprovider d1=new Ctc_Upcasting(); //implicitly 
		
		Dataprovider d1=(Dataprovider)new Ctc_Upcasting();//exlicilty
		//so now we can only access parent method not child class method
		d1.username();
		d1.password();
		//d1.login_Button();//cant do this 
	}

}
