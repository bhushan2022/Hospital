package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	public static String getDataFromPropertiesFile(String key) throws IOException
	{
		Properties prop=new Properties(); // create object of propertis class
		FileInputStream myFile= new FileInputStream("C:\\Users\\BHUSHAN JADHAV\\eclipse-workspace\\ApolloHospital\\src\\main\\resources\\Apl.properties");
         prop.load(myFile);
        String value = prop.getProperty(key);
        return value;
	
	}
}
