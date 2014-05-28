package br.com.lojaonline.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
//Código do Mano
	@Controller
	@RequestMapping(value = "/views/*")
	public class EnderecoController {

		@Autowired
		private EnderecoDAO enderecoDao;
	}

	@Repository("enderecoDao")
	public class EnderecoDAO {

		@PersistenceContext
		public EntityManager entityManager;

	}
// Fim Código mano
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

}