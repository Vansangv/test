package bkap.model.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bkap.model.entity.WebUser;

@Repository
public class UserDAOImp implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public WebUser getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		WebUser webUser = (WebUser) session.createQuery("from WebUser where username = :username")
				.setParameter("username", userName).uniqueResult();
		
		return webUser;
	}

}
