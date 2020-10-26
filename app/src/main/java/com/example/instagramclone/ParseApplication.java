package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        //ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JT94glMU9Qt3T3ZIwPjzy7BFZSK14qUIzCbe46P5")
                .clientKey("RVJYRxsi0KPKewYnvQzh2BvoEDFpL1VuSoFHnSWA")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
