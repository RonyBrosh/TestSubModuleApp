package com.sample.rony.testsubmoduleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.appVersion).text = "App Version: ${BuildConfig.VERSION_NAME}"
        findViewById<TextView>(R.id.libraryVersion).text = "App Version: ${BuildConfig.VERSION_NAME}"
    }
}
