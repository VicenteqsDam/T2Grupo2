package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Ojos;
import es.fempa.citas.repository.OjosRepository;

@Service
public class OjosService {
	
	@Autowired
	public OjosRepository ojosRepository;
	
	public List<Ojos> findAll(){
		return this.ojosRepository.findAll();
	}
}
