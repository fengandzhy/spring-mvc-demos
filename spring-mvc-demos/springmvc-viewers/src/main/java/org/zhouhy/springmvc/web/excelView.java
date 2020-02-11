package org.zhouhy.springmvc.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;
import org.zhouhy.springmvc.beans.User;

public class excelView extends AbstractXlsxView{

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
		
		
	}

}
