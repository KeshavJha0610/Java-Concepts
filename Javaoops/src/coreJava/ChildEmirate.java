package coreJava;

public class ChildEmirate extends Parentaircraft {
	
	public static void main(String[] args) {
		
		ChildEmirate c = new ChildEmirate();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
		//Parentaircraft p = new Parentaircraft(); cannot instantaniate abstract classes
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("red color on the body");
	}

}
