package com.example.dependencyinjectiondemo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

const val TAG = "DependencyInjectionApp"

@HiltAndroidApp
class DependencyInjectionApp : Application() {
  // application class
}