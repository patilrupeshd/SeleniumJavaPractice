package Practice;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadXsxl {
    public static void main(String[] args) {
        File exstigngFile = new File(System.getProperty("user.home") + "/Downloads/customers-100000.xlsx");
        Map<Integer,Map<String,String>> excelData = readxlsx(exstigngFile.toString(),"customers-100000");
        //for (Map.Entry<Integer,Map<String,String>> entry: excelData.entrySet())
        //{
    //        System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
        //}
        printRowsForContry(excelData,"Panama");

    }
    public static void printRowsForContry(Map<Integer,Map<String,String>> map , String Country)
    {
        System.out.println("Row for country " + Country);
        int count =0;
        for(Map.Entry<Integer,Map<String,String>> entry : map.entrySet())
        {
            Map<String,String> rowdata =entry.getValue();
            if(rowdata.containsKey("Country") && rowdata.get("Country").equals(Country))
            {
                System.out.println("Row " + entry.getKey() + " : " + rowdata);
                count++;
            }
        }
        System.out.println("Total row : " + count);
    }

    private static Map<Integer,Map<String,String>> readxlsx(String filePath, String sheetName)
    {
        Map<Integer,Map<String,String>> dataMap = new HashMap<>();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            Workbook wb = WorkbookFactory.create(fis);
            Sheet sheet = wb.getSheet(sheetName);

            if(sheet==null)
            {
                throw new IllegalArgumentException("Sheet " + sheetName + " not found in the workbook");
            }
            Row headerRow = sheet.getRow(0);
            int lastCellNum = headerRow.getLastCellNum();

            for(int i = 1; i<=sheet.getLastRowNum();i++ )
            {
                Row row = sheet.getRow(i);
                Map<String,String> rowData = new HashMap<>();
                for(int j = 0;j<lastCellNum;j++)
                {
                    Cell headerCell = headerRow.getCell(j);
                    Cell cell = row.getCell(j);


                    String columnName = headerCell.getStringCellValue();

                    String cellValue = "";

                    if(cell != null)
                    {
                        cellValue = getCellValueAsString(cell);

                    }
                    rowData.put(columnName,cellValue);
                }
                dataMap.put(i,rowData);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return dataMap;
    }

    public static String getCellValueAsString(Cell cell)
    {
        if(cell.getCellType()==CellType.STRING)
        {
            return cell.getStringCellValue();
        } else if (cell.getCellType()==CellType.BOOLEAN) {
            return String.valueOf(cell.getBooleanCellValue());
        } else if (cell.getCellType()==CellType.NUMERIC) {
            return String.valueOf(cell.getNumericCellValue());
        } else if (cell.getCellType()==CellType.BLANK) {
            return "";
        } else if (cell.getCellType()==CellType.FORMULA) {
            return cell.getCellFormula();
        } else
            return "<UNKNOWN>";
    }
}
