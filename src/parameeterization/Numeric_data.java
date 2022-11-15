package parameeterization;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 

public class Numeric_data {
public static void main(String[] args) throws Throwable {
		
		//create object of file input stream class
		FileInputStream fis =new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\NOTES\\excell sheet for parameterization\\Book2.xlsx");
		//as HERE WE HAVE TO DECLARE COMPILE TIME EXCEPTION by using throws
		
		//use create meathod to open excell sheet
	double value = WorkbookFactory.create(fis).getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();
	System.out.println(value);

}
}