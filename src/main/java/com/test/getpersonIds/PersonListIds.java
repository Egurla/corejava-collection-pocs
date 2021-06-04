package com.test.getpersonIds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonListIds {

	public static List<Integer> getPersonIds(List<Person> personlist) {
		List<Integer> getallpersonIds = personlist.stream().map(Person::getPersonId).collect(Collectors.toList());
		return getallpersonIds;
	}
	
	public static List<Integer> getPersonIdsUsingJava7(List<Person> personlist) {
		
		List<Integer> list=new ArrayList<Integer>();
		Iterator<Person> itr=personlist.iterator();
		
		while(itr.hasNext()) {
			list.add(itr.next().getPersonId());
		}
		return list;
	

}
}