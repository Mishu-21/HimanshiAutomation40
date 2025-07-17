package Api_Java_Topics;


	

	class Test6
	{
		final int speed=50;
		
		void display()
		{
			//speed=60; // as  above speed variable is made as final so cant change its value 
			System.out.println("The speed of vehicle is  "+speed);
		}
	}



	public class FinalVariable {

		public static void main(String[] args) {
			
			Test6 obj=new Test6();
			obj.display();
			
			
			
			

		}

	}

/*
 * OUTPUT------->
 * The speed of vehicle is  50
 */
