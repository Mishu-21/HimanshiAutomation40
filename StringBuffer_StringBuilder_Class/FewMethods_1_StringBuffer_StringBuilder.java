package StringBuffer_StringBuilder_Class;

public class FewMethods_1_StringBuffer_StringBuilder {

	/*
	 Just in place of String Buffer write String Builder
	 */
	
	
	/*
	 Methods of StringBuffer are---> 
	    i) append(String s) : Adds the specified string to the end of the current string.
	   ii) insert(int offset, String str) :Inserts the string at the specified offset.
	  iii) replace(int start, int end, String str) : Replaces characters between start and end with the given string.
	   iv) delete(int start, int end) : Removes the characters from the specified range.
	    v) reverse() : Reverses the characters in the string buffer.
	   vi) capacity() :	Returns the current capacity (allocated storage) of the buffer. 
	  vii) charAt(int index) : Returns the character at the specified index.
	 viii) length() :	Returns the current length of the buffer. 
	   ix) substring(int start) : Returns a new string starting from the specified index.
	    x) substring(int start, int end) : Returns a new string between the specified indexes.
	   
	 */
	
	/*
	 Methods from 7 to 10 are same as string --> so refer string code to understand these methods
	 */
	
	public static void main(String[] args) {
		StringBuffer s2= new StringBuffer("Automation Batch 40"); 
		
		s2.append("is this Batch");  //append() is same as concatenation method  concat() of String 
		System.out.println(s2);
		//output--> Automation Batch 40is this Batch
		
		//as StringBuffer is mutable so my  s2=Automation Batch 40is this Batch
		//now when we tried to insert 
		s2.insert(16 , "Hes");
		System.out.println(s2);
		//output---->  Automation BatchHes 40is this Batch
		
		
		//Now s2=Automation BatchHes 40is this Batch
		//NOW when we try to replace 
		s2.replace(3, 7, "OMA");
		System.out.println(s2);
		//output----> AutOMAion BatchHes 40is this Batch
		
		/*
		 Description------------>
		                s2=Automation BatchHes 40is this Batch
		                s2.replace(3, 7, "OMA");
		                means 3 se lekar 7 tk jismai 7 is not included so basically replace the  value from 3,4,5,6 index 
		                      so previous these index 3,4,5,6 have value as omat respectively
		                      so we replace it with OMA
		                      so at index 3 o--> replaced by O
		                      so at index 4 m--> replaced by M
		                      so at index 5 a--> replaced by A
		                      so at index 6 t--> replaced by null value 
		                      therefore Output is 
		              AutOMAion BatchHes 40is this Batch
		 */
		
		
		//Now s2=AutOMAion BatchHes 40is this Batch
		s2.delete(5, 7);
		System.out.println(s2);
		//Output---> AutOMon BatchHes 40is this Batch
		
		//Now s2=AutOMon BatchHes 40is this Batch
		s2.reverse();
		System.out.println(s2);
		//Output---->hctaB siht si04 seHhctaB noMOtuA
		
		//In String class we used to reverse a String by a logic as no method was there for a String 
		
	     //Now s2=hctaB siht si04 seHhctaB noMOtuA
		int capa=s2.capacity();  // as return type of capacity() is int thatswhy we have used this in int 
		System.out.println(capa);
        //Output-----> 35
		//But Chatgpt karo toh answer alag aa raha hai 
		
		/*
		 This capacity() is same as we have in vector capacity()
		 vha bhi confusion thi yha bhi hai  
		 
		 */
	}
}
