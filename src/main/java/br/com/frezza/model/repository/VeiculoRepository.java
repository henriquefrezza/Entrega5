package br.com.frezza.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.frezza.model.beans.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
		
}
