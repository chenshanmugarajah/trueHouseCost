package com.chenshanmugarajah.truehousecost.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

@Service
public class CarInsuranceService {

	public CarInsuranceService() {
		// TODO Auto-generated constructor stub
	}
	
	public double getCarInsuranceAverage(String councilName) throws IOException {
		if (councilName == null || councilName.isEmpty()) {
			  throw new NullArgumentException();
		}
		HashMap<String, Double> map = getDataFromExcel();
		return map.get(councilName);
	}
	
	public HashMap<String, Double> getDataFromExcel() throws IOException {
		FileInputStream file = new FileInputStream(
	            "C:\\Users\\Chen\\Desktop\\insuranceData.xlsx");
	        XSSFWorkbook wb = new XSSFWorkbook(file);
	        XSSFSheet sh = wb.getSheet("Sheet1");
	        HashMap<String, Double> map = new HashMap<String, Double>();
	        for (int r = 0; r <= sh.getLastRowNum(); r++) {
	            String key = sh.getRow(r)
	                          .getCell(0)
	                          .getStringCellValue();
	            Double value = sh.getRow(r)
                        .getCell(1)
                        .getNumericCellValue();
	            map.put(key, value);
	        }
	        wb.close();
	        file.close();
	        return map;
	}

}
