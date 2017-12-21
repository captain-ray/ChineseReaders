package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.TreeNode;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月20日 下午3:39:13 
* 类说明 
*/
public interface ItemCatService {
	
	List<TreeNode> getItemCatList(long parentId);
}
