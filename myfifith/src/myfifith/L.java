package myfifith;


public class L {
	
	public void m1()                 // METHOD
	{
		int a=23;
		System.out.println(a);
		
	}
	
	
	L()                               // Constructor
	{
	  	char s='B';
		System.out.println(s);
		
	}

	
	static                                            //static
	{
		System.out.println("static block");
		
	}
	
	static                                            //static
	{
		System.out.println("static block");
		
	}
	
	{                                                            //non static block
		System.out.println("Non-static block");
	}
	{                                                            //non static block
		System.out.println("Non-static block");
	}
	
	{                                                            //non static block
		System.out.println("praju non");
	}
	
	public static  void main(String[]args)
	{
		L a=new L();
		a.m1();
	}
}
