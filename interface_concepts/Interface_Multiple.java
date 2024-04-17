package interface_concepts;

interface Interface_class_Class1
{
	void login();   //for interface  method no need to write abstract word
	void logout();
}

interface Interface_class_Class2
{
	void register();
}


public class Interface_Multiple implements Interface_class_Class1, Interface_class_Class2
{
	

   public static void main(String[] args) {
	
}

   
   //by default all method become public--> as anyone can access it 
@Override
public void register() {
	// TODO Auto-generated method stub
	
}

@Override
public void login() {
	// TODO Auto-generated method stub
	
}

@Override
public void logout() {
	// TODO Auto-generated method stub
	
}

}
