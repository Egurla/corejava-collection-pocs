package com.test.address;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.test.peronlist.Person;

public class PersonListAdress {

	public static List<Address> personListOfNames(List<Person1> personList) {

		List<Address> allpersonAddress = personList.stream().map(Person1::getAddress).collect(Collectors.toList());
		
		/*
		 * for(Address a: allpersonAddress) {
		 * System.out.println(a.getDist()+" "+a.getState()+" "+a.getZipcode()); }
		 */
		return allpersonAddress;
	}

	public static List<Address> personListOfNamesUsingJava7(List<Person1> personList) {
		List<Address> list=new ArrayList<Address>();
		Iterator<Person1> itr=personList.iterator();
		while(itr.hasNext()) {
			list.add(itr.next().getAddress());
		}
		
		return list;
	
	}
}
