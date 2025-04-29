package lojavirtual.ricowl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lojavirtual.ricowl.model.Acesso;
import lojavirtual.ricowl.repository.AcessoRepository;
import lojavirtual.ricowl.service.AcessoService;

@Controller
@RestController
public class AcessoController {

	@Autowired
	private AcessoService acessoService;

	@Autowired
	private AcessoRepository acessoRepository;
	
	@ResponseBody // Poder dar um retorno na API // 
	@PostMapping(value = "/salvarAcesso") // Mapeando a url para receber JSON// 
	public ResponseEntity <Acesso> salvarAcesso(@RequestBody Acesso acesso) { //Recebe o JSON e converte para objeto//
		
		Acesso acessoSalvo = acessoService.save(acesso);
		
		return new ResponseEntity<Acesso>(acessoSalvo, HttpStatus.OK);
		
		
		
	}
	
	
	@ResponseBody // Poder dar um retorno na API // 
	@PostMapping(value = "/deleteAcesso") // Mapeando a url para receber JSON// 
	public ResponseEntity <?> deleteAcesso(@RequestBody Acesso acesso) { //Recebe o JSON e converte para objeto//
		
		 acessoRepository.deleteById(acesso.getId());
		
		return new ResponseEntity("Acesso Removido",HttpStatus.OK);
		
		
		
	}
	
	
	
}
