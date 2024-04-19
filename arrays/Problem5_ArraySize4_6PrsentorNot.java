//Create an array of size 6 n check if '6'is present or not 

package arrays;

public class Problem5_ArraySize4_6PrsentorNot {

	public static void main(String[] args) {
		int number[]=new int[4];
		
		number[0]=1;
		number[1]=3;
		number[2]=6;
		number[3]=4;
		int number_to_check=6;
		for(int i=0;i<number.length;i++)
		{
			if(number[i]==number_to_check)
			{
				System.out.println("We found " +number_to_check +" number at position "+i);
			}
			else
				System.out.println("We could not  found " +number_to_check +" number at position "+i);
		}

	}

}
