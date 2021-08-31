package com.xworkz.birdsApp.dao;

import com.xworkz.birdsApp.entity.BirdEntity;

public interface BirdsDao {
 public void save(BirdEntity entity);
 public BirdEntity getInfo(int id);
 public void update(int id,String name);
 public	void  delete(int id);

}
