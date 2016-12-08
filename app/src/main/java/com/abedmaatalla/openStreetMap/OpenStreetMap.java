package com.abedmaatalla.openStreetMap;

import android.app.Application;
import android.os.StrictMode;

/**
 * Created by am on 12/8/16.
 */

public class OpenStreetMap extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }
}
