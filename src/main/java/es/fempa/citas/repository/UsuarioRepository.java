package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.fempa.citas.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	@Query("SELECT u FROM usuario u WHERE p.nombre = ?1 AND p.pass = ?1")
	void logIn(@Param("nombre")String nombre,@Param("pass")String pass);
	
	@Query("SELECT u FROM usuario u WHERE u.id = ?1")
	Usuario findById(@Param("id")Integer id);
}
