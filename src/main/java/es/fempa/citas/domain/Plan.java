package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Plan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2271611417002857149L;

	@GeneratedValue
	@Id
	private Integer idPlan;
	private String plan;

}
