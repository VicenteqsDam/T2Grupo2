package es.fempa.citas.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import es.fempa.citas.domain.Etiqueta;
import es.fempa.citas.service.EtiquetaService;

@RestController
public class EtiquetaController {
	
	@Autowired
	private EtiquetaService etiqueta;
	
	@GetMapping("/findAllLabels")
	public List<Etiqueta> findAllEtiquetas(){
		return this.etiqueta.findAll();
	}
	
}
