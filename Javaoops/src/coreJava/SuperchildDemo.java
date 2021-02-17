package coreJava;

public class SuperchildDemo extends SuperParentDemo {
	//child demo taking properties of parent demo
	String name ="java lecture";
	public SuperchildDemo()
	{
		super();//super keyword should be used as first line in child constructor if we want to use parent constructor
		System.out.println("child class constructor");
	}
	
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
public void getData()
{
	super.getData();
System.out.println("I am in child class");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SuperchildDemo cd= new SuperchildDemo();
		cd.getStringdata();
		cd.getData();
	}

}
