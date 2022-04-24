package ru.irinavb.todoapp.navigation

import androidx.navigation.NavHostController
import ru.irinavb.todoapp.util.Action
import ru.irinavb.todoapp.util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = {  action ->
        navController.navigate(route = "list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/${taskId}")
    }
}