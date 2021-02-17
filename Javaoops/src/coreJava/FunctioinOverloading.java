package coreJava;

public class FunctioinOverloading extends ChildDemo {
//FunctionOverloading
public void getData(int a)
{
	System.out.println(a);
	}
public void getData(String a)
{
	System.out.println(a);
}
public void getData(int a,int b)
{
	System.out.println(b);
}
public static void main(String[] args) {
	FunctioinOverloading cl=new FunctioinOverloading();
	cl.getData(2);
	cl.getData("hello");
	cl.getData(3);
}
	}


