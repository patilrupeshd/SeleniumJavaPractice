package Practice;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadExcelOne {

    public static void main(String[] args) {
        File file = new File(System.getProperty("user.home")+"/Downloads/customers-100000.xlsx");
        String sheetName = "customers-100000";
        Map<String,List<String>> dataMap = getExcel(file.toString(), sheetName);
        for(Map.Entry<String,List<String>> entry:dataMap.entrySet())
        {
            System.out.println("Key : " + entry.getKey() + " Value " + entry.getValue());
        }
    }

    public static Map<String, List<String>> getExcel(String filePath, String sheetName)
    {
         HashMap<String,List<String>> dataMap = new HashMap<>();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            Workbook wb = WorkbookFactory.create(fis);
            Sheet sheet = wb.getSheet(sheetName);

            if(sheet==null)
            {
                throw new RuntimeException(sheetName +" Is not present in the workbook");
            }
            int lastRowOfTheSheet = sheet.getLastRowNum();

            for (int i = 0;i<lastRowOfTheSheet;i++)
            {
                Row row = sheet.getRow(i);
                int lastCellOfTheRow = row.getLastCellNum();
                List<String> cellDataList = new ArrayList<>();
                for(int j = 1; j<lastCellOfTheRow;j++)
                {
                    Cell cell = row.getCell(j);
                    String cellValue ="";
                    if(cell!=null)
                    {
                        cellValue = getCellValueAsString(cell);
                    }
                    cellDataList.add(cellValue);
                }
                Cell key = row.getCell(0);
                String keyVAlue ="";
                if(key!=null)
                {
                    keyVAlue = getCellValueAsString(key);
                }
                dataMap.put(keyVAlue,cellDataList);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dataMap;
    }

    private static String getCellValueAsString(Cell cell) {
        if(cell.getCellType()==CellType.STRING)
        {
            return cell.getStringCellValue();
        } else if (cell.getCellType()==CellType.BOOLEAN) {
            return  String.valueOf(cell.getBooleanCellValue());
        }
        else if (cell.getCellType()==CellType.NUMERIC)
        {
            return String.valueOf(cell.getNumericCellValue());
        } else if (cell.getCellType()==CellType.BLANK) {
            return "";
        }else {
            return "<UNKNOWN>";
        }
    }
}
