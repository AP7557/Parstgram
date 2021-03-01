package com.example.parstgram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("nDLmZpUUEyG0cWzAhvU15QVDvwXdGKw87tcUJ4P1")
                .clientKey("sNUOyx1H8Cb2FPxUSFpPK18XXAR48m6U1xoPBROH")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
