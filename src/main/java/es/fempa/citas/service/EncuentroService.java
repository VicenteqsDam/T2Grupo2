package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Encuentro;
import es.fempa.citas.domain.Plan;
import es.fempa.citas.repository.EncuentroRepository;
import es.fempa.citas.repository.PlanRepository;

@Service
public class EncuentroService {

	@Autowired
	public EncuentroRepository encuentroRepository;

	public List<Encuentro> findAllEncuentro(Integer id) {
		return this.encuentroRepository.findByUsuarioSolicitadoIdUsuario(id);
	}

	public Encuentro findEncuentro(Integer id) {
		return this.encuentroRepository.findByIdEncuentro(id);
	}

	public void saveEncuentro(Encuentro e) {
		this.encuentroRepository.save(e);
	}

	@Autowired
	public PlanRepository planRepository;

	public List<Plan> findAllPlan() {
		return this.planRepository.findAll();
	}

	public Plan findPlan(Integer id) {
		return this.planRepository.findByIdPlan(id);
	}

	public void savePlan(Plan p) {
		this.planRepository.save(p);
	}
}
