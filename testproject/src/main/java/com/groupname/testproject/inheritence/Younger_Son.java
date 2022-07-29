package com.groupname.testproject.inheritence;

import org.springframework.stereotype.Service;

import com.groupname.testproject.inheritence_IF.IFather;

@Service("younger_Son")
public class Younger_Son implements IFather{
	
	@Override
	public void getMyProperty() {
		
		System.out.print("i have 2 crores");
	}

}
