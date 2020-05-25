package Testing.UST;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class ReadJsonFromFile {

	@Test
	public void readJson() {
		JSONParser jsonParser = new JSONParser();
		String rootPath = System.getProperty("user.dir");
		String completepath = rootPath + "\\src\\test\\resources\\testData\\user.json";

		// filereader reads the file in byte format

		try (FileReader reader = new FileReader(completepath)) {
			// Read JSON file			
			JSONObject employeeInfo = (JSONObject) jsonParser.parse(reader);;
			System.out.println(employeeInfo.get("id"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
