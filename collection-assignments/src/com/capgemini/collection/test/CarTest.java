package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collection.model.Car;

public class CarTest {

	private  Car bmw;
	private  Car audi;
	private  Car shiftDesire;

	@Before
	public void setUp() {
		bmw = new Car("Chaina", "BMWX3", 2019, 3500000);
		audi = new Car("US", "AUDIA3", 2019, 3500000);
		shiftDesire = new Car("India", "ix20", 2018, 900000);
	}

	@Test
	public void testCarAcceptingDuplicateValues() {
		ArrayList<Car> car = new ArrayList<>();
		car.add(bmw);
		car.add(audi);
		car.add(shiftDesire);
		car.add(bmw);

		Iterator<Car> it = car.iterator();

		assertEquals(bmw, it.next());
		assertEquals(audi, it.next());
		assertEquals(shiftDesire, it.next());
	}

	@Test
	public void testCarNotAcceptingDuplicateValues() {
		HashSet<Car> car = new HashSet<>();
		car.add(bmw);
		car.add(audi);
		car.add(shiftDesire);

		assertEquals(3, car.size());

	}
	@Test
	public void testCarSortedBasedOnMake() {
		TreeSet<Car> cars = new TreeSet<>();
		cars.add(bmw);
		cars.add(audi);
		cars.add(shiftDesire);
		Iterator<Car> it = cars.iterator();
		assertEquals(bmw, it.next());
		assertEquals(shiftDesire, it.next());
		assertEquals(audi, it.next());
		
		
		
	}

}
