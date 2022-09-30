package br.com.entra21.exercicios.sql.exercicios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.entra21.exercicios.sql.exercicios.model.Exemplo;
@Repository
public interface ExemploRepository extends JpaRepository<Exemplo, Integer>{
	@Query("SELECT obj FROM Exemplo obj WHERE obj.id =:id")
	Exemplo findByCode(@Param("id") Integer id);

	public List<Exemplo> findByAge(Integer age);
	
	public List<Exemplo> findByFirstnameAndAge(String name, Integer age);
	
	
}
