package br.com.breno.drogaria.util;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateUtilTest {
	
	@Test
	public void conectar(){
		Session openSession = HibernateUtil.getSessionFactory().openSession();
		openSession.close();
		HibernateUtil.getSessionFactory().close();
		
	}

}
