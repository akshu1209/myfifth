package thiskeywords;

public class A {

	
 
		int a;                                     // global veriable
		A(int a)
		
		{
			       this. a=a;                               // differntiate by using this key word
			System.out.println(a);
		}
		
		
		public void m1 ()
		{
			System.out.println(a);                              // output default value is zero output
		}
		
		
		                         // to differentiate global and local veriable
		
		public static void main(String[] args)       
		{
			A b= new A(10);
b.m1();

			

		}

	}
