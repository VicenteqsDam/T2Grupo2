package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	@Query("SELECT u FROM Usuario u WHERE u.nombre = ?1 AND u.password = ?2")
	void logIn(String nombre, String pass);

	Usuario findByIdUsuario(Integer id);

	public Usuario findByUsername(String name);

}
