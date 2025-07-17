package Api_Java_Topics;

//overridden concept
class Bank
{
	//final int getROI(int x,int y)// if we write this method as final we will not able to override them
	int getROI(int x,int y)
	{
		return x+y;
	}
}

class SBI extends Bank
{
	int getROI(int x,int y)
	{
		return x+y;
	}
}

class HDFC extends Bank
{
	int getROI(int x,int y)
	{
		return x+y;
	}
}

public class FinalMethod {
public static void main(String[] args) {
		

	}
}
