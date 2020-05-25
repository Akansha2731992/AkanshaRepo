package Testing.UST;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class ReadDataFromCSV {

	@Test
	public void readCsvFile() {
//		File file = new File("C:\\Users\\140833\\Desktop\\CSV file.csv");
//		Scanner sc = new Scanner(file);
//		sc.useDelimiter(",");
//		while (sc.hasNext()) {
//			System.out.print(sc.next()+ " ");
//		}
//		sc.close();
		String line;
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(new File("C:\\Users\\140833\\Desktop\\CSV file.csv")));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				for (int i = 0; i < data.length; i++) {
					System.out.print(data[i] + " ");
				}
				System.out.println();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
