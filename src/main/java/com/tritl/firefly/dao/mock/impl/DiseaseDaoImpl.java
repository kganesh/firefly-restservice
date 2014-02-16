package com.tritl.firefly.dao.mock.impl;

import java.util.ArrayList;
import java.util.List;

import com.tritl.firefly.dao.DiseasesDao;
import com.tritl.firefly.model.Diseases;;

public class DiseaseDaoImpl implements DiseasesDao {
	
   //list is working as a database
   List<Diseases> diseases;

   public DiseaseDaoImpl(){
      diseases = new ArrayList<Diseases>();
      Diseases disease1 = new Diseases(0, "Robert");
      Diseases disease2 = new Diseases(1, "John");
      diseases.add(disease1);
      diseases.add(disease2);		
   }
   
      
   //@Override
   public void deleteDiseases(Diseases disease) {
	   diseases.remove(disease.getDiseasesId());
      System.out.println("Disease: Roll No " + disease.getDiseasesId() 
         +", deleted from database");
   }

   //retrive list of Diseases from the database
   //@Override
   public List<Diseases> getAllDiseases() {
      return diseases;
   }

   //@Override
   public Diseases getDiseases(int diseaseId) {
      return diseases.get(diseaseId);
   }

   //@Override
   public void updateDiseases(Diseases disease) {
	   diseases.get(disease.getDiseasesId()).setName(disease.getName());
      System.out.println("Disease: Roll No " + disease.getDiseasesId() 
         +", updated in the database");
   }
}