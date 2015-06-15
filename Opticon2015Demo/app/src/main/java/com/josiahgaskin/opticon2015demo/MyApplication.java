package com.josiahgaskin.opticon2015demo;

import com.optimizely.Optimizely;

import android.app.Application;
import android.util.Log;

/**
 * App Subclass
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        String apiKey = getString(R.string.api_key);
        if (apiKey != null && !apiKey.isEmpty()) {
            Optimizely.startOptimizely(apiKey, this);
        } else {
            Log.e("OPT DEMO", "No API key found! Please add your API token in the api_key.xml values file");
        }
    }
}
