package com.sasvi.account.servicing;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTest {

	@BeforeAll
	public static void setup() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	}

	@Test
	public void getRequest() {
		RequestSpecification specification = RestAssured.given();
		Response response = given().contentType(ContentType.JSON).when().get("/posts").then().extract().response();

//		Assert.assertEquals(200, response.statusCode());
//		Assertions.assertEquals("qui est esse", response.jsonPath().getString("title[1]"));
	}

}
