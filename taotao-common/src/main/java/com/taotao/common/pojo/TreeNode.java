package com.taotao.common.pojo;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月20日 下午3:37:43 
* 类说明 
*/
public class TreeNode {
	private long id;
	private String text;
	private String state;
	public TreeNode(long id, String text, String state) {
		super();
		this.id = id;
		this.text = text;
		this.state = state;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
