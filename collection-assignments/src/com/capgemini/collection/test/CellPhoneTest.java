package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collection.model.CellPhone;

public class CellPhoneTest {

	private static CellPhone redmi;
	private static CellPhone honor;
	private static CellPhone vivo;

	@Before
	public void setUp() {
		redmi = new CellPhone("Redmi", "Note5", "Camera was good", "Android", 10000);
		honor = new CellPhone("Honor", "7x", "battery was good", "Android", 0);
		vivo = new CellPhone("vivo", "V15", "looking good", "Android", 0);
	}

	@Test
	public void testCellPhoneAcceptingDuplicateValues() {
		ArrayList<CellPhone> cellPhone = new ArrayList<>();
		cellPhone.add(redmi);
		cellPhone.add(honor);
		cellPhone.add(vivo);
		cellPhone.add(redmi);

		Iterator<CellPhone> it = cellPhone.iterator();

		assertEquals(redmi, it.next());
		assertEquals(honor, it.next());
		assertEquals(vivo, it.next());
	}

	@Test
	public void testCellPhoneNotAcceptingDuplicateValues() {
		HashSet<CellPhone> cellPhone = new HashSet<>();
		cellPhone.add(redmi);
		cellPhone.add(honor);
		cellPhone.add(vivo);
		assertEquals(3, cellPhone.size());

	}
}
