package collectionp;


import java.util.Vector;
public class B {
	
	public void m1() {
		Vector<Integer> v=new Vector<Integer>();
		v.add(30);
		v.add(4);
		v.add(20);
		v.add(4);
		v.add(4);
		v.add(10);
		v.add(4);
	
		
		System.out.println(v.capacity());
	
	
	for (int i: v) {
		System.out.println(i);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B a=new B();
       a.m1();
	
	
}
}
