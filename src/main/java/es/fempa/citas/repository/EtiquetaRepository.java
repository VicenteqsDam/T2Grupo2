package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Etiqueta;

public interface EtiquetaRepository extends JpaRepository<Etiqueta, Integer> {
	
}
