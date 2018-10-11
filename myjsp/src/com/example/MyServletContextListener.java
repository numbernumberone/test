package com.example;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by wr on 2018/10/11.
 */
public class MyServletContextListener implements ServletContextListener {


    public void contextInitialized(ServletContextEvent event){
        ServletContext sc = event.getServletContext();
        String dogBreed = sc.getInitParameter("breed");
        Dog d  = new Dog(dogBreed);
        sc.setAttribute("dog",d);

    }

    @Override
    public void contextDestroyed(ServletContextEvent enent) {

    }




}
