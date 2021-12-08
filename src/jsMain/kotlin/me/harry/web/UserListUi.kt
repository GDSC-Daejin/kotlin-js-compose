package me.harry.web

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul

@Composable
fun UserListItem(user : User, onUserClicked : (User) -> Unit) {
    Li {
        Button(attrs = {
            onClick { onUserClicked(user) }
        }) {
            Text(user.toString())
        }
    }
}

@Composable
fun UserList(userList: List<User>, onUserClicked : (User) -> Unit) {
    Ul {
        userList.forEach { UserListItem(it, onUserClicked) }
    }
}
