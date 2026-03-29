package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromDataProvider {
	@DataProvider(name="SampleData")
	Object[][]getdata(){
		return new Object[][] {
			{"Browser","chrome","1"},
			{"Username","Admin","2"},
			{"password","admin123","3"}
	};
	}
	@DataProvider(name="SampleData1")
	Object[][]getInfo(){
		return new Object[][] {
			{"Browser","firefox","1"},
			{"Username","user","2"},
			{"password","user123","3"}
	};
	}
	@Test(dataProvider = "SampleData")
	public void readingFromProvider(String key,String value) {
		System.out.println("Key= "+key +" Value= " +value);
	}
	
}
