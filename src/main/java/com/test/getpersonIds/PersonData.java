package com.test.getpersonIds;

import java.util.ArrayList;
import java.util.List;


import com.test.peronlist.PersonList;

public class PersonData {
	public static void main(String[] args) {

		List<Person> personlist=new ArrayList<Person>();
		personlist.add(new Person(101, "saketh"));
		personlist.add(new Person(102, "kumar"));
		personlist.add(new Person(103, "kumar"));
		personlist.add(new Person(104, "ramu"));
		personlist.add(new Person(105, "sai"));
		personlist.add(new Person(106, "raju"));
		personlist.add(new Person(107, "krishna"));
		List<Integer> personsIds = PersonListIds.getPersonIds(personlist);
		System.out.println(personsIds);
		for(Integer personids: personsIds) {
			System.out.println(personids);
		}
		//Get the person ids using java7
		List<Integer> getPersonsIdusingJava7=PersonListIds.getPersonIdsUsingJava7(personlist);
		System.out.println(getPersonsIdusingJava7);
	}
}
