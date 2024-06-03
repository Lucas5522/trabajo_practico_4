package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.collections.CollectionDocenete;
import ar.edu.unju.fi.model.Docente;



@Controller
@RequestMapping("/docente")
public class DocenteController {
	@Autowired
	private Docente docente;
		
	@GetMapping("/listado")
	public String getDocentesPage(Model model) {
		model.addAttribute("docentes", CollectionDocenete.getDocente());
		model.addAttribute("titulo", "Docentes");
		return "docentes";
	}
		
		
	@GetMapping("/nuevo")
	public String getNuevoDocentePage(Model model) {
		boolean edicion = false;
		model.addAttribute("Docente", docente);
		model.addAttribute("edicion", edicion);
		model.addAttribute("titulo", "Nuevo Docente");
		return "docente";
	}
	
	
	
	
}
