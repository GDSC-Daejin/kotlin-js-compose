package me.harry.web

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

fun <T> rememberStateOf(value : () -> T) = remember { mutableStateOf(value()) }