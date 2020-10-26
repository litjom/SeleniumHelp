package TestngConcepts;

import java.util.ArrayList;

import DataDriverFramework.Xls_Reader;


public class DataProviderGetTestData {

	
	static Xls_Reader reader;
	
	
	public static ArrayList<Object[]> getTestData(){
		
		ArrayList<Object[]> myData =new ArrayList<Object[]>();
		try{
			reader = new Xls_Reader("C:\\Users\\LITTIN JOMON\\workspace\\selenium tutorial\\src\\TestngConcepts\\Automation Practice.xlsx");
		}catch(Exception e){
			e.printStackTrace();
		}
			for( int rowNum=2;rowNum<=reader.getRowCount("RedTestData");rowNum++){
				                         //Sheetname,column,rownum
				String firstName =reader.getCellData("Sheet1,","firstname",rowNum);
				String lastName =reader.getCellData("Sheet1,","lastname",rowNum);
				String EmailID =reader.getCellData("Sheet1,","Emailid",rowNum);
				String Password =reader.getCellData("Sheet1,","password",rowNum);
			
	//On object arrya or simple array you can store diff data types
	Object ob[]={firstName,lastName,EmailID,Password};
	//Now we are adding the object array to array list
	myData.add(ob);
	
			
			}
			return myData;
		}
		
		
	}

