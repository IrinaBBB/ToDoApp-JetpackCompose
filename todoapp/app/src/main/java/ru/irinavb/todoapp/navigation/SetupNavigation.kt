package ru.irinavb.todoapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import ru.irinavb.todoapp.navigation.destinations.listComposable
import ru.irinavb.todoapp.navigation.destinations.taskComposable
import ru.irinavb.todoapp.util.Constants.LIST_SCREEN

@Composable
fun SetUpNavigation(
    navController: NavHostController
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}