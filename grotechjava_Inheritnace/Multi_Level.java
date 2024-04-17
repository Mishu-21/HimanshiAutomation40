package grotechjava_Inheritnace;

class GrandParent_Class  //super must class
{
	static void fetching_username()
	{
		System.out.println("Super must class");
	}
}

class Parent_Class extends GrandParent_Class //super class 
{
	static void login_using_UN()
	{
		System.out.println("Super class");
	}
}
public class Multi_Level extends Parent_Class  //child class
{
	
	static void TestCase1_Adding_ProductsToCart()
	{
		System.out.println("Sublass");
	}

	public static void main(String[] args) {
		TestCase1_Adding_ProductsToCart();
		login_using_UN();
		fetching_username();

	}

}
