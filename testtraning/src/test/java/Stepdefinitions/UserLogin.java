package Stepdefinitions;

import org.junit.Test;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserLogin {
	Response response;

	@Given("User is at the login page")
	public void login() {
		RestAssured.baseURI = "https://petstore.swagger.io/";
		RestAssured.basePath = "/v2";
	}

	@When("User login with username {string} and password {string}")
	public void enterCredentials(String username, String pass) {

		response = RestAssured.given().log().all().queryParam("username", username).queryParam("password",pass)
				.get("/user/login");
		response.prettyPrint();		
	}

	@Then("verify the status code is {int}")
	public void verifyResponse(int status) {
		Assert.assertEquals(response.getStatusCode(), status);
	}
}
