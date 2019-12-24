package com.hcl.emp;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd="insert into employ values(?,?,?,?,?)";
		jt.update(cmd,new Object[]{7777,
				                   "pravallika",
				                   "java",
				                   "programmer",
				                   585566});
		System.out.println("***Record inserted***");
		}         
	}











