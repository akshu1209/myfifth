package bikeforDataMember;

public class Honda extends Bike{

	int speedlimit=150;
	public static void main(String[] args) {
		Bike obj=new Honda();
		System.out.println(obj.speedlimit);
		
          // runtime (override) polym cannot achieve bye data member
	}

}
