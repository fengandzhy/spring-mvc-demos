package org.zhouhy.springmvc.editor;

import java.beans.PropertyEditorSupport;


import org.springframework.util.StringUtils;
import org.zhouhy.springmvc.utils.NumberUtils;

public class CustomBigDecimalEditor extends PropertyEditorSupport{
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (StringUtils.isEmpty(text)) {
			setValue(null);
		}else {
			setValue(NumberUtils.getBigDecimal(text));
		}
	}
}
