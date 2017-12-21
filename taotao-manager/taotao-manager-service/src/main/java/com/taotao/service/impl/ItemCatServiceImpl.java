package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.TreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemCatExample.Criteria;
import com.taotao.service.ItemCatService;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月20日 下午3:41:02 
* 类说明 
*/
@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	private TbItemCatMapper itemCatMapper;
	
	@Override
	public List<TreeNode> getItemCatList(long parentId) {
		TbItemCatExample example=new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		
		List<TreeNode> resultList=new ArrayList<>();
		for(TbItemCat item:list){
			TreeNode node=new TreeNode(item.getId(), item.getName(), item.getIsParent()?"closed":"open");
			resultList.add(node);
		}
		return resultList;
	}

}
