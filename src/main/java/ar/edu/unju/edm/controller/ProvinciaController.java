package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Provincia;


@Controller
public class ProvinciaController {
	
	//permite bajar complejidad 
	@Autowired
	Provincia unaProv;
	
	//permite invocar html
	@GetMapping({"/provincia"})
	
	public String CargarProvincia(Model model) {
		unaProv.setNombre("JUJUY es una provincia");
		//le pasamos el objeto con otro nombre al html
		model.addAttribute("prov" , unaProv);
			return "provincia";
	}
}
