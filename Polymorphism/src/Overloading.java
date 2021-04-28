
public class Overloading {
	void show1(int a,String s)
	{
		System.out.println("i am int and string");
	}
	
	
	void show1(String s,int a)
	{
		System.out.println("i am string and int");
	}
	
	 void show1()
	 {
		 System.out.println("i am empty");
	 }

	public static void main(String[] args) {
		
		Overloading o=new Overloading();
		o.show1(10,"nikki");  
		o.show1("nikki",10);
		o.show1();
	}

}

