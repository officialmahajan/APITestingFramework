package com.w2a.APITestingFramework.utilities;

import org.testng.annotations.DataProvider;

import com.w2a.APITestingFramework.setUp.BaseTest;

public class DataUtil extends BaseTest
{
	@DataProvider(name="data")
	public Object[][] getData()
	{
		String sheetname="validateCreateCustomerAPI";
		int rows=excel.getRowCount("sheetname");
		int cols=excel.getColumnCount("sheetname");
		System.out.println("The no.of rows"+rows +"the no. of columns "+ cols);
		Object[][] data= new Object[rows-1][cols];
		
//		data[0][0]=excel.getCellData(sheetname, 0, 2);
//		data[0][1]=excel.getCellData(sheetname, 1, 2);
//		data[0][2]=excel.getCellData(sheetname, 2, 2);
		
		for(int rowNum=2;rowNum<=rows;rowNum++)
		{
			for(int colNum=0;colNum<cols;colNum++)
			{
				data[rowNum-2][colNum]=excel.getCellData(sheetname, colNum,rowNum);
			}
			
		}
		
		return data;
	}

}
