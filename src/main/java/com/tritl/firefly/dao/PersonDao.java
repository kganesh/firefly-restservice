package com.tritl.firefly.dao;
import java.util.List;

import com.tritl.firefly.model.Person;

public interface PersonDao {
	
	   public List<Person> getAllPersons();
	   public Person getPerson(int rollNo);
	   public void updatePerson(Person person);
	   public void deletePerson(Person person);

}
