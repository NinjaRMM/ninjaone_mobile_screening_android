package com.example.ninjaandroidscreening.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.ninjaandroidscreening.R

@Composable
fun DashboardScreen(
    onNavigationAssessmentButtonClick: () -> Unit,
    onPaginationAssessmentButtonClick: () -> Unit,
) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Button(
            onClick = onNavigationAssessmentButtonClick,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(text = stringResource(R.string.navigation_assessment))
        }
        Button(
            onClick = onPaginationAssessmentButtonClick,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(text = stringResource(R.string.pagination_assessment))
        }
    }
}
