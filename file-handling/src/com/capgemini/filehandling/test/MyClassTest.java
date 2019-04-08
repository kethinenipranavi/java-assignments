package com.capgemini.filehandling.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.filehandling.model.MyClass;

public class MyClassTest {

	ArrayList<MyClass> customer;
	MyClass class1;

	@Before
	public void setUp() {
		 class1 = new MyClass(1, "pranavi", 21);
		MyClass class2 = new MyClass(2, "pradeepa", 19);
		MyClass class3 = new MyClass(3, "sowmya", 22);
		MyClass class4 = new MyClass(4, "sandeepa", 20);
		MyClass class5 = new MyClass(5, "karhika", 10);

		customer = new ArrayList<MyClass>();
		customer.add(class1);
		customer.add(class2);
		customer.add(class3);
		customer.add(class4);
		customer.add(class5);
	}

	@Test
	public void testForSerialization() throws IOException {
		MyClass mclass = new MyClass();
		assertTrue(mclass.serialization("Myclass.serialization", customer));

	}

	@Test
	public void testForDeSerialization() throws IOException, ClassNotFoundException {
		MyClass mclass = new MyClass();
		ArrayList<MyClass> ar = (ArrayList<MyClass>) mclass.deSerialization("myclass.serialization");

		Iterator iterator = ar.iterator();

		assertEquals(class1, iterator.next());

	}

}
