package coreJava;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string is palindrome or not
		String s= "madam";
		String a ="";
		for(int i=s.length()-1; i>=0; i--)
		{
			a= a+s.charAt(i);
		}
		System.out.println(a);
		
		if(s==a)
		{
			//if it is a palindrome or not
		}
	}//a = madam

}
