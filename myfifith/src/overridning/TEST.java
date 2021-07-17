package overridning;

public class TEST {

	public static void main(String[] args) {
	
		Bank b;
		b=new SBI();
		System.out.println("SBI Rate of intres:"+b. getRateOfintrest());
		b=new ICICI();
		System.out.println("ICICI Rate of intres:"+b.getRateOfintrest());
		b=new AXIS();
		System.out.println("AXIS Rate of intres:"+b.getRateOfintrest());
		 

	}

}
