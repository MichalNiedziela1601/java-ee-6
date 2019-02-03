package com.javaee.listeners;

import com.javaee.config.DBManager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ClinicContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        DBManager.getManager().createEntityManagerFactory();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        DBManager.getManager().closeEntityManagerFactory();
    }
}
