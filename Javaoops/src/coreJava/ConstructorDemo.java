package coreJava;

public class ConstructorDemo {
    public ConstructorDemo() {
        System.out.println("I am in the constructor");
        System.out.println("I am in the constructor lecture 1");

    }

    //parameterized constructor
    public ConstructorDemo(int a, int b) {
        System.out.println("I am in the parameterized constructor");
        int c = a + b;
        System.out.println(c);
    }

    public ConstructorDemo(String str) {
        System.out.println(str);
    }

    public void getdata() {
        System.out.println("I am the method");
    }

    public static void main(String[] args) {
        ConstructorDemo cds = new ConstructorDemo();
        ConstructorDemo cd = new ConstructorDemo("Hello");
        ConstructorDemo c = new ConstructorDemo(4, 5);

        //whenever you create an object constructor is called

    }

}
