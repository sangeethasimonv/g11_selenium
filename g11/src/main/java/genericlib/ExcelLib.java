package genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	
	String filepath="";
	
	public String getExcelData(String sheetNAme, int ronNo, int colNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetNAme);
		Row row=sh.getRow(ronNo);
        String data=row.getCell(colNum).getStringCellValue();
		return data;		
	}
	
	public int rowCount(String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		int rcnt=sh.getLastRowNum()+1;
		return rcnt;		
	}

	@SuppressWarnings("deprecation")
	public void setExcelData(String sheetName, int rowNo,int colNo, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNo);
		Cell cell=row.createCell(colNo);
		cell.setCellType(cell.CELL_TYPE_STRING);
		FileOutputStream fos=new FileOutputStream(filepath);
		cell.setCellValue(data);
		wb.write(fos);
	}
	
}
