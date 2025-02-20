package com.lucasMotta.ESTOQUEFOX.services;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.lucasMotta.ESTOQUEFOX.models.Pedido;

@Service
public class ExcelService {

    public byte[] generateExcel(List<Pedido> pedidos) throws IOException {
        
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Pedidos");


        Row headerRow = sheet.createRow(0);
        int colNum = 0;


        Field[] fields = Pedido.class.getDeclaredFields();
        for (Field field : fields) {
            Cell cell = headerRow.createCell(colNum++);
            cell.setCellValue(field.getName());
        }


        int rowNum = 1;
        for (Pedido pedido : pedidos) {
            Row row = sheet.createRow(rowNum++);
            colNum = 0;

            for (Field field : fields) {
                field.setAccessible(true); 
                Cell cell = row.createCell(colNum++);
                try {
                    Object value = field.get(pedido);
                    if (value != null) {
                        if (value instanceof Number) {
                            cell.setCellValue(((Number) value).doubleValue());
                        } else if (value instanceof Boolean) {
                            cell.setCellValue((Boolean) value);
                        } else {
                            cell.setCellValue(value.toString());
                        }
                    } else {
                        cell.setCellValue(""); 
                    }
                } catch (IllegalAccessException e) {
                    cell.setCellValue("Erro ao acessar valor");
                }
            }
        }

      
        for (int i = 0; i < fields.length; i++) {
            sheet.autoSizeColumn(i);
        }

 
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        workbook.write(outputStream);
        workbook.close();

        return outputStream.toByteArray();
    }
}