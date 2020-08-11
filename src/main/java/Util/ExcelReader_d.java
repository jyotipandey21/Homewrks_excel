package Util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader_d {

	public String path;
	public FileInputStream fis = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;

	public void inpudata(String path) {
		this.path=path;
	
	try {
		fis=new FileInputStream(path);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheetAt(0);
		
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
public String[][] getalldata(String sheetname){
	int index=workbook.getSheetIndex(sheetname);
	int col=0;
	sheet=workbook.getSheetAt(index);
	int row=sheet.getPhysicalNumberOfRows();
	int colnum=sheet.getRow(0).getPhysicalNumberOfCells();
	String [][] data=new String[row-1][colnum];
	for(int i=1;i<=row;i++) {
	for(int j=0;j<=colnum;j++) {
	
	data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			
}
}
	return data;
	
}
}