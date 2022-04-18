package ru.irinavb.todoapp.data.models

import androidx.compose.ui.graphics.Color
import ru.irinavb.todoapp.ui.theme.HighPriorityColor
import ru.irinavb.todoapp.ui.theme.LowPriorityColor
import ru.irinavb.todoapp.ui.theme.MediumPriorityColor
import ru.irinavb.todoapp.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}