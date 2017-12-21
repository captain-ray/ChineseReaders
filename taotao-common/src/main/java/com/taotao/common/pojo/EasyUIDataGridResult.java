package com.taotao.common.pojo;

import java.util.List;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月20日 下午2:35:19 
* 类说明 
*/
public class EasyUIDataGridResult {
	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
}
