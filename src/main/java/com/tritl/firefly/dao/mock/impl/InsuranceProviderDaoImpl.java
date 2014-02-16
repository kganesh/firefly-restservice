package com.tritl.firefly.dao.mock.impl;

import java.util.ArrayList;
import java.util.List;

import com.tritl.firefly.dao.InsuranceProviderDao;
import com.tritl.firefly.model.HealthCareProvider;

public class InsuranceProviderDaoImpl implements InsuranceProviderDao {
	
   //list is working as a database
   List<HealthCareProvider> InsuranceProviders;

   public InsuranceProviderDaoImpl(){
      InsuranceProviders = new ArrayList<HealthCareProvider>();
      HealthCareProvider InsuranceProvider1 = new HealthCareProvider(0, "Kaiser");
      HealthCareProvider InsuranceProvider2 = new HealthCareProvider(1, "BlueCross");
      InsuranceProviders.add(InsuranceProvider1);
      InsuranceProviders.add(InsuranceProvider2);		
   }
   
  //@Override
   public void deleteInsuranceProvider(HealthCareProvider InsuranceProvider) {
      InsuranceProviders.remove(InsuranceProvider.getInsuranceproviderId());
      System.out.println("Student: Roll No " + InsuranceProvider.getInsuranceproviderId() 
         +", deleted from database");
   }

   //retrive list of students from the database
 //@Override
   public List<HealthCareProvider> getAllInsuranceProviders() {
      return InsuranceProviders;
   }

 //@Override
   public HealthCareProvider getInsuranceProvider(int InsuranceProviderId) {
      return InsuranceProviders.get(InsuranceProviderId);
   }

 //@Override
   public void updateInsuranceProvider(HealthCareProvider InsuranceProvider) {
      InsuranceProviders.get(InsuranceProvider.getInsuranceproviderId()).setName(InsuranceProvider.getName());
      System.out.println("Student: Roll No " + InsuranceProvider.getInsuranceproviderId() 
         +", updated in the database");
   }
}