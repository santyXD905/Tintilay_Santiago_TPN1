package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoraController {
	
	@Autowired
	Calculadora unaCalc;
	
	@GetMapping("/calculadora")
	public String getMenuCalculadora() {
		return ("calculadora");
	}
	
	//ModelAndView mapea el entorno visual y recibe datos 
	@GetMapping("/calculoSuma")
	public ModelAndView getCalculoSuma(@RequestParam (name = "num1") float num1 ,@RequestParam (name = "num2") float num2) {
		unaCalc.setNum1(num1);
		unaCalc.setNum2(num2);
		
		float resultadoFinal = unaCalc.sumar();
		
		ModelAndView ModelView = new ModelAndView("resultado");
		ModelView.addObject("resultadoFinal" ,resultadoFinal );
		
		return ModelView;
	}
	
	//requestparam recolecta un objeto-dato del html
	@GetMapping("/calculoResta")
	public ModelAndView getCalculoResta(@RequestParam (name = "num1") float num1 ,@RequestParam (name = "num2") float num2) {
		unaCalc.setNum1(num1);
		unaCalc.setNum2(num2);
		
		float resultadoFinal = unaCalc.restar();
		
		ModelAndView ModelView = new ModelAndView("resultado");
		ModelView.addObject("resultadoFinal" ,resultadoFinal );
		
		return ModelView;
	}
	
	@GetMapping("/calculoDiv")
	public ModelAndView getCalculoDiv(@RequestParam (name = "num1") float num1 ,@RequestParam (name = "num2") float num2) {
		unaCalc.setNum1(num1);
		unaCalc.setNum2(num2);
		
		float resultadoFinal = unaCalc.dividir();
		
		ModelAndView ModelView = new ModelAndView("resultado");
		ModelView.addObject("resultadoFinal" ,resultadoFinal );
		
		return ModelView;
	}
	
	@GetMapping("/calculoMulti")
	public ModelAndView getCalculoMulti(@RequestParam (name = "num1") float num1 ,@RequestParam (name = "num2") float num2) {
		unaCalc.setNum1(num1);
		unaCalc.setNum2(num2);
		
		float resultadoFinal = unaCalc.multiplicar();
		
		ModelAndView ModelView = new ModelAndView("resultado");
		ModelView.addObject("resultadoFinal" ,resultadoFinal );
		
		return ModelView;
	}
	
}
