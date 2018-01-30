package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Sexo;
import es.fempa.citas.repository.SexoRepository;

@Service
public class SexoService {

	@Autowired
	public SexoRepository sexoRepository;

	public List<Sexo> findAll() {
		return this.sexoRepository.findAll();
	}

}
