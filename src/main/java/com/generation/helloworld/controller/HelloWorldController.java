package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")

public class HelloWorldController {
	
	@GetMapping
	public String ola() {
		return "Olá mundo! Bom dia!";
	}
	
	@GetMapping("comidas")
	public String comidasFavoritas() {
		return "sushi \nHambunger";
	}
	@GetMapping("livros")
	public String livrosFavoritos() {
		return "Senhor dos Aneis \nAlice";
	}
	@GetMapping("bsm-gen")
	public String bsmGeneration() {
		return "Competencias comportamentais:\r\n"
				+ "\r\n"
				+ "Comunicação\r\n"
				+ "Proatividade\r\n"
				+ "Orientação ao detalhe\r\n"
				+ "Trabalho em equipe\r\n"
				+ "\r\n"
				+ "Mentalidades:\r\n"
				+ "\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Mentalidade de Crescimento\r\n"
				+ "Orientação ao Futuro\r\n"
				+ "Persistencia";
	}
	  @GetMapping("objetivos-semana")
	  public String objetivosDaSemana() {
		  return "Mentalidade de Crescimento\r\n"
					+ "Orientação ao Futuro\r\n"
					+ "Persistencia \r\n";
	  }
	  
	
	
}
