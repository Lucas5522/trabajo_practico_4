package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.collections.CollectionMateria;
import ar.edu.unju.fi.model.Materia;



@Controller
@RequestMapping("/materia")
public class MateriaController {
	@Autowired
	private Materia materia;
		
	@GetMapping("/listado")
	public String getMateriaPage(Model model) {
		model.addAttribute("materias", CollectionMateria.getMateria());
		model.addAttribute("titulo", "Materias");
		return "materias";
	}
		
		
	@GetMapping("/nuevo")
	public String getNuevoMateriaPage(Model model) {
		boolean edicion = false;
		model.addAttribute("Materia", materia);
		model.addAttribute("edicion", edicion);
		model.addAttribute("titulo", "Nueva Materia");
		return "materia";
	}
	
	
	
	
}
