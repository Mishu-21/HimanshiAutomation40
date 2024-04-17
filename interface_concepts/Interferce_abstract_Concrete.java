package interface_concepts;

//interface will have 2 am
public interface Interferce_abstract_Concrete {
	
	void abstract_method_1();
	void abstract_method_2();

}

//ac will have 2am and 1 cc
abstract class  abstract_class implements Interferce_abstract_Concrete
{
	abstract public  void abstract_method_3();
	abstract void abstract_method_4();
	static void concrete_method_1()
	{
		System.out.println("concrete_method_1");
	}
}
 
//will have 1 cm
 class concrete_class extends abstract_class
 {
 
	 //only Method 1 n Method 2 have public access spevifier by default means coming from interface 
	@Override
	public void abstract_method_1() {
		System.out.println("Interace abstarct method 1");
		
	}

	@Override
	public void abstract_method_2() {
		// TODO Auto-generated method stub
		System.out.println("Interace abstarct method 2");
	}
	
	//Method 3 n Method 4 have same  access spevifier whic r defined in abstract class ---> so made method3 as public n method 4 as private 

	@Override
	public void abstract_method_3() {
		// TODO Auto-generated method stub
		System.out.println("abstarct method  abstarct method 3");
	}

	@Override
	void abstract_method_4() {
		// TODO Auto-generated method stub
		System.out.println("abstarct method  abstarct method 4");
	}
	static void concrete_method_2()
	{
		System.out.println("concrete_method_2");
	}
	
	public static void main(String[] args) {
		concrete_class c=new concrete_class();
		 concrete_method_2();
		 concrete_method_1();
		 
		 c.abstract_method_1();
		 c.abstract_method_2();
		 c.abstract_method_3();
		 c.abstract_method_4();
	}
	 
 }
