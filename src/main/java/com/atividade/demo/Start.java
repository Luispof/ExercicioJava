package com.atividade.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Start {
	@RequestMapping("/index")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	@RequestMapping("/listaLivrosPorCategoria")
	public ModelAndView listaLivrosPorCategoria() {
		return new ModelAndView("listaLivrosPorCategoria");
	}
	@RequestMapping("/consultaPorCod")
	public ModelAndView consultaPorCod() {
		return new ModelAndView("consultaPorCod");
	}
	@RequestMapping("/cadastroLivro")
	public ModelAndView cadastroLivro() {
		return new ModelAndView("cadastroLivro");
	}
}