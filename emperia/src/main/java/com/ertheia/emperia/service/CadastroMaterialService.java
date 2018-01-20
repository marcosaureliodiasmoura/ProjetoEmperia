package com.ertheia.emperia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ertheia.emperia.model.Material;
import com.ertheia.emperia.repository.Materiais;
import com.ertheia.emperia.service.exception.NomeMaterialJaCadastradoException;

@Service
public class CadastroMaterialService {

	@Autowired
	private Materiais materiais;
	
	@Transactional
	public void salvar(Material material){
		Optional<Material> materialOptional = materiais.findByNomeIgnoreCase(material.getNome());
		if(materialOptional.isPresent()){
			throw new NomeMaterialJaCadastradoException("Este Nome já está cadastrado");
		}
		materiais.save(material);
	}
	
}
