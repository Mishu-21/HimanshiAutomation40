package TypeCasting;

class Dataprovider1
{
	void username()
	{
		
	}
	void password()
	{
		
	}
}

public class Ctc_Downcasting extends Dataprovider1 {

	void login_Button()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Dataprovider1 d1=new Ctc_Downcasting();//upcasting 
		
		
		d1.username();
		d1.password();
		//d1.login_Button();//cant do this 
		
		//we can do downcasting  only when upcasting is done
		/*
		 * so what we want to convert keep it on left hand side and what we wanna
		 * convert keep it on right hand side
		 * 
		 * means d1 ko convert krna h toh left handside m rkho 
		 * Ctc_Downcasting mai covert krna h toh rhs rkho
		 */
		
		Ctc_Downcasting c1=(Ctc_Downcasting)d1; //can be done explicitly only 
		
	}
	}

