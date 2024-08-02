package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
//        UserManager userManager = new UserManager();
//        System.out.println(userManager.getUserInfo());
        UserDataProvider databaseProvider  = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider = new webServiceProvider();
        UserManager userManagerWithWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

    }
}
