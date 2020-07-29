package br.com.coti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.coti.entity.Livro;
import br.com.coti.repository.LivroRepository;

@RestController
@ResponseBody
public class LivroController {
    @Autowired
    LivroRepository dao;
	
	@GetMapping("/livro")
	public  List<Livro>findALL(){
		return dao.findAll();
	}
}
