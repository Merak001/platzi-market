package com.puchungis.platzimarket.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolamundoController {
 
	@GetMapping("/hola")
	public String saludar() {
		
		return "Nunca dejes de intentarlo";
	 
	}

	
}
