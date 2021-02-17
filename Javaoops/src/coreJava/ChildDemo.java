package coreJava;

public class ChildDemo extends InheritanceDemo {
	public void audioSystem()
	{
		System.out.println("new audio child");
	}
	public void engine()
	{
		System.out.println("new engine");
	}
	public void color()
	{
		System.out.println("color");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildDemo cd=new ChildDemo();
cd.color();
cd.Brakes();
cd.audioSystem();//function overriding-ignoring parent class and implementing child class

	}

}
