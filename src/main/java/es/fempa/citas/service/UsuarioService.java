package es.fempa.citas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	public UsuarioRepository usuarioRepository;

	public void saveUser(Usuario u) {
		this.usuarioRepository.save(u);
	}

	public void loguear(String n, String p) {
		this.usuarioRepository.logIn(n, p);
	}

	public Usuario findById(Integer id) {
		return this.usuarioRepository.findByIdUsuario(id);
	}

}
