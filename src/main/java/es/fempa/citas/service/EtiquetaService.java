package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Etiqueta;
import es.fempa.citas.repository.EtiquetaRepository;

@Service
public class EtiquetaService {

	@Autowired
	public EtiquetaRepository etiquetaRepository;

	public List<Etiqueta> findAll() {
		return this.etiquetaRepository.findAll();
	}

	public void saveEtiqueta(Etiqueta e) {
		this.etiquetaRepository.save(e);
	}

	public void deleteEtiqueta(Integer id) {
		this.etiquetaRepository.deleteLabel(id);
	}

}
