///Print average of given array 

package arrays;

public class Problem4_averageValue {

	public static void main(String[] args) {


		double number[]=new double[5];
		double add=0;
		number[0]=1;
		number[1]=3;
		number[2]=3;
		number[3]=4;
		number[4]=6;
		
		for(int i=0;i<number.length;i++)
		{
			add=add+number[i];
		}
		System.out.println(add);
		System.out.println(number.length);
		double  avg=(add)/(number.length);
		System.out.println(avg);
				
				

	}

}
