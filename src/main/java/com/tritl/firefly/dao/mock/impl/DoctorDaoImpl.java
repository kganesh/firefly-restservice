package com.tritl.firefly.dao.mock.impl;

import java.util.ArrayList;
import java.util.List;

import com.tritl.firefly.dao.DoctorDao;
import com.tritl.firefly.model.Doctor;


public class DoctorDaoImpl implements DoctorDao {
	
   //list is working as a database
   List<Doctor> doctors;

   public DoctorDaoImpl(){
      doctors = new ArrayList<Doctor>();
      Doctor doctor1 = new Doctor(0, "Robert");
      Doctor doctor2 = new Doctor(1, "John");
      doctors.add(doctor1);
      doctors.add(doctor2);		
   }
   
  //@Override
   public void deleteDoctor(Doctor doctor) {
      doctors.remove(doctor.getDoctorid());
      System.out.println("Student: Roll No " + doctor.getDoctorid()
         +", deleted from database");
   }

   //retrive list of students from the database
 //@Override
   public List<Doctor> getAllDoctors() {
      return doctors;
   }

 //@Override
   public Doctor getDoctor(int doctorId) {
      return doctors.get(doctorId);
   }

 //@Override
   public void updateDoctor(Doctor doctor) {
      doctors.get(doctor.getDoctorid()).setName((doctor.getName()));
      System.out.println("Student: Roll No " + doctor.getDoctorid() 
         +", updated in the database");
   }
}