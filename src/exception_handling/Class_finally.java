package exception_handling;

public class Class_finally {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try
		{System.out.println("I am from try block");
		}
	catch(ArithmeticException Monky)
		{
		System.out.println("Idiot enter valid denominator");
		System.out.println("Exception is handled");
		}
	finally 
	{
		System.out.println("THANK YOU FOR USING ATM");
	}
	}

}
