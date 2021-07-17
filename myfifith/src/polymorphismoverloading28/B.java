package polymorphismoverloading28;

public class B extends A

{

	static  int add(int a,int b) {
	return a+b;
}

	static int add(int a,int b,int c)          //method overloading changing no.of arguments
	{
		return a+b+c;
			
	}
	
	public static void main(String[] args) {
		
		A h=new B();
		
		h.m1('b');
	
		System.out.println(B.add(11, 011));
		System.out.println(B.add(11, 11, 11));
		System.out.println(A.add(11, 011));
		System.out.println(A.add(11, 11, 11));
	}

}





