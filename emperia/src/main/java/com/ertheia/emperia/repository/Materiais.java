package com.ertheia.emperia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ertheia.emperia.model.Material;

@Repository
public interface Materiais extends JpaRepository<Material, Long>{
	
	//f em minusculo
	public Optional<Material>findByNomeIgnoreCase(String nome);

}
