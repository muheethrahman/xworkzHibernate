package com.xworkz.birdsApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.birdsApp.desingpatter.Singleton;
import com.xworkz.birdsApp.entity.BirdEntity;


public class BirdsDaoImpl implements BirdsDao {
	
	@Override
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
	
	@Override
	public  BirdEntity getInfo(int id) {
		Configuration configure = new Configuration();
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		BirdEntity ent = session.get(BirdEntity.class, id);
		session.close();
		factory.close();
		return ent;
	}


	@Override
	public void update(int id,String name) {
		SessionFactory fact =Singleton.getFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		BirdEntity bird = session.get(BirdEntity.class, id);
		bird.setBirdName(name);;
		session.update(bird);
		System.out.println(bird);
		trans.commit();
		session.close();
		//fact.close();
		}

	@Override
	public void delete(int id) {
		SessionFactory fact =Singleton.getFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		BirdEntity bird = session.get(BirdEntity.class, id);
		session.delete(bird);
		System.out.println("deleted :"+bird);
		trans.commit();
		session.close();
		}

}
