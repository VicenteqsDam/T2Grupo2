package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Encuentro;
import es.fempa.citas.repository.EncuentroRepository;

@Service
public class EncuentroService {

	@Autowired
	public EncuentroRepository encuentroRepository;

	public List<Encuentro> findAll(Integer id) {
		return this.encuentroRepository.findByUsuarioSolicitadoIdUsuario(id);
	}

	public Encuentro findEncuentro(Integer id) {
		return this.encuentroRepository.findByIdEncuentro(id);
	}

	public void saveClase(Encuentro e) {
		this.encuentroRepository.save(e);
	}
}
