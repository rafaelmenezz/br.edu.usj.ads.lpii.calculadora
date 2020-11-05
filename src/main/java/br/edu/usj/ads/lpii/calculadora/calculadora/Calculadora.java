package br.edu.usj.ads.lpii.calculadora.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculadora {

    @PostMapping(value="/calcular")
    public ModelAndView postSomar(@RequestParam String operacao){ 
   
    Calculos calc = new Calculos(operacao);

    String resultado = " " + calc.retornaResultado();
    
    ModelAndView modelAndView = new ModelAndView("index");
    modelAndView.addObject("resultado", resultado);
    return modelAndView;
    }
    
}
