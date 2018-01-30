package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Estudios;

public interface EstudiosRepository extends JpaRepository<Estudios, Integer> {

	public List<Estudios> findByIdEstudios(Integer id);

	public Estudios findIdEstudios(Integer id);

}
