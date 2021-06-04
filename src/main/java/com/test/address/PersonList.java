package com.test.address;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.test.peronlist.Person;

public class PersonList {

	public static void main(String[] args) {
		Address ad1 = new Address("kMR", "TELANGANA", "100010");
		Address ad2 = new Address("Hyderabad", "TELANGANA", "9999999");
		Address ad3 = new Address("Bengolore", "Kartnataka", "666666");
		Address ad4 = new Address("Vizag", "AP", "00010001");
		Address ad5 = new Address("Warangal", "TELANGANA", "7777777");
		Address ad6 = new Address("Mumbai", "Maharastra", "88887888");

		List<Person1> personList = new ArrayList<Person1>();
		personList.add(new Person1(101, "shekar", ad1));
		personList.add(new Person1(102, "ramu", ad2));
		personList.add(new Person1(103, "krishna", ad3));
		personList.add(new Person1(104, "mahesh", ad4));
		personList.add(new Person1(105, "saketh", ad5));
		personList.add(new Person1(106, "sai", ad6));

		List<Address> p = PersonListAdress.personListOfNames(personList);

		for (Address address : p) {
			System.out.println(address.getDist() + " " + address.getState() + " " + address.getZipcode());
		}
		/*
		 * Iterator<Address> itr = p.iterator();
		 * 
		 * while (itr.hasNext()) { System.out.println(itr.next().getDist() + " " +
		 * itr.next().getState() + " " + itr.next().getZipcode());
		 * 
		 * }
		 */
		//using Java7 to get the person address
		List<Address> personDataUsingJava7 = PersonListAdress.personListOfNames(personList);
System.out.println("------------------------------");
		for (Address address : personDataUsingJava7) {
			System.out.println(address.getDist() + " " + address.getState() + " " + address.getZipcode());
		}
	}
}
