package br.com.frezza.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.frezza.model.beans.Veiculo;
import br.com.frezza.model.repository.VeiculoRepository;

@Controller
public class VeiculoController {
	
	@Autowired
	private VeiculoRepository veiculoRepo;
	
	@GetMapping("/veiculos")
	public ModelAndView listarAlunos() {
		
		ModelAndView mv = new ModelAndView("lista_veiculos");
		List<Veiculo> veiculos = veiculoRepo.findAll();
		mv.addObject(new Veiculo());
		mv.addObject("veiculos", veiculos); 
		return mv;
	}
}