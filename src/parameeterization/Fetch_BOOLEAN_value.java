package parameeterization;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 

public class Fetch_BOOLEAN_value {
public static void main(String[] args) throws Throwable {
		
		//create object of file input stream class
		FileInputStream fis =new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\NOTES\\excell sheet for parameterization\\Book2.xlsx");
		//as HERE WE HAVE TO DECLARE COMPILE TIME EXCEPTION by using throws
		
		//use create meathod to open excell sheet
	boolean value = WorkbookFactory.create(fis).getSheet("sheet1").getRow(1).getCell(0).getBooleanCellValue();
	System.out.println(value);

}
}