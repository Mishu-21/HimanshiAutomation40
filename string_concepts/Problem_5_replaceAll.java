/*In a given string replace -->i) all capital letters
                          -->ii)all smaller letter
                          -->iii)remove number
                          -->iv)remove capital n numbers
                          */
package string_concepts;

public class Problem_5_replaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//replaceAll(String regex,String replacement)-->return type is String 
        //-->accept String as input
		
		
  String s="I Am Student";
  System.out.println(s.replaceAll("[A-Z]",""));  //remove capital letter
  
  System.out.println(s.replaceAll("[a-z]", ""));  //remove small letter
  
  String s1="I am 6978Hap7";
  System.out.println(s1.replaceAll("[0-9]",""));  //remove numbers
  
  System.out.println(s.replaceAll("[A-Z,0-9]",""));////remove capital n digit letter
  
	}

}
