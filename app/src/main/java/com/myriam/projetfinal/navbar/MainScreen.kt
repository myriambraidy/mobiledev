package com.myriam.projetfinal.navbar
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.navigation.compose.*
import com.myriam.projetfinal.DailyChallenge.DailyChallengeViewModel
import com.myriam.projetfinal.Exercise.ExerciseViewModel
import com.myriam.projetfinal.screens.ExercisesScreen
import com.myriam.projetfinal.screens.HomeScreen.HomeScreen
import com.myriam.projetfinal.screens.ProfileScreen.ProfileScreen

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val exerciseVm = ExerciseViewModel()
    val dailyVm = DailyChallengeViewModel()
    val tabs = listOf(TabItem.Home, TabItem.Exercises, TabItem.Profile)

    Scaffold(
        bottomBar = { CustomBottomNav(navController, tabs) }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = TabItem.Home.route,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(TabItem.Home.route) { HomeScreen() }
            composable(TabItem.Exercises.route) { ExercisesScreen(exerciseViewModel = exerciseVm, dailychallengevm= dailyVm ) }
            composable(TabItem.Profile.route) { ProfileScreen() }
        }
    }
}

