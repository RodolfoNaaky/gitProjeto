
package br.com.lojaonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HomeController {  
	
	
    @RequestMapping(value="/")
    public ModelAndView raiz() {
        return new ModelAndView("index");
    }
    @RequestMapping(value="index")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
		
    @RequestMapping(value="carrinho")
    public ModelAndView carrinho() {
        return new ModelAndView("carrinho");
    }
    
    @RequestMapping(value="pedidos")
    public ModelAndView pedidos() {
        return new ModelAndView("pedidos");
    }
   
    @RequestMapping(value="fatura")
    public ModelAndView fatura() {
        return new ModelAndView("fatura");
    }
    
	
    @RequestMapping(value="login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
    
	
    @RequestMapping(value="contato")
    public ModelAndView contato() {
        return new ModelAndView("contato");
    }
    @RequestMapping(value="cadastro")
    public ModelAndView cadastro() {
        return new ModelAndView("cadastro");
    }
    
    
}   