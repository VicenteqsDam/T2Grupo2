package es.fempa.citas.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Etiqueta;

@Transactional
public interface EtiquetaRepository extends JpaRepository<Etiqueta, Integer> {

	@Modifying
	@Transactional
	@Query("delete from Etiqueta e where e.idEtiqueta = ?1")
	public void deleteLabel(Integer id);

}
