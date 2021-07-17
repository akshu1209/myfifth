package bike;

 class Bike extends Vehicle 
{

	
	
	 void run()               // sem method as in the parent class 
	{
		System.out.println("Bike is running safely with 60 km");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle obj= new Bike();   //upcasting ;ref of veriable of parents class -object of child class 
		obj.run();                         // upcasting imp

	}

}
