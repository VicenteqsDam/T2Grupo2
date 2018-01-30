package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Orientacion;
import es.fempa.citas.repository.OrientacionRepository;

@Service
public class OrientacionService {

	@Autowired
	public OrientacionRepository orientacionRepository;

	public List<Orientacion> findAll() {
		return this.orientacionRepository.findAll();
	}

}
