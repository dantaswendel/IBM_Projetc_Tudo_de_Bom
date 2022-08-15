package br.com.ibm.tudodebom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class hello {

	@RequestMapping("/helo")
	@ResponseBody
	public String hello() {
		return "Hello word";
	}
	
}
