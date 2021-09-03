package com.xworkz.camera.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.camera.designPattern.Singleton;
import com.xworkz.camera.entity.CameraEntity;

public class CameraDaoImpl implements CameraDao {
	private SessionFactory sf = Singleton.getFactory();

	@Override
	public void save(CameraEntity entity) {
		try (Session session = sf.openSession()) {
			Transaction trans = session.beginTransaction();
			System.out.println("Saved entity : " + session.save(entity));
			session.flush();
			session.clear();
			trans.rollback();
		}
	}

	@Override
	public CameraEntity readById(int id) {
		try (Session session = sf.openSession()) {
			CameraEntity entity = session.get(CameraEntity.class, id);
			System.out.println("Read entity : ");
			return entity;
		}
	}

	@Override
	public void updateNameById(int id, String name) {
		try (Session session = sf.openSession()) {
			Transaction trans = session.beginTransaction();
			CameraEntity entity = session.get(CameraEntity.class, id);
			entity.setName(name);
			System.out.println("updated name by id : "+ entity);
			trans.commit();
		}
	}

	@Override
	public void deleteById(int id) {
		try (Session session = sf.openSession()) {
			Transaction trans = session.beginTransaction();
			CameraEntity entity = session.get(CameraEntity.class, id);
			session.delete(entity);
			System.out.println("deleted by id : "+ entity);
			trans.commit();
		}
	}

	@Override
	public void saveList(List<CameraEntity> camEntity) {
		try (Session session = sf.openSession()) {
			Transaction trans = session.beginTransaction();
			camEntity.forEach(entity -> {
				session.save(entity);
				System.out.println(entity);
			});
			trans.commit();
		}

	}

	@Override
	public void deleteList(List<Integer> id) {
		try (Session session = sf.openSession()) {
			Transaction trans = session.beginTransaction();
			id.forEach(deleted -> {
				session.delete(deleted);
				session.flush();
				System.out.println("delete the list   " + deleted);

			});
			trans.commit();
		}

	}

	

}
