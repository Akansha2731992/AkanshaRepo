package Testing.UST;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class ClassTwoTest {

	static int identity;
	
	static String accessToken;
	
	String root = System.getProperty("user.dir");

	
	@Test
	public void uploadTest1()
	{
		RestAssured.baseURI = "http://petstore.swagger.io";
		RestAssured.basePath= "/v2";
		String endPoint = "/pet/52/uploadImage";
		File fileName = new File(root+ "\\src\\test\\resources\\testdata\\user.json");
		Response res = RestAssured.given().log().all().formParam("additionalMetadata", "testing the file").multiPart(fileName).post(endPoint);
	    res.prettyPrint();
	    res.then().log().all();
	}
}
