package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Amigo;
import es.fempa.citas.repository.AmigoRepository;

@Service
public class AmigoService {

	@Autowired
	public AmigoRepository amigoRepository;

	public Amigo findById(Integer id) {
		return this.amigoRepository.findByIdAmigo(id);
	}

	public List<Amigo> findAll() {
		return this.amigoRepository.findAll();
	}

	/*
	 * public BorrarAmigo findByIddelete (Integer id) { return
	 * this.amigoRepository.findByIdAmigo(id); }
	 */

}
