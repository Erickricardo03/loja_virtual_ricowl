package lojavirtual.ricowl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lojavirtual.ricowl.model.Acesso;
import lojavirtual.ricowl.repository.AcessoRepository;

@Service
public class AcessoService {

	@Autowired
	private AcessoRepository acessoRepository;
	
	
	public Acesso save (Acesso acesso) {
		
		
		/* Qualquer tipo de validação antes de salvar */
		return acessoRepository.save(acesso);
		
		
		
	}
	
	
}
