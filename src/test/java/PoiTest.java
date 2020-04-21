import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class PoiTest {


    @Test
    public void PoiTest() throws IOException {
        Workbook workbook;
        Sheet sheet;

        Iterator<Sheet> sheets;
        HashMap map;
        HashMap<String,ArrayList> sheetMap;
        ArrayList list=null;
        InputStream in = new FileInputStream("F:\\IDEpj\\seleniumTestNG\\src\\main\\resources\\api.xlsx");
        workbook = new XSSFWorkbook(in);
        sheets = workbook.iterator();
        in.close();
        while (sheets.hasNext()) {
            int size = 1;
            sheet = sheets.next();
            sheetMap = new HashMap();
            for (Row row : sheet) {
                map = new HashMap();
                list = new ArrayList();
                if (size != 1) {
                    for (Cell cell : row) {
                        int a = cell.getColumnIndex();
                        map.put(sheet.getRow(0).getCell(a), row.getCell(a));
                    }
                    list.add(map);
                }
                size = 2;
            }
            sheetMap.put(sheet.getSheetName(), list);
        }

    }
}
