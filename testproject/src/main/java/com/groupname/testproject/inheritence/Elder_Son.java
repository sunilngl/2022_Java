package com.groupname.testproject.inheritence;

import org.springframework.stereotype.Service;

import com.groupname.testproject.inheritence_IF.IFather;

@Service("elder_Son")
public class Elder_Son implements IFather{
	


	public void getMyProperty() {
		
		System.out.print("i have 3 crores");
		
	}

	
}
