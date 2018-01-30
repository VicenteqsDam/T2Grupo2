package es.fempa.citas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.service.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuario;
	
	@PostMapping("/saveUser")
	public void saveClase(@RequestBody Usuario u) {
		this.usuario.saveUser(u);
	}
	
	@PostMapping("/loguear")
	public void loguear(@RequestBody Usuario u) {
		this.usuario.loguear(u.getNombre(),u.getPass());
	}
	
	@GetMapping("/find/{id}")
	public Usuario findById(@PathVariable Integer id) {
		return this.usuario.findById(id);
	}
}
