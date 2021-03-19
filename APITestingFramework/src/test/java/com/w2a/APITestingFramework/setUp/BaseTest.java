package com.w2a.APITestingFramework.setUp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.w2a.APITestingFramework.utilities.ExcelReader;

import io.restassured.RestAssured;

public class BaseTest 
{
	
	public Properties config=new Properties();
	private FileInputStream fis;
	public static ExcelReader excel=new ExcelReader(".\\src\\test\\resources\\Excel\\testdata.xlsx");

	@BeforeSuite
	public void setUp() throws Throwable
	{
		fis=new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
		config.load(fis);
		
		RestAssured.baseURI=config.getProperty("baseURI");
		RestAssured.basePath=config.getProperty("basePath");
	}
	
	@AfterSuite
	public void tearDown()
	{
		
	}
}
