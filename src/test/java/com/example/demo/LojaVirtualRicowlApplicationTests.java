package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import junit.framework.TestCase;
import lojavirtual.ricowl.LojaVirtualRicowlApplication;
import lojavirtual.ricowl.controller.AcessoController;
import lojavirtual.ricowl.model.Acesso;
import lojavirtual.ricowl.repository.AcessoRepository;
import lojavirtual.ricowl.service.AcessoService;

@SpringBootTest(classes = LojaVirtualRicowlApplication.class)
public class LojaVirtualRicowlApplicationTests extends TestCase {

	@Autowired
	private AcessoService acessoService;
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	
	@Autowired
	private AcessoController acessoController;
	
	@Test
	public void testCadastraAcesso() {
	
	Acesso acesso = new Acesso();
	
	acesso.setDescricao("ROLE_ADMIN");
	
	acesso = acessoController.salvarAcesso(acesso).getBody();
	
	
	assertEquals(true, acesso.getId() > 0 );
	
	}

}
