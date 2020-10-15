package com.puchungis.platzimarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolamundoController {
 
	@GetMapping("/hola")
	public String saludar() {
		
		return "Nunca dejes de intentarlo";
	 
	}
	
}
