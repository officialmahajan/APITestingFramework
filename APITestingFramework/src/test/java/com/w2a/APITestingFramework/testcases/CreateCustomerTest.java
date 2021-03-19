package com.w2a.APITestingFramework.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ctc.wstx.util.DataUtil;
import com.w2a.APITestingFramework.setUp.BaseTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateCustomerTest extends BaseTest
{
@Test(dataProviderClass=DataUtil.class,dataProvider="data")
public void validateCreateCustomerWithValidSecretKey(String name, String email, String description)
{
	
	
//	Response response=given().auth().basic(config.getProperty("validSecretKey"),"")
//			.formParam("email",email)
//			.formParam("description",description)
//			.post(config.getProperty("customerAPIEndpoint"));
//	response.prettyPrint();
//	System.out.println(response.statusCode());
//	Assert.assertEquals(response.statusCode(),200);
	

}

@Test
public void validateCreateCustomerWithInValidSecretKey()
{
	

//	Response response=given().auth().basic(config.getProperty("invalidSecretKey"),"")
//			.formParam("email","trainer@way2Automation.com")
//			.formParam("description","creating the first customer in the API")
//			.post(config.getProperty("customerAPIEndpoint"));
//	response.prettyPrint();
//	System.out.println(response.statusCode());
//	Assert.assertEquals(response.statusCode(),200);
//	
}


}









