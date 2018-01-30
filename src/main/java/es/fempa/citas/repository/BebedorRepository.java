package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Bebedor;

public interface BebedorRepository extends JpaRepository<Bebedor, Integer> {

	public Bebedor findByIdBebedor(Integer id);
}
