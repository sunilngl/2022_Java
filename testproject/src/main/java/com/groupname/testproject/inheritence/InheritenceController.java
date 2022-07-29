package com.groupname.testproject.inheritence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.groupname.testproject.inheritence_IF.IFather;

@Controller
@RequestMapping("/")
public class InheritenceController {
	
	@Qualifier("younger_Son")
	@Autowired
	IFather father;
	
	

	
	
	
	@GetMapping
	public String getDetails() { // step 3
		
		//father.getMyProperty(); //step 4
		
		String bloodgroup = "O+";
		char blg = 'O';
		
		if(blg == 'O') {
			
			System.out.print("matched");
			
		}else {
			System.out.print(" not matched");
		}
		
		
		return "hello";
	}

}
