package com.tritl.firefly.dao.mock.impl;

import java.util.ArrayList;
import java.util.List;

import com.tritl.firefly.dao.PersonDao;
import com.tritl.firefly.model.Person;

public class PersonDaoImpl implements PersonDao {
	
   //list is working as a database
   List<Person> persons;

   public PersonDaoImpl(){
      persons = new ArrayList<Person>();
      Person person1 = new Person(0, "Robert");
      Person person2 = new Person(1, "John");
      persons.add(person1);
      persons.add(person2);		
   }
   
  //@Override
   public void deletePerson(Person person) {
      persons.remove(person.getPersonId());
      System.out.println("Student: Roll No " + person.getPersonId() 
         +", deleted from database");
   }

   //retrive list of students from the database
 //@Override
   public List<Person> getAllPersons() {
      return persons;
   }

 //@Override
   public Person getPerson(int personId) {
      return persons.get(personId);
   }

 //@Override
   public void updatePerson(Person person) {
      persons.get(person.getPersonId()).setPersonName((person.getPersonName()));
      System.out.println("Student: Roll No " + person.getPersonId() 
         +", updated in the database");
   }
}