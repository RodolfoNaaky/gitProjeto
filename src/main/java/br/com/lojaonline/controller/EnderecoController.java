package br.com.lojaonline.controller;


/*

@Controller @RequestMapping(value="/views/*")
public class EnderecoController {

	
	
	
	@Autowired
	private EnderecoDAO enderecoDao;

	
	@RequestMapping(value = "/listar/{id}", method = RequestMethod.GET)
	public String show(@PathVariable("idEndereco") Integer idEndereco, ModelMap modelMap) {
		modelMap.addAttribute("endereco", enderecoDao.find(idEndereco));
		return "contato/show";
	}	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
		modelMap.addAttribute("enderecos", enderecoDao.listarEndereco());
		return "testeendereco";
	}

	@RequestMapping(value = "/contato/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer idEndereco) {
		enderecoDao.remove(enderecoDao.find(idEndereco));
		return "redirect:/endereco";
	}

	@RequestMapping(value = "/endereco", method = RequestMethod.GET)
	public String form(ModelMap modelMap) {
		modelMap.addAttribute("endereco", new Endereco());
		return "endereco/create";
	}

	
	/*
	 
	  @RequestMapping(value = "/addPerson", method = RequestMethod.POST)
	  public String addPerson(@ModelAttribute Person person) {
	    personSvc.add(person);
	    return "redirect:/";
	  }
	  
	
	@RequestMapping(value = "/addEndereco", method = RequestMethod.POST)
	public String create(@ModelAttribute("endereco") Endereco endereco ) {
		enderecoDao.persist(endereco);
		return "redirect:/testeendereco";
	}

	@RequestMapping(value = "/endereco/{id}/form", method = RequestMethod.GET)
	public String updateForm(@PathVariable("idEndereco") Integer idEndereco, ModelMap modelMap) {
		modelMap.addAttribute("endereco", enderecoDao.find(idEndereco));
		return "endereco/update";
	}

	@RequestMapping(method = RequestMethod.PUT)
	public String update(@ModelAttribute("endereco") Endereco endereco) {
		enderecoDao.merge(endereco);
		return "redirect:/endereco";
	}
	
	
	
}
*/