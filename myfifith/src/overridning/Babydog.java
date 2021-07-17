package overridning;

public class Babydog extends Dog {

	public static void main(String[] args) {
		Animal a=new Babydog();
		a.eat();
	}

}                                                // since babydog is not override the eat() method so eat
                                             // so eat ()method of Dog class is invoked.