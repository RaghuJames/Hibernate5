package com.hib.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("================TEST=====DESTROYED");

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
	/*	Connection con= null;
		try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
		con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Hibernate;integratedSecurity=false;","SA","Ncs@2017");  
		//here sonoo is database name, root is username and password  
		}catch(Exception e){ System.out.println(e);
		}  finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}*/
		} 

		// TODO Auto-generated method stub

	

}
