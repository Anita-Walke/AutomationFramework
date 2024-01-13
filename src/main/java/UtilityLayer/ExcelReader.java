package UtilityLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static XSSFWorkbook workbook;
	public ExcelReader(String path) throws IOException
	{
		FileInputStream fis=new FileInputStream(new File(path));
		 workbook=new XSSFWorkbook(fis);
	}
	public  int getTotlaRowCount(int sheetIndex)
	{
		return workbook.getSheetAt(sheetIndex).getLastRowNum()+1;
		
	}
	public int getTotalCellCout(int sheetIndex)
	{
		return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}
	public Object getSpecificSheetData(int sheetIndex,int row,int col)
	{
		XSSFCell cells=workbook.getSheetAt(sheetIndex).getRow(row).getCell(col);
		
		if(cells==null)
		{
			return "";
		}
		else
		{
			if(cells.getCellType()==XSSFCell.CELL_TYPE_STRING)
			{
				return cells.getStringCellValue();
			}
			else if(cells.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
			{
				return cells.getRawValue();
			}
			else if(cells.getCellType()==XSSFCell.CELL_TYPE_BOOLEAN)
			{
				return cells.getBooleanCellValue();
			}
			else if(cells.getCellType()==XSSFCell.CELL_TYPE_FORMULA)
			{
				return cells.getCellFormula();
			}
			else
			{
				return cells.getErrorCellString();
			}
		}
	}
	public Object[][] getAllData(int sheetIndex)
	{
		int r=getTotlaRowCount(sheetIndex);
		int c=getTotalCellCout(sheetIndex);
		
		Object data[][]=new Object[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				
				data[i][j]=getSpecificSheetData(sheetIndex, i, j);
				
			}
		}
		return data;
	}
}
