package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {

}
