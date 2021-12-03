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

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("uGAa3pv8vf3tXl9mGieBGBOKtl80D3dlkzmBSgwd")
                .clientKey("N9Z2TL9BcYovr0l1VlhX6HjY3yjaTrTp61fDHaDF")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
