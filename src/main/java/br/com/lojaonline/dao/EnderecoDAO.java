package br.com.lojaonline.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.lojaonline.model.Endereco;

@Repository("enderecoDao") 
public class EnderecoDAO {
	
	private EntityManager em;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

	public Endereco find(Integer idEndereco) {
		return em.find(Endereco.class, idEndereco);
	}
	
	@Transactional
	public void persist(Endereco endereco) {
		em.persist(endereco);
	}
	
	@Transactional
	public void merge(Endereco endereco) {
		em.merge(endereco);
	}
	
	@Transactional
	public void remove(Endereco endereco) {
		em.remove(endereco);
	}
/*
	@SuppressWarnings("unchecked")
	public List<Endereco> listarEndereco() {
		return entityManager.createQuery("SELECT endereco FROM endereco;").getResultList();
	}  
	*/
	
	  @SuppressWarnings("unchecked")
	public List<Endereco> listarEndereco() {
	        Query query = em.createQuery("SELECT endereco FROM endereco;");
	        List<Endereco> enderecos = (List<Endereco>) query.getResultList();
	        return enderecos;
	    }
}
