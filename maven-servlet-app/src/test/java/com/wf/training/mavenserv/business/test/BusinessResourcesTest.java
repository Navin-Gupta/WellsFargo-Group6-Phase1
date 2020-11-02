package com.wf.training.mavenserv.business.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wf.training.mavenserv.business.BusinessResources;

public class BusinessResourcesTest {

	BusinessResources resource;
	
	@BeforeClass
	public void commonSetupOnce() {
		// this.resource = new BusinessResources();
	}
	
	@Before // method executed before every test case
	public void commonSetup() {
		this.resource = new BusinessResources();
	}
	
	@Test
	public void testCalculateSum() {
		// setup
		//BusinessResources resource = new BusinessResources();
		
		// invoke the resource under test
		int actualResult =  resource.calculateSum(new int[] {1, 2, 3});
		
		// Assert (test)
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
		// assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testCalculateSum_Empty() {
		// setup
		//BusinessResources resource = new BusinessResources();
		
		// invoke the resource under test
		int actualResult =  resource.calculateSum(new int[] {});
		
		// Assert (test)
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testCalculateSum_Single() {
		// setup
		//BusinessResources resource = new BusinessResources();
		
		// invoke the resource under test
		int actualResult =  resource.calculateSum(new int[] {5});
		
		// Assert (test)
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}
	
	@After  // executes after every test
	public void commonCleanUp() {
		
	}
	
	@AfterClass  // executes once after all test cases
	public void commonCleanUpOnce() {
		
	}
	
}
