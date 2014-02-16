package com.tritl.firefly.dao;
import java.util.List;

import com.tritl.firefly.model.Doctor;
import com.tritl.firefly.model.Person;

public interface DoctorDao {
	
	   public List<Doctor> getAllDoctors();
	   public Doctor getDoctor(int doctorId);
	   public void updateDoctor(Doctor doctor);
	   public void deleteDoctor(Doctor doctor);

}
