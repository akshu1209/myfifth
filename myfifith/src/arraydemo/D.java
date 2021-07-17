package arraydemo;

import java.util.Random;

public class D {

	public static void main(String[] args) {
		Random r= new Random();
       int a[]= new int[10];
		
				
			
					for(int i=0;i<a.length;i++)
					
				{
					a[i]= r.nextInt(10);
				}
					
					
					System.out.println(a[2]);
								for(int i: a)                 
				System.out.println(a[i]);      
				


	}

}
