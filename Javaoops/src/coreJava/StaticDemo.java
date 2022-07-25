package coreJava;

public class StaticDemo {
    String name;//instance variables ie instance dependent
    String address;
    static String city;//class variables,all static variables are class variables
    static int i;

    static {   //static block
        city = "Hyd";
        i = 0;
    }

    StaticDemo(String name, String address) {
        this.name = name;
        this.address = address;
        i++;
        System.out.println(i);
    }

    public void getAddress() {
        System.out.println(address + " " + city);
    }

    public static void getCity() {
        System.out.println(city);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        StaticDemo obj = new StaticDemo("bob", "mallapur");
        StaticDemo obj1 = new StaticDemo("ram", "nacharam");
        StaticDemo obj2 = new StaticDemo("ram", "nacharam");
        obj.getAddress();
        obj1.getAddress();
        StaticDemo.getCity();//static
        StaticDemo.i = 4;//classname.object name - object independent
        obj.address = "xyz";//non static

    }

}
