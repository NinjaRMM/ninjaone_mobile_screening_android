package com.example.ninjaandroidscreening.assessment.pagination

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun PaginationAssessmentScreen(
    viewModel: PaginationAssessmentViewModel = viewModel(),
    modifier: Modifier = Modifier,
) {

    val list = viewModel.list

    Column {
        list?.forEach {
            HorizontalDivider()
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                Icon(
                    imageVector = Icons.Default.AccountBox,
                    contentDescription = null,
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(it.name)
            }
            Spacer(modifier = Modifier.height(8.dp))
            HorizontalDivider()
        }
    }
}
