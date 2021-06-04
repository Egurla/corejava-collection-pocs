package com.test.pincodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.test.peronlist.Person;

public class PersonList {

	public static void main(String[] args) {

		Address ad1 = new Address("kMR", "TELANGANA", 100010);
		Address ad2 = new Address("Hyderabad", "TELANGANA", 9999999);
		Address ad3 = new Address("Bengolore", "Kartnataka", 666666);
		Address ad4 = new Address("Vizag", "AP", 00010001);
		Address ad5 = new Address("Warangal", "TELANGANA", 7777777);
		Address ad6 = new Address("Mumbai", "Maharastra", 88887888);

		List<Person1> personList = new ArrayList<Person1>();

		personList.add(new Person1(101, "shekar", ad1));
		personList.add(new Person1(102, "ramu", ad2));
		personList.add(new Person1(103, "krishna", ad3));
		personList.add(new Person1(104, "mahesh", ad4));
		personList.add(new Person1(105, "saketh", ad5));
		personList.add(new Person1(106, "sai", ad6));

		// Using java8 to get the persons pincode
		List<Integer> pincodes = PersonListAdress.personListOfNames(personList);

		// System.out.println("person all pincodes " + pincodes);

		pincodes.stream().forEach(System.out::println);

		// Using java7 to get the persons pincode
		List<Integer> personpincodes = PersonListAdress.personListOfNamesUsingJava7(personList);
		Iterator<Integer> itr = personpincodes.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// list of persons data whose state is TELANGANA
		System.out.println("list of persons data whose state is TELANGANA");
		List<Person1> personDataUsingJava8 = PersonListAdress.getPersonDataUsingJava8(personList);
		// personDataUsingJava8.stream().forEach(System.out::println);
		personDataUsingJava8.forEach(s -> System.out.println(s.getPersonId() + " " + s.getPersonName() + " "
				+ s.getAddress().getDist() + " " + s.getAddress().getState() + " " + s.getAddress().getZipcode()));

		System.out.println("list of persons data whose state is TELANGANA using java 7");
		List<Person1> personDataUsingJava7 = PersonListAdress.getPersonDataUsingJava7(personList);

		for (Person1 personData : personDataUsingJava7) {
			System.out.println(personData.getPersonId() + " " + personData.getPersonName() + " "
					+ personData.getAddress().getDist() + " " + personData.getAddress().getState() + " "
					+ personData.getAddress().getZipcode());
		}
	}
}
