package com.quanglv.web.rest.publics;

import com.quanglv.service.ProductsService;
import com.quanglv.service.dto.ProductsDTO;
import com.quanglv.service.dto.ProductsSearchRequestDTO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "")
public class PublicProductsResource {

    @Autowired
    private ProductsService productsService;

    @Value("${file.templateDirectory}")
    private String templateDirectory;

    @PostMapping(value = "/products/search", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> search(@RequestBody ProductsSearchRequestDTO request) {
        return ResponseEntity.ok(productsService.search(request));
    }

    @GetMapping(value = "/excel")
    public ResponseEntity<List<ProductsDTO>> getAll() throws IOException {
        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Persons");
        sheet.setColumnWidth(0, 6000);
        sheet.setColumnWidth(1, 4000);

        Row header = sheet.createRow(0);

        CellStyle cellStyle = workbook.createCellStyle();
        Font cellFont = workbook.createFont();
        cellFont.setFontName("Times New Roman");
        cellStyle.setFillForegroundColor(IndexedColors.GREY_50_PERCENT.index);

        CellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        XSSFFont font = ((XSSFWorkbook) workbook).createFont();
        font.setFontName("Arial");
        font.setFontHeightInPoints((short) 16);
        font.setBold(true);
        headerStyle.setFont(font);

        Cell headerCell = header.createCell(0);
        headerCell.setCellValue("Name");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(1);
        headerCell.setCellValue("Age");
        headerCell.setCellStyle(headerStyle);
        CellStyle style = workbook.createCellStyle();
        style.setWrapText(true);
        for(int i = 1; i < 100000; i++){
            Row row = sheet.createRow(i + 1);
            Cell cell = row.createCell(0);
            cell.setCellValue("John Smith");
            cell.setCellStyle(style);

            cell = row.createCell(1);
            cell.setCellValue("Xin chào tất cả mọi người" + UUID.randomUUID().toString());
            cell.setCellStyle(style);
            cell = row.createCell(2);
            cell.setCellValue("Xin chào tất cả mọi người" + UUID.randomUUID().toString());
            cell.setCellStyle(style);
            cell = row.createCell(3);
            cell.setCellValue("Xin chào tất cả mọi người" + UUID.randomUUID().toString());
            cell.setCellStyle(style);
            cell = row.createCell(4);
            cell.setCellValue("Xin chào tất cả mọi người" + UUID.randomUUID().toString());
            cell.setCellStyle(style);
            cell = row.createCell(5);
            cell.setCellValue("Xin chào tất cả mọi người" + UUID.randomUUID().toString());
            cell.setCellStyle(style);
            cell = row.createCell(6);
            cell.setCellValue("Xin chào tất cả mọi người" + UUID.randomUUID().toString());
            cell.setCellStyle(style);
            cell = row.createCell(7);
            cell.setCellValue("Xin chào tất cả mọi người" + UUID.randomUUID().toString());
            cell.setCellStyle(style);
            cell = row.createCell(8);
            cell.setCellValue("Xin chào tất cả mọi người" + UUID.randomUUID().toString());
            cell.setCellStyle(style);
        }

        File currDir = new File("/file-stores/quanglv4");
        String path = currDir.getAbsolutePath();
        String fileLocation = path + "\\" +UUID.randomUUID().toString() +".xlsx";

        FileOutputStream outputStream = new FileOutputStream(fileLocation);
        workbook.write(outputStream);
        workbook.close();
        return null;
    }

    @GetMapping(value = "/a")
    public String hehe1(){
        return templateDirectory;
    }
}
