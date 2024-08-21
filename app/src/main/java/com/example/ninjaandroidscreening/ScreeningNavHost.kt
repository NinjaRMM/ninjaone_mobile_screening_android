package com.example.ninjaandroidscreening

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ninjaandroidscreening.assessment.pagination.PaginationAssessmentScreen
import com.example.ninjaandroidscreening.dashboard.DashboardScreen

@Composable
fun ScreeningNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "DashboardScreen",
) {
    NavHost(
        navController = navController,
        route = "Route",
        startDestination = startDestination,
        modifier = modifier,
    ) {
        composable("DashboardScreen") {
            DashboardScreen(
                onNavigationAssessmentButtonClick = {},
                onPaginationAssessmentButtonClick = {
                    navController.navigate("PaginationAssessmentScreen")
                },
            )
        }
        composable("PaginationAssessmentScreen") {
            PaginationAssessmentScreen()
        }
    }
}
