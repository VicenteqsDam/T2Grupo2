package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Idioma;
import es.fempa.citas.repository.IdiomaRepository;

@Service
public class IdiomaService {
	@Autowired
	public IdiomaRepository idiomaRepository;
	
	public List<Idioma> findAll(){
		return this.idiomaRepository.findAll();
	}
}
