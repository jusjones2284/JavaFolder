package com.ioc.coupling;

import com.loose.coupling.UserDataProvider;

public class NewDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "this is the new dbß";
    }
}
