package coreJava;

public class Exceptiondemo {

	public static void main(String[] args) {
		int b=7;
		int c=0;
		try
		{
//			int k=b/c;//purchase failed
//		
//		
//				System.out.println(k);
			int arr[] = new int[5];
					System.out.println(arr[7]);
		
		}
		catch(ArithmeticException et)//specific to arithmetic exception only
		{
			System.out.println("I catched the Arithmetic exception");
		}
		catch(IndexOutOfBoundsException ets)//parent exception
		{
		System.out.println("I catched the Indexoutofboundexception");
		}

		catch(Exception e)//parent exception accepts all kind of exception
		{
		System.out.println("I catched the exception");
		}
		finally
		{

              System.out.println("delete cookies");//This block is executed irrespective of exception thrown or not
		}
		
	}

}
