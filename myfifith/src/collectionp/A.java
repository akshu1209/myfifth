package collectionp;

//import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;



public class A {
	
	public void m1()
	{
		List li=new ArrayList();
		li.add(1);
		li.add(2);
		li.add("akshay");
		//li.add(4);
	
		Iterator itr=li.iterator();
		while(itr.hasNext())
		{
			Object a=itr.next();
			System.out.println(a);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a=new A();
       a.m1();
		
	}

}
