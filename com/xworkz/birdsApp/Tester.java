package com.xworkz.birdsApp;

import com.xworkz.birdsApp.birdsDao.BirdsDao;
import com.xworkz.birdsApp.birdsDao.BirdsDaoImpl;
import com.xworkz.birdsApp.birdsEntity.BirdEntity;

public class Tester {

	public static void main(String[] args) {
		
			
			  BirdEntity en=new BirdEntity(1,"sparrow","india",5,true,"chocolate",false,true,5,"citys");
			  
			  BirdsDao ent= new BirdsDaoImpl();
			  ent.save(en);
			  ent.getInfo(2);
			  
			  
	
	}

}
