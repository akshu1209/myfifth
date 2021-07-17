package sixth;

public class F {

	
		public static void main(String[] args) 
		/*	String s1=new String("ganesh");
			s1.concat("Kande");                                          // string is in mutable it doesn't allow changes,concat is method predefined
			
			System.out.println(s1);   */
		
		{
		StringBuffer sb=new StringBuffer("ganesh");
		//StringBuffer sj=new StringBuffer("ganesh");
		
		
		 System.out.print(sb==sj); 
		
		sb.append("Kande");                                 // stringBUFFER is mutable it  allow changes,append is predefined
		 sb.replace(0,6,"akshay");                              // here we replace ganesh by akshay using replace method  //
		sb.delete(0, 4);
		sb.append(sb);
		 
		 // System.out.print(sb);  
		
	}
		                // string builder it is not for thread safe .no gaaurantee of synchronization.
		
		
}
