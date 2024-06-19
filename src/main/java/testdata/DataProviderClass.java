package testdata;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	
	@DataProvider
	public Object[][] booksDataProvider(){
		
		Object[][] data = new Object[5][2]; // sunt 5 carti cu 2 atribute - numele si poza pentru fiecare
		
		data[0][0]= "The forest" ; //numele cartii
		data[0][1]= "book2.jpg"; //poza
		
		data[1][0]= "Life in the garden" ;
		data[1][1]= "book4.jpg";
		
		data[2][0]= "The long road to the deep Silence" ;
		data[2][1]= "book5.jpg";
		
		data[3][0]= "It’s a really strange story" ;
		data[3][1]= "book12.jpg";
		
		data[4][0]= "Storm";
		data[4][1]= "books7.jpg";
		
		return data;
		
	}

}
