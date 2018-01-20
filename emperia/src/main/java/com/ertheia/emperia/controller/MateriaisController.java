package com.ertheia.emperia.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ertheia.emperia.model.Categoria;
import com.ertheia.emperia.model.Fabricacao;
import com.ertheia.emperia.model.Material;
import com.ertheia.emperia.model.Tipo;
import com.ertheia.emperia.repository.Materiais;
import com.ertheia.emperia.service.CadastroMaterialService;
import com.ertheia.emperia.service.exception.NomeMaterialJaCadastradoException;

@Controller
public class MateriaisController {
	
	@Autowired
	private CadastroMaterialService cadastroMaterialService;

	@Autowired
	private Materiais materiais;
	
//	http://localhost:8084/emperia/materiais/novo
	@RequestMapping("/materiais/novo")
	public ModelAndView novo(Material material){
		ModelAndView mv  = new ModelAndView("material/CadastrarMaterial");
		mv.addObject("categorias", Categoria.values());
		mv.addObject("tipos", Tipo.values());
		mv.addObject("fabricacoes", Fabricacao.values());
		
		return mv;
	}
	
	@RequestMapping(value ="/materiais/novo", method= RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Material material, BindingResult result, Model model, 
			RedirectAttributes attributes){
		
		if(result.hasErrors())
		{

			return novo (material);
		}try{
			cadastroMaterialService.salvar(material);
		}catch(NomeMaterialJaCadastradoException e)
		{
			result.rejectValue("nome", e.getMessage(), e.getMessage());
			return novo(material);
		}
		
		//Pra ser salvo no banco de dados
		attributes.addFlashAttribute("mensagem", "Material Salvo com Sucesso!");
		


		return new ModelAndView("redirect:/materiais/novo");
	}
	
	
}
