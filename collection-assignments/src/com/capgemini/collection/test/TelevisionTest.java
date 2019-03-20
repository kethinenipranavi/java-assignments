package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collection.model.Television;

public class TelevisionTest {

	private static Television lG;
	private static Television samsung;
	private static Television philips;
	
	@Before
	public void setUp(){
		lG = new Television("LG","LCD", false,25000);
		samsung = new Television("SAMSUNG","LED", false, 15000 );
		philips = new Television("PHILIPS","plasma",true,90000);
	}
	@Test
	public void testTelevisionAcceptingDuplicateValues() {
		ArrayList<Television> television= new ArrayList<>();
		television.add(lG);
		television.add(samsung);
		television.add(philips);
		television.add(lG);
		
		Iterator<Television> it=television.iterator();
			
		assertEquals(lG,it.next());
		assertEquals(samsung, it.next());
		assertEquals(philips, it.next());
	}
	
	@Test
	public void testTelevisionNotAcceptingDuplicateValues() {
		HashSet<Television> television= new HashSet<>();
		television.add(lG);
		television.add(samsung);
		television.add(philips);
		//Television.add(lG);
		assertEquals(3,television.size());

}
	
	


}
