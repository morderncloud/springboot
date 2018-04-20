package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlueController {
	
	@RequestMapping("/hi/{name}")
	public String hiThere(Map<String,String> model, @PathVariable String name){
		model.put("name", name);
		return "hello";
	}

}
