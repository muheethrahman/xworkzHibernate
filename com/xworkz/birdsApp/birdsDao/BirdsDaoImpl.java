package com.xworkz.birdsApp.birdsDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.birdsApp.birdsEntity.BirdEntity;

public class BirdsDaoImpl implements BirdsDao {

	public void save(BirdEntity entity) {
		Configuration configure = new Configuration();
	    SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		Transaction ts=session.beginTransaction();
		BirdEntity ent = (BirdEntity) session.save(entity);
		ts.commit();
		session.clear();
		factory.close();
		}		
	

	public  BirdEntity getInfo(int id) {
		Configuration configure = new Configuration();
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		BirdEntity ent = session.get(BirdEntity.class, id);
		session.close();
		factory.close();
		return ent;
	}

}
