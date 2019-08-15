package com.example.practice015;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testWeb {
	
	@RequestMapping("/random2")
	@ResponseBody
	
	public int ran2() 
	{
		
		return 30;
		
	}

}
