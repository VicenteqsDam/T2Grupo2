package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Fumador;

public interface FumadorRepository extends JpaRepository<Fumador, Integer> {

}
