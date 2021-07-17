package stringcompare;

public class K {
	
	public static void main (String[]args)     //String compare by equals() method
	{
		String s1="Akshay";
		String s2="Akshay";
		String s3=new String("Akshay");
		String s4="Saurav";
		 System.out.println(s1.equals(s2));           //true 
		 System.out.println(s1.equals(s3));       //true
		 System.out.println(s1.equals(s4));      //false
				
	}

}
//public boolean equals(Object another) compares this string to the specified object.
//
//The String equals() method compares the original content of the string. It compares values of string for equality. String class provides two methods: