package com.groupname.testproject.Strings;

public class StringBasics {

	String name = "ajay"; // object creation using String literal
	String dsgn = new String("ajay"); // object creation using new keyword
	
	
	public void getString () {
		
		String surname = "java";
		String name = "engineer";
		
		String concate = surname.concat(name);
		String uppercase = surname.toUpperCase();
		int comapre = surname.compareTo("java"); // 0 -> true , 1 - > false
		
		boolean equals = surname.equals("java");
		boolean equalignore = surname.equalsIgnoreCase("java");
		
		System.out.println(equalignore);
	}
	
	
	public  static void main(String args[]) {
		
		StringBasics basic = new StringBasics();
		basic.getString();
		
	}
	
	
}
