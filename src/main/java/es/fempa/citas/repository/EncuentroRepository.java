package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Encuentro;

public interface EncuentroRepository extends JpaRepository<Encuentro, Integer> {
	public List<Encuentro> findByUsuarioSolicitadoIdUsuario(Integer id);

	public Encuentro findByIdEncuentro(Integer id);
}
