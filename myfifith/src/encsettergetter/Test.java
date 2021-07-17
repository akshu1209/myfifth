package encsettergetter;

public class Test {

	public static void main (String[]args) {
		Student s=new Student();       
		s.setCollege("kite");            
		// System.out.println(s.getcollege());        // copile time error becoz there is no such method 
		System.out.println(s.college);  //CT error BECAUSE COLLEGE DATA MEMBER IS PRIVATE 
	}                                    //SO can't be access from outside the class
	
}




//compile by ;javac Test.java
//run by ;java com.encsettergetter.Test