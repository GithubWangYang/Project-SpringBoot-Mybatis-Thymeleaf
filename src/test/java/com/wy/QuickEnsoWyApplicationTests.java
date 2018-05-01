package com.wy;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wy.dao.CountryMapper;
import com.wy.model.Country;

import tk.mybatis.mapper.entity.Example;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuickEnsoWyApplicationTests {
	
	@Autowired
	CountryMapper coutryMapper;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testSelect() throws Exception {
		Country country = coutryMapper.selectByPrimaryKey(1);
		System.out.println(JSON.toJSONString(country));
	}
	
	@Test
	public void testPageHelper() throws Exception {
		Example example=new Example(Country.class);
		PageHelper.startPage(2,1);
        List<Country> countries = coutryMapper.selectByExample(example);
        
        PageInfo<Country> pageInfo=new PageInfo<>(countries);
        System.out.println(pageInfo.getList());
	}

}
