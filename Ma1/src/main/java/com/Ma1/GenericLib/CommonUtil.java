package com.Ma1.GenericLib;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class CommonUtil 
{
	String path = "./src/test/resources/Common.properties";
	
	public Properties getpropertyObj() throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Properties pob = new Properties();
		pob.load(fis);
		return pob;
	}

}
