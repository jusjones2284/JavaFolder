package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {
//        UserManager userManager = new UserManager();
//        System.out.println(userManager.getUserInfo());

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCouplingExample.xml");





//        UserDataProvider databaseProvider  = new UserDatabaseProvider();
//        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithNewDatabaseProvider");
//        System.out.println(userManagerWithDB.getUserInfo());

//        UserDataProvider webServiceProvider = new webServiceProvider();
        UserManager userManagerWithWS =(UserManager) context.getBean("webServiceWithProvider");
        System.out.println(userManagerWithWS.getUserInfo());
        UserManager databaseProvider = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(databaseProvider.getUserInfo());

    }
}
