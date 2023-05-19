package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.CommonDataSource;
import javax.xml.crypto.Data;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	/**
	 * this is a generic method for reading the data from propertry file
	 * @throws IOException 
	 * 
	 * 
	 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p= new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
	public String getExcelData(String Sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
}
