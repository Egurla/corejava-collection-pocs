package com.test.peronlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonList {

	public static List<Person> personListOfNames(List<Person> person) {
		List<Person> namesStartsWithS = person.stream().filter(x -> x.getPersonName().startsWith("s"))
				.collect(Collectors.toList());
		return namesStartsWithS;

	}

	public static List<Person> personListOfNamesJava7(List<Person> person) {
		List<Person> p = new ArrayList<Person>();
		for (Person per : person) {
			if (per.getPersonName().startsWith("s")) {
				p.add(per);
			}
			
		}
		return p;
	}
}
