package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collection.model.School;

public class SchoolTest {

	private static School vivekananda;
	private static School gouthm;
	private static School donBosco;

	@Before
	public void setUp() {
		vivekananda = new School("vivekananda", "Tiruvuru", "Krishna", 2);
		gouthm = new School("gouthm", "Vijayawada", "Krishna", 5);
		donBosco = new School("donBosco", "Vijayawada", "Krishna", 8);
	}

	@Test
	public void testSchooleAcceptingDuplicateValues() {
		ArrayList<School> school = new ArrayList<>();
		school.add(vivekananda);
		school.add(gouthm);
		school.add(donBosco);
		school.add(vivekananda);

		Iterator<School> it = school.iterator();

		assertEquals(vivekananda, it.next());
		assertEquals(gouthm, it.next());
		assertEquals(donBosco, it.next());
	}

	@Test
	public void testSchoolNotAcceptingDuplicateValues() {
		HashSet<School> school = new HashSet<>();
		school.add(vivekananda);
		school.add(gouthm);
		school.add(donBosco);
		assertEquals(3, school.size());

	}

}
