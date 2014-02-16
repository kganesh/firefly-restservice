package com.tritl.firefly.dao;
import java.util.List;

import com.tritl.firefly.model.Diseases;

public interface DiseasesDao {
	
	   public List<Diseases> getAllDiseases();
	   public Diseases getDiseases(int diseasesId);
	   public void updateDiseases(Diseases desease);
	   public void deleteDiseases(Diseases desease);

}
