//in a given string calculate the no. of alphabet  

package string_concepts;

public class Problem_9_CharcterClass_CountAlphabet {

	public static void main(String[] args) {
		
		int count=0;
		String s="Hish566iVsh";
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			boolean b=Character.isAlphabetic(c[i]);
			if(b==true)
				count=count+1;
		}
		System.out.println("in a string alphabet present" +count);
	}

}
