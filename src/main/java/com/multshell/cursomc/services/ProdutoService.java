package com.multshell.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multshell.cursomc.domain.Produto;
import com.multshell.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> buscarProdutos() {
		
		List<Produto> obj = produtoRepository.findAll();
		
		return obj;
	}

}
