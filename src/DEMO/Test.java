package DEMO;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test {

	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
	RequestSpecification b1 = RestAssured.given();
	Response res = b1.request(Method.GET,"/api/users?page=2");
	
	System.out.println(res.asString());
	System.out.println(res.statusCode());
	System.out.println(res.statusLine());
	System.out.println(res.getTime());
	}

}
