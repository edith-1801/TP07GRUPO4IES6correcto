package ar.edu.ies6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	
	//SpringBoot Springframework
	
	@GetMapping ("/index")
	public String getIndex() {
		return "index";
	}
	

}
