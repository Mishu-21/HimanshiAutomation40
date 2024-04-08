package grotechjava;

public class FinalVariable {

 static int i=90; //can update as it is nt final
	final static int pi=90; //cannot update  as it is  final
	static void add()
	{
		final int i=10;
	//	 i=89; //cnat update it as it is final
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   pi=908;  //cant update it as it is final 
		i=45;
   
	}

}
