//Creating one more object for SIB,IIB,CON,MM program

package grotechjava;

public class BlocksExecution_Static_Main_IIb_Constructor {

	//SIB Declaration
	static
	{
		System.out.println("SIB calling");
	}
	
	//IIB Declaration
	{
		System.out.println( "IIB calling");
	}
	
	//Constructor Declaration
	BlocksExecution_Static_Main_IIb_Constructor()
	{
		System.out.println("Constructor calling");
	}
	
	//Main Declaration
	public static void main(String[] args) {
		
		BlocksExecution_Static_Main_IIb_Constructor b2= new BlocksExecution_Static_Main_IIb_Constructor();

		System.out.println("Main calling");
new BlocksExecution_Static_Main_IIb_Constructor();
	}

}
