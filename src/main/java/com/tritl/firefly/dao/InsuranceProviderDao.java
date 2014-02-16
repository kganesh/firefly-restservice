package com.tritl.firefly.dao;
import java.util.List;

import com.tritl.firefly.model.HealthCareProvider;
import com.tritl.firefly.model.Person;

public interface InsuranceProviderDao {
	
	   public List<HealthCareProvider> getAllInsuranceProviders();
	   public HealthCareProvider getInsuranceProvider(int InsuranceProviderId);
	   public void updateInsuranceProvider(HealthCareProvider insuranceProvider);
	   public void deleteInsuranceProvider(HealthCareProvider insuranceProvider);

}
