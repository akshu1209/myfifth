package arraydemo;

public class Testarray2 {

	
	static void min(int arr[])   //creating method which recieves
	                      // an array as a parameter
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)           
		if(min>arr[i])
		//	min=arr[i];
		
		System.out.println(min);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {33,3,4,5,76};
		//declaring and initializing an array
		min(a);  //passing array to method

	}

}
