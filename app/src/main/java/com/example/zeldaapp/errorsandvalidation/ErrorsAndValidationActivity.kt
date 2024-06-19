package com.example.zeldaapp.errorsandvalidation

import android.os.Bundle
import androidx.activity.compose.setContent

class ErrorsAndValidationActivity : androidx.activity.ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ErrorsAndValidationScreen()
        }
    }

}