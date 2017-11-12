package com.lib.kaushikkislay.loggerlib;

import android.util.Log;

/**
 * Created by kaushikkislay on 12/11/17.
 */

public class loggerlib {

    private static final String TAG = "AWESOME";

    public static void myLogger(String logdata){
        Log.d(TAG,logdata);

    }
}
