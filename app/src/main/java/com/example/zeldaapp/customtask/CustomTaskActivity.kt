package com.example.zeldaapp.customtask

import android.os.Bundle
import androidx.activity.compose.setContent

class CustomTaskActivity : androidx.activity.ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomTaskScreen()
        }
    }

}