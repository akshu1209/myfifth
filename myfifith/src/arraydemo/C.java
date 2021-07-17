package arraydemo;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int a[]= new int[5];
				// 2 6 8 4 1   Values
			     // 0 1 2 3 4
						
					//	for(int i=0;i<5;i++)
							for(int i=0;i<a.length;i++)
							
						{
							a[i]=i++;
						}
					//	for(int i=0;i<5;i++)              //normal for loop
							for(int i: a)                 // enhanced for loop
						System.out.println(a[i]);      // if you want print all values 
						


	}

}
