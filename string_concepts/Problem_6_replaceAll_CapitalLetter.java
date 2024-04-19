/*In a given string replace -->i) replace capital letter in ur name with Manish
                         
                          */


package string_concepts;

public class Problem_6_replaceAll_CapitalLetter {

	
	public static void main(String[] args) {
	
		String s="HimanShi";
		
	//rplace capital letter in ur name with Manish
		System.out.println(s.replaceAll("[A-Z]","Man"));

	}

}
