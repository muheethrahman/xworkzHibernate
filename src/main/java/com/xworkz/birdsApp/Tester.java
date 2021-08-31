package com.xworkz.birdsApp;

import com.xworkz.birdsApp.dao.BirdsDao;
import com.xworkz.birdsApp.dao.BirdsDaoImpl;
import com.xworkz.birdsApp.entity.BirdEntity;

public class Tester {

	public static void main(String[] args) {
		
			
			  BirdEntity en=new BirdEntity(8,"sparrow","india",5,true,"chocolate",false,true,5,"citys");
			  
			  BirdsDao ent= new BirdsDaoImpl();
			  ent.save(en);
			  ent.getInfo(2);
			  ent.update(3,"DUCK");
			  ent.delete(8);
			  
			  
	
	}

}
