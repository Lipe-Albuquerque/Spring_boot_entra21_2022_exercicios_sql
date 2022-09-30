package br.com.entra21.exercicios.sql.exercicios.modelDTO;

import br.com.entra21.exercicios.sql.exercicios.model.Exemplo;

public class ExemploDTO {

	private Integer id;
	private String firstname;
	private String lastname;
	private Integer age;
	private Boolean active;
	public ExemploDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExemploDTO(Exemplo obj) {
		super();
		this.id = obj.getId();
		this.firstname = obj.getFirstname();
		this.lastname = obj.getLastname();
		this.age = obj.getAge();
		this.active = obj.getActive();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	
}
