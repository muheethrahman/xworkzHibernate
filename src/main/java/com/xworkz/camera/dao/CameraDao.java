package com.xworkz.camera.dao;

import java.util.List;

import com.xworkz.camera.entity.CameraEntity;

public interface CameraDao {
	void save(CameraEntity entity);
	CameraEntity readById(int id);
	void updateNameById(int id, String name);
	void deleteById(int id);
	void saveList(List<CameraEntity> camEntity);
}
