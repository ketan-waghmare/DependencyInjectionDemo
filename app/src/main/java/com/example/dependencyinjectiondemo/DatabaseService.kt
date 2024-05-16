package com.example.dependencyinjectiondemo

import android.util.Log
import javax.inject.Inject

class DatabaseService @Inject constructor() {
    fun log(msg : String) {
        Log.d(TAG,"DatabaseService : $msg");
    }
}