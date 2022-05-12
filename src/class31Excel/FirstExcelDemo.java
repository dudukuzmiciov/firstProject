package class31Excel;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class FirstExcelDemo {
    public static void main(String[] args) throws IOException {
        String path="/Users/danacuzmiciov/Desktop/Excel Apachi Poi/First intellij project.xlsx";
        FileInputStream fileImputStream= new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileImputStream);
        Sheet sheet =xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.getRow(0);
        System.out.println(row.getCell(0));
    }
}
