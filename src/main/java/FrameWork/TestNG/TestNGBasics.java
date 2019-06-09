package FrameWork.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeSuite
	public void restsuite() {
		System.out.println(" 1. BeforeSuite");
	}

	@BeforeTest
	public void tesTCase() {
		System.out.println(" 2.BeforeTest");
	}

	@BeforeClass
	public void testClassse() {
		System.out.println("3.BeforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("4.BeforeMethod");
	}

	@Test
	public void testCase() {
		System.out.println("5.Test");

	
 }
	//****************************************
	
	@AfterMethod
	public void afterMethod() {
		
	}
	
	
	@AfterSuite
	public void Aftersuite() {
		System.out.println(" 1. BeforeSuite");
	}

	@AfterTest
	public void AfterCase() {
		System.out.println(" 2.BeforeTest");
	}

	@AfterClass
	public void AfterClassse() {
		System.out.println("3.BeforeClass");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("4.AfterMethod");
	}

	@Test
	public void Aftercase() {
		System.out.println("5.Test");

	
 }
	
	
}
