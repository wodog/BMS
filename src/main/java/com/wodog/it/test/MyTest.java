package com.wodog.it.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.wodog.it.dao.BmsUserMapper;
import com.wodog.it.model.BmsUser;
import com.wodog.it.model.BmsUserExample;

public class MyTest {

	public static void main(String[] args) {
		 
		String path = "spring/spring-jdbc.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(path);

		BmsUserMapper userMapper=ac.getBean(BmsUserMapper.class);
		System.out.println(userMapper);
//		BmsUser user=userMapper.selectByPrimaryKey("1");
//		System.out.println(user.getNickname());
		
		BmsUserExample bmsUserExample=new BmsUserExample();
//		bmsUserExample.createCriteria().andIdIsNotNull();
		
//		bmsUserExample.setOrderByClause("id desc");
//		System.out.println(bmsUserExample.getOrderByClause());
		List<BmsUser> listBmsUser =userMapper.selectByExample(new BmsUserExample());
		
		for(BmsUser u:listBmsUser){
			System.out.println(u.getNickname());
		}
	}
}
