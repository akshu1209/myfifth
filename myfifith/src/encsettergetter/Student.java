package encsettergetter;
                  // read only class a java class which has only setter methods
public class Student {
	private String college;   // Private data member
	
public void setcollege(String college)
{
	this.college=college;
}
	//now we can't get  the value of  college ,you can only change the value of college data member
}
