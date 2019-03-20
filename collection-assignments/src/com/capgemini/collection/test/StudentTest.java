package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.Student;

public class StudentTest {

	private static Student anna;
	private static Student paul;
	private static Student don;

	@BeforeClass
	public static void setUp() {
		anna = new Student(101, "anna");
		paul = new Student(104, "paul");
		don = new Student(108, "don");
	}

	@Test
	public void testStudenteDetailsAddedGivenFormat() {
		ArrayList<Student> student = new ArrayList<>();
		student.add(anna);
		student.add(paul);
		student.add(don);
		

		Iterator<Student> it = student.iterator();

		assertEquals(anna, it.next());
		assertEquals(paul, it.next());
		assertEquals(don, it.next());
	}
	@Test
	public void toTestDetailsOfStudentInInsertion()
	{
		HashSet<Student> student=new HashSet<>();
		student.add(anna);
		student.add(paul);
		student.add(don);
		
		assertEquals(3,student.size());
	}
	@Test
	public void testTheStudentDetailsAreNaturalOrder()
	{
		TreeSet<Student> student=new TreeSet<>();
		student.add(anna);
		student.add(paul);
		student.add(don);
		
		Iterator<Student> it=student.iterator();
		assertEquals(anna,it.next());
		assertEquals(paul,it.next());
		assertEquals(don,it.next());
		
		
	}
	
	@Test 
	public void toCheckMapStoreTheStudentDetails()
	{
		Map<String,String> map=new HashMap<String,String>();
		map.put("anna", "mango");
		map.put("paul", "grapes");
		map.put("don","apple");
		
		Collection<String> keys=map.keySet();
		assertEquals(3,keys.size());
		
		
		Collection<String> values=map.keySet();
		assertEquals(3,values.size());
		assertEquals("mango",map.get("anna"));
		assertEquals("grapes",map.get("paul"));
		assertEquals("apple",map.get("don"));
		
	}

	

}
