package com.taotao.controller;



import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月20日 下午2:12:59 
* 类说明 
*/

public class TestPageHelper {

	@Test
	public void testPageHelper(){
		//create a Spring container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		
		//get Mapper agent from Spring container
		TbItemMapper mapper=applicationContext.getBean(TbItemMapper.class);
		
		TbItemExample example=new TbItemExample();
		PageHelper.startPage(2, 10);
		List<TbItem> list = mapper.selectByExample(example);
		
		for(TbItem item:list){
			System.out.println(item.getTitle());
		}
		
		PageInfo<TbItem> pageInfo=new PageInfo<>(list);
		long total=pageInfo.getTotal();
		System.out.println("共有商品:"+total);
	}
	
}
