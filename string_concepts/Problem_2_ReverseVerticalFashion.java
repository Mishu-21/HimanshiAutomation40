//take input of ur name n print in reverse vertical fashion
//horizantal
//horizantal reverse

package string_concepts;

public class Problem_2_ReverseVerticalFashion {
	
	static void horizantal_name()
	{
		System.out.println("=================================================");
		String name="Himanshi";
		for(int i=0;i<name.length();i++)
		{
			System.out.print(name.charAt(i));
		}
		System.out.println("");
	}
	static void Reverse_horizanral_name()
	{
		System.out.println("=================================================");
		String name="Himanshi";
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
	}

	public static void main(String[] args) {
		String name="Himanshi";
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.println(name.charAt(i));
		}
		horizantal_name();
		Reverse_horizanral_name();
	}
}
