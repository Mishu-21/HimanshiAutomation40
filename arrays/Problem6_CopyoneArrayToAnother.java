package arrays;

import java.util.Arrays;

public class Problem6_CopyoneArrayToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int number[]=new int[4];
int number1[]=new int[4];
		number[0]=1;
		number[1]=3;
		number[2]=6;
		number[3]=4;
		System.out.println("First array: "+Arrays.toString(number));
		for(int i=0;i<number.length;i++)
		{
		   number1[i]=number[i];	
		}
		System.out.println("Copied Array: "+Arrays.toString(number1));
		//after copying pasting check if 2 arrays r equal or nit  
	//	boolean b =number.equals(number1);--->wrong
		
		boolean b = Arrays.equals(number, number1);
		if(b==true)
		{
			System.out.println("Both array r equal");
		}
		else
		{
			System.out.println("Both array r not equal");
		}
		}
	
	
	
	}


