package br.com.breno.drogaria.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.breno.drogaria.util.HibernateUtil;

public class GenericDAO<Entidade> {
	
	public void salvar(Entidade entidade){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		
		try {
			transaction = sessao.beginTransaction();
			sessao.save(entidade);
			transaction.commit();
			
		} catch (RuntimeException e) {
			if(transaction != null){
				transaction.rollback();
			}
			throw e;
		}finally {
			sessao.close(); 
		}
	}
	
	
}