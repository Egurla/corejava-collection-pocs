package com.test.pincodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.test.peronlist.Person;

public class PersonListAdress {

	public static List<Integer> personListOfNames(List<Person1> personList) {

		List<Address> allpersonAddress = personList.stream().map(Person1::getAddress).collect(Collectors.toList());

		List<Integer> getallPincodes = allpersonAddress.stream().map(Address::getZipcode).collect(Collectors.toList());
		/*
		 * for(Address a: allpersonAddress) {
		 * System.out.println(a.getDist()+" "+a.getState()+" "+a.getZipcode()); }
		 */
		return getallPincodes;
	}

	public static List<Integer> personListOfNamesUsingJava7(List<Person1> personList) {

		List<Integer> listOfAddress = new ArrayList<Integer>();

		for (Person1 person : personList) {
			listOfAddress.add(person.getAddress().getZipcode());
		}

		return listOfAddress;

	}

	// Get the person data list of persons whose state is TELANGANA using Java8
	public static List<Person1> getPersonDataUsingJava8(List<Person1> personList) {
		List<Person1> listOfpersonData = personList.stream().filter(x -> x.getAddress().getState().equals("TELANGANA"))
				.collect(Collectors.toList());

		return listOfpersonData;

	}

	// Get the person data list of persons whose state is TELANGANA using Java7
	public static List<Person1> getPersonDataUsingJava7(List<Person1> personList) {
		List<Person1> listOfpersonDataUsingJava7 = new ArrayList<Person1>();
		/*
		 * Iterator<Person1> itr = personList.iterator(); while (itr.hasNext()) { if
		 * (itr.next().getAddress().getState().equalsIgnoreCase("TELANGANA")) {
		 * listOfpersonDataUsingJava7.add(itr.next()); } }
		 */

		for(Person1 personData: personList) {
			if(personData.getAddress().getState().equals("TELANGANA")) {
				listOfpersonDataUsingJava7.add(personData);
			}
		}
		return listOfpersonDataUsingJava7;
	}
}
