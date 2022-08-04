package com.groupname.testproject.forloop;

import java.util.ArrayList;
import java.util.List;

public class ForSample {
	
	
	
	

	public void detailForLoop() {
	
	List<String> details = new ArrayList<>(); 
	
	
	details.add("michel");
	details.add("harish");
	details.add("suresh");
	
	System.out.println("Index based Item :"+details.get(0));
	System.out.println("Index based Item :"+details.get(1));
	System.out.println("Index based Item :"+details.get(2));
	
	for(String detls : details) { // size = 3 ==> [0] = 1st. [1] = 2nd , [2] =3rd
		
		System.out.println("Size of List :" + details.size());
		
		
	}
	
	}
	

	public static void main(String[] args) {
		

		ForSample forsampleObj = new ForSample();
		forsampleObj.detailForLoop();
	}

}
