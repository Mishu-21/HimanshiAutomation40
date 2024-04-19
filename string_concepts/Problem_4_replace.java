/*given string remove-->i) all 'a' present
                     -->ii)replace a with m 
*/
package string_concepts;

public class Problem_4_replace {

	public static void main(String[] args) {
   String s="I am Student";
   
  //replace(char oldChar,char newChar) is used -->return type is String 
                      //-->accept char as input
   
   //replace 'a'char with nothing 
   System.out.println(s.replace('a',' '));
   
   //replace 'a' with 'm'
   System.out.println(s.replace('a','m'));

	}

}
