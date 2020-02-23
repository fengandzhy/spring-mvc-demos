package org.zhouhy.springmvc.web;

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsxView;
import org.zhouhy.springmvc.beans.User;

@Component("excelView")
public class ExcelView extends AbstractXlsxView{

	private static final String EXCEL_NAME = "UserList.xlsx";
	private static final String ENCODING="UTF-8";
	private static final String CONTENT_TYPE="application/ms-excel";
	
	
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String fileName = EXCEL_NAME;
		response.setCharacterEncoding(ENCODING);
		response.setContentType(CONTENT_TYPE);
		response.setHeader("Content-Disposition", "inline;filename="+new String(fileName.getBytes(ENCODING)));
		
		List<User> users = (List<User>)model.get("userList");
		Sheet sheet = workbook.createSheet("basicInfo");
		
		Row headRow = sheet.createRow(0);
		headRow.createCell(0).setCellValue("ID");
		headRow.createCell(1).setCellValue("UserName");
		headRow.createCell(2).setCellValue("Password");
		headRow.createCell(3).setCellValue("Email");
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setAlignment(HorizontalAlignment.LEFT);
		Font font =  workbook.createFont();
		font.setColor(HSSFColorPredefined.RED.getIndex());
		cellStyle.setFont(font);
		
		int rowNumber = 1;
		for(User user:users) {
			Row row = sheet.createRow(rowNumber++);
			row.createCell(0).setCellValue(user.getId());
			row.createCell(1).setCellValue(user.getUsername());
			row.createCell(2).setCellValue(user.getPassword());
			row.createCell(3).setCellValue(user.getEmail());
		}
		
		OutputStream outputStream = response.getOutputStream();
		workbook.write(outputStream);
		outputStream.flush();
		outputStream.close();
	}

}
