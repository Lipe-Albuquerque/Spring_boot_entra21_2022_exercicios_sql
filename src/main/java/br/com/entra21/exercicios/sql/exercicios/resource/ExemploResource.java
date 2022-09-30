package br.com.entra21.exercicios.sql.exercicios.resource;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.entra21.exercicios.sql.exercicios.model.Exemplo;
import br.com.entra21.exercicios.sql.exercicios.modelDTO.ExemploDTO;
import br.com.entra21.exercicios.sql.exercicios.repository.ExemploRepository;
import br.com.entra21.exercicios.sql.exercicios.services.ExemploServices;
import br.com.entra21.exercicios.sql.exercicios.services.exception.DataIntregatyViolationException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/exemplos")
public class ExemploResource {
	@Autowired
	private ExemploServices service;
	
	@Autowired
	private ExemploRepository repository;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ExemploDTO> findById(@PathVariable Integer id){
		ExemploDTO objDTO = new ExemploDTO(service.findById(id));
		return ResponseEntity.ok().body(objDTO);
	}
	
	@GetMapping
	public List<Exemplo> listAll(){
		
		return repository.findAll();
		
	}
	
	@GetMapping(value = "/byage/{age}")
	public List<Exemplo> getByAge(@PathVariable("age")Integer age){
		return repository.findByAge(age);
	}
	
	@PostMapping
	public ResponseEntity<Exemplo> create(@Valid @RequestBody Exemplo obj) throws DataIntregatyViolationException {
		Exemplo newObj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
//	@GetMapping
//	public ResponseEntity<List<Exemplo>> findAll() {
//		List<Exemplo> list = service.findAll().stream().map(obj -> new PatientDTO(obj)).collect(Collectors.toList());
//		return ResponseEntity.ok().body(listDTO);
//	}
	
}
