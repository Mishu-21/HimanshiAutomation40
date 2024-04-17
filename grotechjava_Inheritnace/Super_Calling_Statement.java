package grotechjava_Inheritnace;


// as non-parameterised constructor hai implicity write ki h supercalling statemnet 
class GrandParents_Class
{
	GrandParents_Class()
	{
		System.out.println("3");
	}
}

class Parents_Class extends GrandParents_Class
{
	Parents_Class()
	{
		System.out.println("2");
	}

}

class child_class extends Parents_Class
{
	child_class()
	{
		System.out.println("1");
	}
}



//ab humari super-Calling_statemnet ki koi bhi relationship nhi h uper wali class se 
public class Super_Calling_Statement {

	public static void main(String[] args) {
		
		//and as object humesha child class ka bnta h so child class ka object bnaya 
		
		new child_class();
		
		/* and every constructor hve supercalling statemnet as first line
		 * it will print 3 2 1 as super calling statement concept is there
		 */
		
	}

}
