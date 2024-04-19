package grotechjava;

public class Math_Concept_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//anything is we want to access use Math. will give different methids
		
		
		//Pi()-->give the value of pi 
		double pi=Math.PI;
		System.out.println(pi);
		
		
		//addExact ---addthe value
		System.out.println(Math.addExact(12, 3));
		
		//subtractExact ---subtract the value
				System.out.println(Math.subtractExact(12, 3));
				
				
				
				/*most important method 
				 Math.random()
				 
				 Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0.Returned values are chosen pseudorandomly with (approximately)uniform distribution from that range. 
				 */
	
		for(int i=0;i<5;i++)
		System.out.println(	Math.random());
				
		
		System.out.println(	Math.sqrt(6789));
		
	}

}
