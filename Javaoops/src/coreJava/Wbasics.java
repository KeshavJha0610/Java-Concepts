package coreJava;

public class Wbasics {

	 public  static  void main (String[] args) {
		// TODO Auto-generated method stub
		final int myNum = 15;
		//myNum = 15;
		System.out.println(myNum);
		
		String name = "John";
		System.out.println("Hello " + name);
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty); 
		
		char a = 65, b = 66, c = 67;
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    
	    int x = 5;
	    x |= 3;
	    System.out.println(x);
	    int x1 = 5;
	    int y1 = 3;
	    System.out.println(x1 >= y1); // returns true because 5 is greater, or equal, to 3
	    
	    String firstName = "John ";
	    String lastName = "Doe";
	    System.out.println(firstName+lastName);
	    
	    int day = 4;
	    switch (day) {
	      case 6:
	        System.out.println("Today is Saturday");
	        break;
	        default:
	        System.out.println("Looking forward to the Weekend");
	        break;
	      case 7:
	        System.out.println("Today is Sunday");
	        break;
	         } 
	    
//	    int j = 0;
//        while (j < 5) {
//          System.out.println(j);
//          j++;
//          
          int k = 0;
          do {
            System.out.println(k);
            k++;
          }
          while (k < 5);  
          
          int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
          for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
              System.out.println(myNumbers[i][j]);
            }
          }
	    }
}
	

