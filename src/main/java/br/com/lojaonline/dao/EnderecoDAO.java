package br.com.lojaonline.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.lojaonline.model.Endereco;

@Repository(value="endereco")
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
	@Transactional
	public List<Endereco> listarEndereco() {
		  List<Endereco> enderecos = em.createQuery("select e from endereco e").getResultList();
		  return enderecos;
	}  
	
	*/
		
	public List<Endereco> listarEndereco() {  
	    Query query = em.createQuery("SELECT e FROM Endereco e");  
	    return query.getResultList();  
	} 
	
	
	/*
			  @SuppressWarnings("unchecked")
	  		public List<Endereco> listarEndereco() {
	        Query query = em.createQuery("SELECT e.* FROM endereco e");
	        List<Endereco> enderecos = (List<Endereco>) query.getResultList();
	        return enderecos;
	    }
	  
	  */
	
	/*
	@SuppressWarnings("unchecked")
	public List<Endereco> listarEndereco() {
		Session session = (Session) em.getDelegate();
		return (List<Endereco>) session.createCriteria(Endereco.class).list() ;
	}
	
	*/
	
}
