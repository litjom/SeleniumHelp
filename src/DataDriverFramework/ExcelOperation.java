package DataDriverFramework;

public class ExcelOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Xls_Reader reader = new Xls_Reader("C:\\Users\\LITTIN JOMON\\workspace\\selenium tutorial\\src\\DataDriverFramework\\Automation PracticePart2.xlsx");
		
		//Adding sheet to Excel
		reader.addSheet("HomePage");
		
		//Check if the sheet exist
		//If it does not exist add it
		if(!reader.isSheetExist("HomePage")){
			reader.addSheet("HomePage");
		} 
		
		int columncount =reader.getColumnCount("Sheet1");
		System.out.println("total columns"+columncount);
		//Total clumn number
		
		
		reader.getCellRowNum("Sheet1", "firstname", "Littin");
		//it will give you row number of the value 
	}

}
