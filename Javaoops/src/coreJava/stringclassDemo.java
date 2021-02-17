package coreJava;

public class stringclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String it is one of the prebuilt class in java.two way of defining string is
		//1.String literal
		//2.by creating object of string
		String a = "javatraining";//string literal
		String b = "Hello";//does not create object
		String ab=new String("Hello");//with string class
		String ba= new String("Hello");//it creates object
		//string is a class so it creates separate object at backend for hello string
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("Keshav jha"));
		//a.length()-gives length
		System.out.println(a.trim());
		a.toUpperCase();
		a.toLowerCase();
		//split
		String arr[] = a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));
		
		
		
	}
	


}
