package com.xworkz.camera;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDao;
import com.xworkz.camera.dao.CameraDaoImpl;
import com.xworkz.camera.entity.CameraEntity;

public class Tester {
public static void main(String[] args) {
		
		CameraDao dao = new CameraDaoImpl();
		dao.readById(1);
		dao.deleteById(3);
		CameraEntity entity1 = new CameraEntity(1,"Nikon12","Nikon","DSLR",42990,365,"Li-Ion200",2,true,24);
		CameraEntity entity2 = new CameraEntity(2,"Nikon","Nikon","DSLR",16290,450,"Li-Ion",2,true,48);
		CameraEntity entity3 = new CameraEntity(3,"NikonE12e","Nikon","Digital",2990,200,"Li-Ion",2,true,12);
		dao.save(entity1);
		dao.save(entity2);
		dao.save(entity3);
		dao.updateNameById(3, "Sony cybershot");

		List<CameraEntity> list = new ArrayList<>();
		list.add(entity1);
		list.add(entity2);
		list.add(entity3);
		
		dao.saveList(list);
		
		
	}
}
