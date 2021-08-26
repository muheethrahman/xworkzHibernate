package com.xworkz.birdsApp.birdsDao;

import com.xworkz.birdsApp.birdsEntity.BirdEntity;

public interface BirdsDao {
 public void save(BirdEntity entity);
 public BirdEntity getInfo(int id);
}
