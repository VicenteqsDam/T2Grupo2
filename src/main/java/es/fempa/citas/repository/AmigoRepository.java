package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Amigo;

public interface AmigoRepository extends JpaRepository<Amigo, Integer> {
	@Query("SELECT u FROM Usuario u WHERE u.nombre = ?1")

	Amigo findByIdAmigo(Integer id);

	public Amigo findByUsername(String name);
}