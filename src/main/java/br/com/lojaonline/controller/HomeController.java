package br.com.lojaonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.lojaonline.dao.EnderecoDAO;
import br.com.lojaonline.model.Endereco;

@Controller
public class HomeController {

	
	@Autowired
	private EnderecoDAO enderecoDao;
	
	@RequestMapping(value = "/")
	public ModelAndView raiz() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "index")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "carrinho")
	public ModelAndView carrinho() {
		return new ModelAndView("carrinho");
	}

	@RequestMapping(value = "pedidos")
	public ModelAndView pedidos() {
		return new ModelAndView("pedidos");
	}

	@RequestMapping(value = "fatura")
	public ModelAndView fatura() {
		return new ModelAndView("fatura");
	}

	@RequestMapping(value = "login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "contato")
	public ModelAndView contato() {
		return new ModelAndView("contato");
	}

	@RequestMapping(value = "cadastro")
	public ModelAndView cadastro() {
		return new ModelAndView("cadastro");
	}

	@RequestMapping(value = "decisao")
	public ModelAndView decisao() {
		return new ModelAndView("decisao");
	}

	@RequestMapping(value = "comprarxbox")
	public ModelAndView comprarxbox() {
		return new ModelAndView("comprarxbox");
	}

	@RequestMapping(value = "comprarps4")
	public ModelAndView comprarps4() {
		return new ModelAndView("comprarps4");
	}

	@RequestMapping(value = "Comprarwii")
	public ModelAndView Comprarwii() {
		return new ModelAndView("Comprarwii");
	}

	@RequestMapping(value = "usuario")
	public ModelAndView usuario() {
		return new ModelAndView("usuario");
	}

	@RequestMapping(value = "comprarps3")
	public ModelAndView comprarps3() {
		return new ModelAndView("comprarps3");
	}
	
	@RequestMapping(value = "testeendereco")
	public ModelAndView endereco() {
		return new ModelAndView("testeendereco");
	}

	
	  @RequestMapping( value ="/testeendereco", method = RequestMethod.GET)
	  //@RequestMapping(value = "/listar", method = RequestMethod.GET)
	  public String listarTodos(Model model) {
	    model.addAttribute("enderecos", enderecoDao.listarEndereco());
	    return "testeendereco";
	  }
	  
	  @RequestMapping(value = "/addEndereco", method = RequestMethod.POST)
	  public String addPerson(@ModelAttribute Endereco endereco) {
	    enderecoDao.persist(endereco);
	    return "redirect:/testeendereco";
	  }
}