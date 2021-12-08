package me.harry.web

import androidx.compose.runtime.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        Content()
    }
}

@Composable
fun Content() {
    var userList by rememberStateOf { listOf<User>() }

    Div {
        var name by rememberStateOf { "" }

        TextInput(value = name) {
            onInput { name = it.value }
        }

        Button(attrs = {
            onClick {
                userList = userList + User(name)
                name = ""
            }
        }) {
            Text("Add User")
        }

        UserList(userList = userList) {
            userList = userList - it
        }

    }
}