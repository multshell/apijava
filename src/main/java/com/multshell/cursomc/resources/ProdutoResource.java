package com.multshell.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multshell.cursomc.domain.Produto;
import com.multshell.cursomc.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public List<Produto> getProdutos() {
		List<Produto> produtos = produtoService.buscarProdutos();
		
		return produtos;
	}
}
