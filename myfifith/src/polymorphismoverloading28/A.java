package polymorphismoverloading28;

class A {

	final void m1(char b) {
		
		
		System.out.println (b);
	}
	
	A()
	{
		System.out.println("ajshs");
		
	}
	A(int a)
	{
		System.out.println(a);
	}
	
	
	static  int add(int a,int b) {
		return a+b;
	}
	
		static int add(int a,int b,int c)
		{
			return a+b+c;
				
		}
	

	
	
	
	public static void main(String[] args) {
		System.out.println(A.add(11, 011));
		System.out.println(A.add(11, 11, 11));
	}

}
