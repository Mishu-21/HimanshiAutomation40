//In  a given string calculate how many space we have 

package string_concepts;

public class Problem_10_CharcterClass_CountSpace {

	public static void main(String[] args) {
		

		int count=0;
		String s="Hish5 rahul shivam";
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			boolean b=Character.isSpaceChar(c[i]);
			if(b==true)
				count=count+1;
		}
		System.out.println("in a string alphabet present" +count);
	}
	}


