package outputs_question;

public class Problem2_LocalGlobal {
	
	static int a=10;
	int a2=100;
	static int a3;
	static int s=90;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s=900;

		int a1=20;

		a=19;

		a1=20;

		System.out.println(a);

		Problem2_LocalGlobal l1=new Problem2_LocalGlobal();

		System.out.println(l1.a2);

	}

}
