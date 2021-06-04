package com.test.peronlist;

import java.util.ArrayList;
import java.util.List;

public class TestPersonList {
	public static void main(String[] args) {

		List<Person> person = new ArrayList<Person>();
		person.add(new Person(101, "shekar", "shekar@gmail.com"));
		person.add(new Person(102, "siva", "siva@gmail.com"));
		person.add(new Person(103, "kumar", "kumar@gmail.com"));
		person.add(new Person(104, "raju", "raju@gmail.com"));
		person.add(new Person(105, "saketh", "saketh@gmail.com"));
		person.add(new Person(106, "bunny", "buuny@gmail.com"));

		System.out.println("using java 8");
		// using java8 streams
		List<Person> p = PersonList.personListOfNames(person);

		for (Person personDatails : p) {
			System.out.println(personDatails.getPersonId() + " " + personDatails.getPersonName() + " "
					+ personDatails.getPersonEmail());
		}

		// To get the person data whos name is starts with "s" with using java7
		System.out.println("using java 7");
		List<Person> p1 = PersonList.personListOfNamesJava7(person);
		for (Person personDetails2 : p1) {
			System.out.println(personDetails2.getPersonId() + " " + personDetails2.getPersonName() + " "
					+ personDetails2.getPersonEmail());
		}
	}
}
