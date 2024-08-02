package com.ioc.coupling;

public class webServiceProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "This is the user data from UserDataProvider";
    }
}

//Loose Coupling is a design principle that aims to reduce the dependencies between components within a system.
