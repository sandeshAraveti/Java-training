package hcl.DepartmentInsert;



import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("applicationContexst.xml");
		 DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
			JdbcTemplate jt=new JdbcTemplate(dataSource);
			String cmd="insert into Department values(?,?,?,?,?)";
			jt.update(cmd,new Object[]{52314,
	                   "pravallika",
	                   "bangl",
	                   "chennai",
	                   });
System.out.println("***Record inserted***");


	}

}
