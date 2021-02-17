package coreJava;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //int a =4;
         //If we have to store mulitple values of same data type
		int a[] = new int[5];//declares an array and allocates memeory for the values
		a[0] =2;
		a[1] = 3;
	    a[2] = 5;
		a[3] = 9;
		a[4] = 1;//initialized values into that array
		int b[] = {3,8,9,2,5,5};
		for (int i=0;i<b.length; i++)
		{
			System.out.println(b[i]);//retrieve values present in this array
		}
		

	}

}
