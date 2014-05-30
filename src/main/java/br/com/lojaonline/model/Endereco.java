
package br.com.lojaonline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "endereco")
public class Endereco {
	
	
	@Id
	@GeneratedValue()
	@Column(name = "idEndereco")
	private Integer idEndereco;
	
	//@Column(name="endereco")
	private String endereco;
	
	//@Column(name = "numero")
	private Integer numero;
	
	//@Column(name="cep")
	private Integer cep;
	
	//@Column(name = "cidade")
	private String cidade;
	
	//@Column(name = "estado")
	private String estado;
	
	
	public Endereco(){
		
	}
	
	public Integer getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}