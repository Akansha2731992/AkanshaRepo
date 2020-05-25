package Stepdefinitions;

import java.io.IOException;

import Testing.UST.ReadDataFromExcel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ReadExcelData {

	@Given("user is on home page")
	public void given() {
		System.out.println("%$$$$$$$$&&&&");
	}

	@When("user login in application with credentials given in excel")
	public void when() {
		ReadDataFromExcel rd = new ReadDataFromExcel();
		try {
			rd.readData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
