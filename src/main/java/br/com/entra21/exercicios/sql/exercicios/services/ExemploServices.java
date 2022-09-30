package br.com.entra21.exercicios.sql.exercicios.services;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.entra21.exercicios.sql.exercicios.model.Exemplo;
import br.com.entra21.exercicios.sql.exercicios.repository.ExemploRepository;
import br.com.entra21.exercicios.sql.exercicios.services.exception.DataIntregatyViolationException;
import br.com.entra21.exercicios.sql.exercicios.services.exception.ObjectNotFoundException;

@Service
public class ExemploServices {
	@Autowired
	private ExemploRepository repository;
	
	
	public Exemplo findById(Integer id) {
		Optional<Exemplo> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"OBJETO NÃO ENCONTRADO! ID: " + id + ", tipo: " + Exemplo.class.getName()));
	}
	public Exemplo create(Exemplo Obj) throws DataIntregatyViolationException {
		if (findByCode(Obj) != null) {
			throw new DataIntregatyViolationException("id já cadastrado na base de dados!");
		}
		Exemplo newObj = new Exemplo(null, Obj.getFirstname(), Obj.getLastname(), Obj.getAge(),Obj.getActive());
		return repository.save(newObj);
	}
	
	
	private Exemplo findByCode(Exemplo obj) {
		Exemplo objNew = repository.findByCode(obj.getId());

		if (objNew != null) {
			return objNew;
		}
		return null;
	}
}
