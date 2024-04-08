package grotechjava;

public class OddOrEven_WithoutIfElse {
	
	static int isEven(int n)
    {
          
        // n&1 is 1, then 
        // odd, else even
        return (n & 1);
    }
      
    // Driver code
    public static void main(String args[])
    {
        byte n = 101;
        if(isEven(n)==0)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }

		
		
		
	}


