package coreJava;

public class ChildEmirate extends ParentAircraft {

    public static void main(String[] args) {

        ChildEmirate c = new ChildEmirate();
        c.engine();
        c.safetyGuidelines();
        c.bodyColor();
        //Parentaircraft p = new Parentaircraft(); cannot instantaniate abstract classes
    }

    @Override
    public void bodyColor() {
        System.out.println("red color on the body");
    }

}
