package com.example.zeldaapp.errorsandvalidation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ErrorsAndValidationScreen(
    viewModel: ErrorsAndValidationViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TextField(
            placeholder = { Text("Enter a valid e-mail.") },
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            placeholder = { Text("Enter a valid phone number.") },
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            placeholder = { Text("Enter a MFA Code.") },
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = viewModel::validate) {
            Text(
                text = "Validate",
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
        // TODO Expose here with a Text the validation result
    }
}