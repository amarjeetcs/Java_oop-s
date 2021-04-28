
public class Overriding{
	void show(int x,String s)
	{
		System.out.println("i am amarjeet");
	}
	
}

class Xyz extends Overriding
{
	void show(int x,String s)
	{
		System.out.println("i am in extended method");
	}

	
public static void main(String[] args) {
	
	Overriding t=new Overriding();
	t.show(10,"amarjeet");
	
	Xyz x=new Xyz();
	x.show(10,"amarjeet");
		

}
}

