package com.hib.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("================TEST=====DESTROYED");

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("================TEST=====Started");
		// TODO Auto-generated method stub

	}

}
