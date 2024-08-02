package com.loose.coupling;

import com.tight.coupling.UserDatabase;

public class UserManager {
//    private UserDatabaseProvider userDatabase = new UserDatabaseProvider();

    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider){
        this.userDataProvider = userDataProvider;
    }





    public String getUserInfo(){

        return userDataProvider.getUserDetails();

    }
}
//Dependency Injection [DI] is a design pattern commonly used in object-oriented programming
//where the dependencies of a class are provided externally rather than being created within the class itself
