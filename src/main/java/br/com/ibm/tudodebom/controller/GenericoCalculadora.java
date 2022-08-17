package br.com.ibm.tudodebom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class GenericoCalculadora {
	
	

	
	public float calcular ( double d) {
		
		return (float) (d*0.8);
	}

}
