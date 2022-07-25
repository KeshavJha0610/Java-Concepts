package coreJava;

public class Basics1 {
    //Methods
    int a = 5;

    public void getData() {
        System.out.println("I am in method");
        //return "hello";
    }

    //objects are instances/references of a class
    public static void main(String[] args) {

        Basics1 b = new Basics1();
        Basics2 s = new Basics2();
        b.getData();
        System.out.println(b.a);
        s.setData();
        //both method and variable can be called with the help of a object of their own class

    }

}
