package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.fempa.citas.domain.Etiqueta;
import es.fempa.citas.repository.EtiquetaRepository;

public class EtiquetaService {

	@Autowired
	public EtiquetaRepository etiquetaRepository;

	public List<Etiqueta> findAll() {
		return this.etiquetaRepository.findAll();
	}

}
