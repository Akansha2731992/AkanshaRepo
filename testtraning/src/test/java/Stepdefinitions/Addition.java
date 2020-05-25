package Stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Addition {
	static int a;
	static int b;
	static int result;
	
	@Given("I have two number {int} and {int}.")
	public void givenValuesToNumbers(int first,int second)
	{
		a=first;
		b=second;
		System.out.println("Assigned values to numbers.");
	}
	
	@When("I add them")
	public void  addingTheNum()
	{
		result = a +b;
		System.out.println("Added them");
	}
	
	@Then("Result should be {int}")
	public void verifyResult(int res)
	{
	Assert.assertEquals(res, result);
	System.out.println("verified.");
	}

}
