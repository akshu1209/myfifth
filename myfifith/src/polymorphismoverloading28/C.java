package polymorphismoverloading28;

public class C {


	
	
	
	
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
