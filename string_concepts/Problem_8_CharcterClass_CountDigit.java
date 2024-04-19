//in a given string calculate the bo. of numeric value  

package string_concepts;

public class Problem_8_CharcterClass_CountDigit {

	
	public static void main(String[] args) {
	
		int count =0;
		String s="Him28nsh6hisb9";
		char c[]=s.toCharArray();   //String ko char[] mai convert kiya so that we can use Character class
		 for(int i=0;i<c.length;i++)
		 {
			boolean b=Character.isDigit(c[i]);
			if(b==true)  //jb jb b true hoga mtln we have numerber in the given string  
			{
				count=count+1;
				
			}
			
		 }
        System.out.println("total numeric value which is present in a string:" +count);
	}

}
