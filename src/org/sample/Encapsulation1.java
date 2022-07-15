package org.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Encapsulation1 {

	public static void main(String[] args) {

		Encapsulation e1 = new Encapsulation();

		e1.setAge(21);
		e1.setName("ranjith");
		e1.setPh(123795837789l);

		Encapsulation e2 = new Encapsulation();

		e2.setAge(24);
		e2.setName("rocky");
		e2.setPh(378687268724387248l);

		Encapsulation e3 = new Encapsulation();

		e3.setAge(45);
		e3.setName("randy");
		e3.setPh(873638767326376l);

		Map<Integer, Encapsulation> m = new HashMap<>();

		m.put(1, e1);
		m.put(2, e2);
		m.put(3, e3);

		Set<Entry<Integer, Encapsulation>> ent = m.entrySet();

		for (Entry<Integer, Encapsulation> e : ent) {

			System.out.println("employeedetails");

			System.out.println("age is" + e.getValue().getAge());
			System.out.println("name is " + e.getValue().getName());
			System.out.println("phno is " + e.getValue().getPh());

		}

	}

}
