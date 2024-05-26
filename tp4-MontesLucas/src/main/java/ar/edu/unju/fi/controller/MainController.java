package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/paginaindex")
	public String getIndexPage() {
		return "index";
	}
	
	
	
}
