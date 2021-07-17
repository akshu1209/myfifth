package suprkey;

public class C extends B                // Super key words for method

{

	C()
	{
		System.out.println("Amit");
	}
	public void m1()
	{
		super.m1();
		System.out.println("AKSHAY");
		
	}
	public static void main(String[] args) {
		
		C J=new C();
		J.m1();
		// TODO Auto-generated method stub

	}

}
