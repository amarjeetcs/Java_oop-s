abstract class AbstractClass {
	abstract void  A1();
	abstract void  A2();
	abstract void  A3();
	final void showFinal()
	{
		System.out.println("I am final method..");
	}
	AbstractClass()
	{
		System.out.println("I am constructor...");
	}
	static void display2()
	{
		System.out.println("i am static method");
	}
	
}

class Amar extends AbstractClass
{
	void A1()
	{
		System.out.println("abstract class"+"A1");
	}
	
	void A2()
	{
		System.out.println("abstract class"+"A2");
	}
	
	void A3()
	{
		System.out.println("abstract class"+"A3");
	}
	
	void display()
	{
		System.out.println("i am non abstract method");
	}
}

class Test
{
public static void main(String[] args) {
		
		Amar a=new Amar();
		a.A1();
		a.A2();
		a.A3();
		a.display();
		a.showFinal();
		AbstractClass.display2();
		
		
	}
}

//abstract class can have abstract method
//abstract class can have non-abstract method
//abstract class can have constructor
//abstract class can have static method
//abstract class can have final method
//abstract class can have concreate method
