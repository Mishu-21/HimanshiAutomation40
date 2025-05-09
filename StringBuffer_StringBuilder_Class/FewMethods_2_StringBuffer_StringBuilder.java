package StringBuffer_StringBuilder_Class;


   /*
       xi) ensureCapacity(int minimumCapacity) : Ensures the capacity is at least equal to the specified minimum. 
    */
public class FewMethods_2_StringBuffer_StringBuilder{
	
	
	/*
	 Just in place of String Buffer write String Builder
	 */
	
	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();  // Default capacity = 16
        System.out.println("Initial capacity: " + sb.capacity());

        sb.ensureCapacity(30);  // Ask for a minimum of 30 characters
        System.out.println("Capacity after ensureCapacity(30): " + sb.capacity());

        sb.ensureCapacity(100);  // Ask for a minimum of 100 characters
        System.out.println("Capacity after ensureCapacity(100): " + sb.capacity());
    }

	/*
	   Initial capacity: 16
       Capacity after ensureCapacity(30): 34
       Capacity after ensureCapacity(100): 100
	 */
}



           /*
                 🧠 How it works:
                  .The default capacity of a StringBuffer is 16
                  . When you call ensureCapacity(n):
                             -->If n > current capacity:
                                   new capacity = (currentCapacity * 2) + 2
                                   until it's >= n.
                             -->Otherwise, capacity remains unchanged.
                             
                  Example ---> 
                  First, it grows from 16 → 34 to satisfy 30.
                      ie.ensureCapacity(30)
                      means 30 > 16
                         so capacity = (16*2)+2 =34
                  
                  now ensureCapacity(100)
                  so 100>34
                     so capacity = (34*2)+2= 70  but less than 100 
                  Then, it grows from 34 → 100 to satisfy 100 (since doubling 34 gives 70, still less than 100).           
                     
           */