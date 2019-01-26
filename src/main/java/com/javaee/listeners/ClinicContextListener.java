package com.javaee.listeners;

import com.javaee.config.DBManager;
import com.javaee.config.HibernateUtil;
import org.hibernate.SessionFactory;

import javax.security.auth.login.Configuration;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ClinicContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
//        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        DBManager.getManager().createEntityManagerFactory();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        DBManager.getManager().closeEntityManagerFactory();
    }
}
