interface Interface
{
	void A1();
	void A2();
	void A3();
	
	static void m1()
	{
		System.out.println("i am static mehtod");
	}
	
	final int x=10;
	static int y=20;
	int z=30;
}
class Amarjeet implements Interface
{
	public void A1()
	{
		System.out.println("I am A1 interface");
	}
	
	public void A2()
	{
		System.out.println("I am A2 interface");
	}
	public void A3()
	{
		System.out.println("I am A3 interface");
	}
	
	static void m2()
	{
		System.out.println("i am static method 2");
	}
	public static void main(String[] args) {
		Amarjeet a=new Amarjeet();
		a.A1();
		a.A2();
		a.A3();
		Interface.m1();
		System.out.println(Interface.x);
		System.out.println(Interface.y);
		System.out.println(z);
	}
}
