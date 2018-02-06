package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Foto;

public interface FotoRepository extends JpaRepository<Foto, Integer> {

}
