package exception_handling;

public class B {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try
		{
			int c=a/b; //this is risky block codes
		}
			catch(ArithmeticException Monkey)	 
		{
				System.out.println("Idiot enter valid denominatotr");
				System.out.println("EXCEPTION IS HANDLED");
		}
	}

}
