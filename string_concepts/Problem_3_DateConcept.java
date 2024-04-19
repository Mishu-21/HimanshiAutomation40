package string_concepts;

import java.util.Date;

public class Problem_3_DateConcept {

	public static void main(String[] args) {
		Date d=new Date(); //Data pre-defined class in java   //package java.util.Date
		
		//when we do d. some of the method show as cross which means those methods are depricated means RIP means cannot be used 
		//getDate(),getDAy()   inke aage jo sign hai woh wale methods 
		
	d.getDate();  //if we try to use depracted methiod it will show this type which mean that these methods r depricated 
	
	
	System.out.println(d.getTime()); //giving us machine understandable time 
	//getTime return type hai long --> hower karo is par vha se bhi pta chl jata hai 
	//long return type kyu hai bcz yeh epoch mai time dega jo apke laptop ka hai 
	//so than we go to epoch converter website n see the original time 
	
	
	//now to get the time in human understandable what we need to do is 
	//1.create an object of date type
	
	Date d1=new Date(d.getTime()); //giving us Human understandable time 
	//and we r passimg parameter  bcz we r trying to invoke parameterised constructor 
	System.out.println(d1);
	
	
	/*
	 * kya d1 par hum string function use kr skte hai?? Nahi agr kuch string ngi h
	 * toh uspar hum string function use nhi kr skte agr ktrne ahi tih humko uske
	 * liye woh string mai convert karne honge
	 */
	
	
	//so d2 to string mai coonvert kiya to utilise string function and uska return type string hoga 
	String currentTime=d1.toString();  //converted d1 in string 
	System.out.println(currentTime);
	
	//agr future time chahiye toh current time ko humko add krna hoga kise se 
	Date FutureTime=new Date(d.getTime() +(1000*60*60*24*1));
			//d.getTime()--->machine understandable time 
	       //here 1000*60*60*24*1   -->1 is one day forward 
	          //if we do 1000*60*60*24*5  -->then 5 din aage ka 
	System.out.println(FutureTime);
	
 //aise convert kiya future time ko string mai 
	String Futuretime2=FutureTime.toString();
 Futuretime2.length();
	
	//agr past time chahiye toh current time ko humko sub krna hoga kise se 
		Date PastTime=new Date(d.getTime() -(1000*60*60*24*5));
				//d.getTime()--->machine understandable time 
		       //here 1000*60*60*24*1   -->1 is one day back
		          //if we do 1000*60*60*24*5  -->then 5 din phle
		System.out.println(PastTime);
		
		
		//now as humne current time ko string mai krdiya h si we can use current trime 
		//
		//so ab current time se month lekar aao--> so ab substring se use karo 2 parameter wali as beech mai se chahiye kucg 
		
		//moth lekar aane ke liye 
		String month=currentTime.substring(4,7);
		System.out.println(month);
		
		//date lekar aane ke liye 
		String date=currentTime.substring(8,10);
		System.out.println(date);
		
		//year lekar aane ke liye --> can use subtring function with one parameter as last data chahiye 
		//so length se - kar skte hai 5 bcz 1 lemgth -1 tk index hota hai n than i 3 or to make ur cursor point to 2024 ke 2 pr 
		String year=currentTime.substring(currentTime.length()-4);
		System.out.println(year);
		
		//ab hum school ya book flight mai kaise time hota hai woh humko karna hai calculate so kaise likhe 
		System.out.println(month.concat(date).concat(year));
		//but hum march/24/2024 aise format mai likhte hai so we can do as 
		System.out.println(month.concat("/").concat(date).concat("/").concat(year));
		
		//so now using concate we can get date in any format we wish to have
		
		
		
	
	
	}
}
