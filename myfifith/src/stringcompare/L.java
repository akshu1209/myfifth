package stringcompare;

public class L {

	
	public static void main (String[]args)     
	{
		String s1="AKSHAY";
		String s2="Akshay";
		
		 System.out.println(s1.equals(s2));            //false
		 System.out.println(s1.equalsIgnoreCase(s2));       //true
		 
	}

}

//public boolean equalsIgnoreCase(String another) compares this String to another string, ignoring case