package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collection.model.Car;

public class CarTest {

	private static Car bmwCar;
	private static Car audiCar;
	private static Car shiftDesireCar;

	@Before
	public void setUp(){
		bmwCar = new Car("India","BMWX3",2019,3500000);
		audiCar = new Car("India","AUDIA3",2019,3500000);
		shiftDesireCar = new Car("India","ix20",2018,900000);
	}
	@Test
	public void testCarAcceptingDuplicateValues() {
		ArrayList<Car> car= new ArrayList<>();
		car.add(bmwCar);
		car.add(audiCar);
		car.add(shiftDesireCar);
		car.add(bmwCar);
		
		Iterator<Car> it=car.iterator();
			
		assertEquals(bmwCar,it.next());
		assertEquals(audiCar, it.next());
		assertEquals(shiftDesireCar, it.next());
	}
	
	@Test
	public void testCarNotAcceptingDuplicateValues() {
		HashSet<Car> car= new HashSet<>();
		car.add(bmwCar);
		car.add(audiCar);
		car.add(shiftDesireCar);
		//Car.add(bmwCar);
		assertEquals(3,car.size());

}
}
