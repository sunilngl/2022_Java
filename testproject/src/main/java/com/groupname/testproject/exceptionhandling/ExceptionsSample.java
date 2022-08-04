package com.groupname.testproject.exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class ExceptionsSample {

	
	public String testException() {
		
		int age = 10;
		String name = "java";
		List<String> strList = new ArrayList<String>();
		
		strList.add("java");
		
		
		try {
			
		
			
				System.out.println(strList.get(0));
			
				
				
		
			
		}catch(NullPointerException e) {
			
		
			
			System.out.println("exception and description    :" + e);
			
		}catch(IndexOutOfBoundsException e){
			
			
			
		}finally {
			
			System.out.println("i am from finally block");
			return "end of finally block";
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		ExceptionsSample sampleException = new ExceptionsSample();
		System.out.println(sampleException.testException());
	}

}
